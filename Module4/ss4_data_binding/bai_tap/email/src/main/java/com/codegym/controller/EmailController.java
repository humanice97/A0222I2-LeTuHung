package com.codegym.controller;

import com.codegym.model.Email;
import com.codegym.service.IEmailService;
import com.codegym.service.impl.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmailController {
    private IEmailService iEmailService;

    @Autowired
    public EmailController(IEmailService iEmailService) {
        this.iEmailService = iEmailService;
    }

    @GetMapping("index")
    public String home(Model model) {
        List<String> language = iEmailService.getLanguages();
        List<String> pageSize = iEmailService.getPageSize();
        model.addAttribute("language", language);
        model.addAttribute("pageSize", pageSize);
        model.addAttribute("email", new Email());
        return "index";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("email") Email email, Model model) {
        model.addAttribute("language", email.getLanguage());
        model.addAttribute("pageSize", email.getPageSize());
        model.addAttribute("filter", email.getFilter());
        model.addAttribute("signature", email.getSignature());
        return "info";
    }
}
