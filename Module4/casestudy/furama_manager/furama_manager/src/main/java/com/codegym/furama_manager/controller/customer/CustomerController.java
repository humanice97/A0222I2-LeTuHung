package com.codegym.furama_manager.controller.customer;

import com.codegym.furama_manager.service.impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("")
    public String showListCustomer(Model model) {
        model.addAttribute("customerList", customerService.findAll());
        return "/listCus";
    }


}
