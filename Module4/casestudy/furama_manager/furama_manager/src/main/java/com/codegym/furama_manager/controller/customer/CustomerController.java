package com.codegym.furama_manager.controller.customer;

import com.codegym.furama_manager.service.impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("")
    public String showListCustomer(@RequestParam(value = "page",defaultValue = "0")int page, Model model) {
        model.addAttribute("customerList", customerService.findAll(PageRequest.of(page,4)));
        return "/listCus";
    }


}
