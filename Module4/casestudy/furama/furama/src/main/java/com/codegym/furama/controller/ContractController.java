package com.codegym.furama.controller;

import com.codegym.furama.services.contract.impl.ContractServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private ContractServices contractServices;
    @GetMapping("")
    private String getPage(Model model, @RequestParam(value = "page", defaultValue = "0")int page)
    {
        model.addAttribute("contractList",contractServices.getAll(PageRequest.of(page,4)));
        return "contract/list";
    }
}
