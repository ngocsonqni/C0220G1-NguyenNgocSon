package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.model.ServiceResort;
import com.codegym.service.CustomerService;
import com.codegym.service.ServiceResortService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class ServiceResortController {
    @Autowired
    ServiceResortService serviceResortService;

    @GetMapping("/serviceResort-create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView=new ModelAndView("/serviceResort/create");
        modelAndView.addObject("serviceResort",new ServiceResort());
        return modelAndView;
    }
    @PostMapping("/serviceResort-create")
    public ModelAndView saveServiceResort(@Validated @ModelAttribute("serviceResort") ServiceResort serviceResort,BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView("/serviceResort/create");
        if (!bindingResult.hasFieldErrors()) {
            serviceResortService.save(serviceResort);
            modelAndView.addObject("serviceResort", new ServiceResort());
            modelAndView.addObject("message", "New service resort created successfully");
        }
        return modelAndView;
    }

    @GetMapping("/serviceResorts")
    public ModelAndView listServiceResorts(@RequestParam("s") Optional<String> s, @PageableDefault(value=3) Pageable pageable){
        Page<ServiceResort> serviceResorts;
        if(s.isPresent()){
            serviceResorts = serviceResortService.findAllBytenDichVuContaining(s.get(), pageable);
        } else {
            serviceResorts = serviceResortService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/serviceResort/list");
        modelAndView.addObject("serviceResorts", serviceResorts);
        return modelAndView;
    }

    @GetMapping("/serviceResort-edit/{id}")
    public ModelAndView showEditForm(@PathVariable int id){
        ServiceResort serviceResort=serviceResortService.findById(id);
        if(serviceResort !=null){
            ModelAndView modelAndView=new ModelAndView("/serviceResort/edit");
            modelAndView.addObject("serviceResort",serviceResort);
            return modelAndView;
        }else {
            ModelAndView modelAndView=new ModelAndView("/serviceResort/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/serviceResort-edit")
    public ModelAndView updateServiceResort(@Validated @ModelAttribute("serviceResort") ServiceResort serviceResort,BindingResult bindingResult){
        ModelAndView modelAndView=new ModelAndView("/serviceResort/edit");
        if (!bindingResult.hasFieldErrors()){
            serviceResortService.save(serviceResort);
            modelAndView.addObject("serviceResort",serviceResort);
            modelAndView.addObject("message","service resort updated success!!!");
        }
        return modelAndView;
    }

    @GetMapping("/serviceResort-delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable int id){
        ServiceResort serviceResort = serviceResortService.findById(id);
        if(serviceResort != null) {
            ModelAndView modelAndView = new ModelAndView("/serviceResort/delete");
            modelAndView.addObject("serviceResort", serviceResort);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/serviceResort/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/serviceResort-delete")
    public String deleteServiceResort(@ModelAttribute("serviceResort") ServiceResort serviceResort, RedirectAttributes redirectAttributes){
        serviceResortService.remove(serviceResort.getIdDichVu());
        redirectAttributes.addFlashAttribute("message","service resort delete success!!!");
        return "redirect:serviceResorts";
    }
}
