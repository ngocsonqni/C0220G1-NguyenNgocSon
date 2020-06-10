package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import com.codegym.service.ProductTypeService;
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
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    ProductTypeService productTypeService;

    @GetMapping("/product-create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView=new ModelAndView("/product/create");
        modelAndView.addObject("product",new Product());
        modelAndView.addObject("productType",productTypeService.findAll());
        return modelAndView;
    }
//    @PostMapping("/product-create")
//    public ModelAndView saveProduct(@Validated @ModelAttribute("product") Product product, BindingResult bindingResult){
//        ModelAndView modelAndView = new ModelAndView("/product/create");
//        if (!bindingResult.hasFieldErrors()){
//            productService.save(product);
//            modelAndView.addObject("product", new Product());
//            modelAndView.addObject("message", "New product created successfully");
//        }else{
//            modelAndView.addObject("productType",productTypeService.findAll());
//        }
//        return modelAndView;
//    }

    @PostMapping("/product-creates")
    public String saveProduct(@Validated @ModelAttribute("product") Product product, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes){
        if (!bindingResult.hasFieldErrors()){
            productService.save(product);
            redirectAttributes.addFlashAttribute("message", "New product created successfully");
            return "redirect:products";
        }else{
            model.addAttribute("productType",productTypeService.findAll());
            return "/product/create";
        }

    }
    @GetMapping("/products")
    public ModelAndView listProducts(@RequestParam("s") Optional<String> s, @PageableDefault(value=3) Pageable pageable){
        Page<Product> products;
        if(s.isPresent()){
            products = productService.findAllByTenHangContaining(s.get(),pageable);
        } else {
            products = productService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/product/list");
        modelAndView.addObject("products", products);
        return modelAndView;
    }

    @GetMapping("/product-edit/{id}")
    public ModelAndView showEditForm(@PathVariable int id){
        Product product=productService.findById(id);
        if(product !=null){
            ModelAndView modelAndView=new ModelAndView("/product/edit");
            modelAndView.addObject("product",product);
            modelAndView.addObject("productType",productTypeService.findAll());
            return modelAndView;
        }else {
            ModelAndView modelAndView=new ModelAndView("/product/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/product-edit")
    public ModelAndView updateProduct(@Validated @ModelAttribute("product") Product product, BindingResult bindingResult){
        ModelAndView modelAndView=new ModelAndView("/product/edit");
        if (!bindingResult.hasFieldErrors()) {
            productService.save(product);
            modelAndView.addObject("product", product);

            modelAndView.addObject("message", "product updated success!!!");
        }
        else{

            modelAndView.addObject("productType",productTypeService.findAll());
        }
        return modelAndView;
    }

    @GetMapping("/product-delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable int id){
        Product product = productService.findById(id);
        if(product != null) {
            ModelAndView modelAndView = new ModelAndView("/product/delete");
            modelAndView.addObject("product", product);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/product/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/product-delete")
    public String deleteProduct(@ModelAttribute("product") Product product, RedirectAttributes redirectAttributes){
        productService.remove(product.getMaHang());
        redirectAttributes.addFlashAttribute("message","product delete success!!!");
        return "redirect:products";
    }
}
