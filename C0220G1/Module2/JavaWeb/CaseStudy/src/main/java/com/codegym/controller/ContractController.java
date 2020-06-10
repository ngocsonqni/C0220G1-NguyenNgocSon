package com.codegym.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import com.codegym.model.Contract;
import com.codegym.model.Customer;
import com.codegym.model.ServiceResort;
import com.codegym.model.ServiceResort;
import com.codegym.service.ContractService;
import com.codegym.service.CustomerService;
import com.codegym.service.ServiceResortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
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

import java.util.*;

@Controller
public class ContractController {
    @Autowired
    ContractService contractService;
    @Autowired
    CustomerService customerService;
    @Autowired
    ServiceResortService serviceResortService;
    Map<Integer,Cookie> cookieMap=new HashMap<>();

    @GetMapping("/contract-create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView=new ModelAndView("/contract/create");
        modelAndView.addObject("contract",new Contract());
        modelAndView.addObject("customer", customerService.findAll());
        modelAndView.addObject("serviceResort", serviceResortService.findAll());
        return modelAndView;
    }
    @PostMapping("/contract-create")
    public ModelAndView saveContract(@Validated @ModelAttribute("contract") Contract contract,BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView("/contract/create");
        if (!bindingResult.hasFieldErrors()) {
            contractService.save(contract);
            modelAndView.addObject("contract", new Contract());
            modelAndView.addObject("message", "New contract created successfully");
        }else{
            modelAndView.addObject("customer", customerService.findAll());
            modelAndView.addObject("serviceResort", serviceResortService.findAll());
        }
        return modelAndView;
    }

    @GetMapping("/customer-using-service")
    public ModelAndView customerUsingService(){
        List<Customer> customers = new ArrayList<>();
        if (contractService.findAll().size()-1>=0){
            for (int i=0;i<=contractService.findAll().size()-1;i++){
                    customers.add(customerService.findById(contractService.findAll().get(i).getCustomer().getIdKhachHang()));
            }
        }
        ModelAndView modelAndView=new ModelAndView("contract/customerUsingService");
        modelAndView.addObject("customerUsingService",customers);
        return modelAndView;
    }

    @GetMapping("/register-services")
    public ModelAndView showRegisterService(){
        ModelAndView modelAndView=new ModelAndView("contract/registerService");
        modelAndView.addObject("registerServices",serviceResortService.findAll());
        return modelAndView;
    }

    @GetMapping("/register-service/{id}")
    public ModelAndView registerService(@PathVariable int id,HttpServletResponse response){
        ServiceResort serviceResort=serviceResortService.findById(id);
        cookieMap.put(cookieMap.size()+1,new Cookie(Integer.toString(cookieMap.size()),serviceResort.getTenDichVu()));
        for (int i:cookieMap.keySet()){
            response.addCookie(cookieMap.get(i));
        }
        ModelAndView modelAndView=new ModelAndView("contract/registerService");
        modelAndView.addObject("registerServices",serviceResortService.findAll());
        modelAndView.addObject("message","Đã đăng ký thành công dịch vụ, vui lòng chờ admin xác nhận!");
        return modelAndView;
    }


}
