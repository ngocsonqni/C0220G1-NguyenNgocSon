package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customer-create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView=new ModelAndView("/customer/create");
        modelAndView.addObject("customer",new Customer());
        return modelAndView;
    }
    @PostMapping("/customer-create")
    public ModelAndView saveCustomer(@Validated @ModelAttribute("customer") Customer customer, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView("/customer/create");
        if (!bindingResult.hasFieldErrors()){
            customerService.save(customer);
            modelAndView.addObject("customer", new Customer());
            modelAndView.addObject("message", "New customer created successfully");
        }
        return modelAndView;
    }

    @GetMapping("/customers")
    public ModelAndView listCustomers(@RequestParam("s") Optional<String> s, @PageableDefault(value=3) Pageable pageable){
        Page<Customer> customers;
        if(s.isPresent()){
            customers = customerService.findAllByHoTenContaining(s.get(), pageable);
        } else {
            customers = customerService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/customer/list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/customer-edit/{id}")
    public ModelAndView showEditForm(@PathVariable int id){
        Customer customer=customerService.findById(id);
        if(customer !=null){
            ModelAndView modelAndView=new ModelAndView("/customer/edit");
            modelAndView.addObject("customer",customer);
            return modelAndView;
        }else {
            ModelAndView modelAndView=new ModelAndView("/customer/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/customer-edit")
    public ModelAndView updateCustomer(@Validated @ModelAttribute("customer") Customer customer,BindingResult bindingResult){
        ModelAndView modelAndView=new ModelAndView("/customer/edit");
        if (!bindingResult.hasFieldErrors()) {
            customerService.save(customer);
            modelAndView.addObject("customer", customer);
            modelAndView.addObject("message", "customer updated success!!!");
        }
        return modelAndView;
    }

    @GetMapping("/customer-delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable int id){
        Customer customer = customerService.findById(id);
        if(customer != null) {
            ModelAndView modelAndView = new ModelAndView("/customer/delete");
            modelAndView.addObject("customer", customer);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/customer/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/customer-delete")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer, RedirectAttributes redirectAttributes){
        customerService.remove(customer.getIdKhachHang());
        redirectAttributes.addFlashAttribute("message","customer delete success!!!");
        return "redirect:customers";
    }


}
