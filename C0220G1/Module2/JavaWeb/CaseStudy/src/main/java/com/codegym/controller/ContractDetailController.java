package com.codegym.controller;

import com.codegym.model.Contract;
import com.codegym.model.ContractDetail;
import com.codegym.service.ContractDetailService;
import com.codegym.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContractDetailController {
    @Autowired
    ContractDetailService contractDetailService;
    @Autowired
    ContractService contractService;

    @GetMapping("/contractDetail-create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView=new ModelAndView("/contractDetail/create");
        modelAndView.addObject("contractDetail",new ContractDetail());
        modelAndView.addObject("contract",contractService.findAll());
        return modelAndView;
    }
    @PostMapping("/contractDetail-create")
    public ModelAndView saveContractDetail(@Validated @ModelAttribute("contractDetail") ContractDetail contractDetail,BindingResult bindingResult){

        ModelAndView modelAndView = new ModelAndView("/contractDetail/create");
        if (!bindingResult.hasFieldErrors()) {
            contractDetailService.save(contractDetail);
            modelAndView.addObject("contractDetail", new ContractDetail());
            modelAndView.addObject("message", "New contract detail created successfully");
        }else{
            modelAndView.addObject("contract",contractService.findAll());
        }
        return modelAndView;
    }
}
