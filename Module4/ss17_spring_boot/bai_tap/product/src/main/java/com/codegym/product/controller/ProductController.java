package com.codegym.product.controller;

import com.codegym.product.model.Product;
import com.codegym.product.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/list")
    public String home(Model model) {
        model.addAttribute("listProduct", productService.findAll());
        return "home";
    }

    @GetMapping("/product/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/save")
    public String save(Product product) {
        productService.save(product);
        return "redirect:/list";
    }

    @GetMapping("/product/{id}/delete")
    public String deleteShow(@PathVariable Long id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(Product product) {
        productService.delete(product.getId());
        return "redirect:/list";
    }

    @GetMapping("/product/{id}/update")
    public String updateShow(@PathVariable Long id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "update";
    }

    @PostMapping("/update")
    public String update(Product product) {
        productService.save(product);
        return "redirect:/list";
    }


}
