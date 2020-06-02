package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;
    @GetMapping("/")
    public  String index(Model model){
        model.addAttribute("products",productService.findAll());
        return "index";
    }

    @GetMapping("/product/create")
    public String create(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }

    @PostMapping("/product/save")
    public String save(Product product,RedirectAttributes redirect){
            product.setId((int)(Math.random() * 10000));
            productService.save(product);
            redirect.addFlashAttribute("success","Saved product successfully!");
            return "redirect:/";
    }

    @GetMapping("/product/edit/{id}")
    public String edit(@PathVariable int id,Model model){
        model.addAttribute("product",productService.findById(id));
        return "edit";
    }

    @PostMapping("/product/update")
    public String update(Product product,RedirectAttributes redirect){
        productService.update(product.getId(),product);
        redirect.addFlashAttribute("success","Modified product successfully!");
        return "redirect:/";
    }

    @GetMapping("/product/delete")
    public String delete(@RequestParam int id, Model model){
        model.addAttribute("product",productService.findById(id));
        return "delete";
    }

    @PostMapping("/product/delete")
    public String delete(Product product,RedirectAttributes redirect){
        productService.remove(product.getId());
        redirect.addFlashAttribute("success","Removed customer successfully!");
        return "redirect:/";
    }

    @GetMapping("/product/view/{id}")
    public String viewById(@PathVariable int id,Model model){
        model.addAttribute("product",productService.findById(id));
        return "view";
    }

    @GetMapping("product/viewName")
    public  String viewByName(@RequestParam String name,RedirectAttributes redirect){
        List<Product> product=productService.findByName(name);
        redirect.addFlashAttribute("name",name);
        if (product.size()==0){
            redirect.addFlashAttribute("searching","No matches found");
        }else{
            redirect.addFlashAttribute("viewByName",product);
        }
        return "redirect:/";
    }












}
