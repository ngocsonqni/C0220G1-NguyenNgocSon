package com.codegym.controller;


import com.codegym.model.Cart;
import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;
    Cart cart=new Cart();
    Map<Long,Integer> counts=new HashMap<>();
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("products",productService.findAll());
        return "index";
    }

    @RequestMapping("/showProduct/{id}")
    public ModelAndView show(@PathVariable("id") long id){
        ModelAndView modelAndView=new ModelAndView("view");
        modelAndView.addObject("product",productService.findById(id));
        return modelAndView;
    }

    @GetMapping("/show-cart")
    public ModelAndView updateCart(@RequestParam("cart.id") List<Long> listId, @RequestParam("count") List<Integer> listCount ){
        for (int i=0;i<listId.size();i++){
            cart.addCounts(listId.get(i),listCount.get(i));
        }
        ModelAndView modelAndView=new ModelAndView("cart");
        modelAndView.addObject("cart",cart.getProducts());
        modelAndView.addObject("count",new ArrayList<>(cart.getCount()));
        modelAndView.addObject("totalPay",cart.totalPay());
        return modelAndView;
    }

    @PostMapping("/show-cart")
    public ModelAndView showCart(@RequestParam long id){

        if (cart.findById(id)==null){
            Product product=productService.findById(id);
            cart.addToCart(id,product);
            cart.addCounts(id,1);
        }else{
            cart.addCounts(id,cart.findCount(id)+1);
        }
        ModelAndView modelAndView=new ModelAndView("cart");
        modelAndView.addObject("cart",cart.getProducts());
        modelAndView.addObject("count",new ArrayList<>(cart.getCount()));
        modelAndView.addObject("totalPay",cart.totalPay());
        return modelAndView;
    }
}
