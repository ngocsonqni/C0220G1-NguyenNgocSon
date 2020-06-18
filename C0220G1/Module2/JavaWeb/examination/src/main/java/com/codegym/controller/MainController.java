package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String goLogin(){
        return "index";
    }
    @GetMapping("/listHocVien")
    public String listHocVien(){
        return "product/listHocVien";
    }
}

