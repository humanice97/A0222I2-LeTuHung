package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @RequestMapping(value = "/calculator", method = RequestMethod.GET)
    public String home() {
        return "index";
    }

    @PostMapping("/save")
    public String add(@RequestParam int input1, @RequestParam int input2, @RequestParam String button, Model model) {
        switch (button) {
            case "add":
                model.addAttribute("result", input1 + input2);
                break;
            case "sub":
                model.addAttribute("result", input1 - input2);
                break;
            case "multi":
                model.addAttribute("result", input1 * input2);
                break;
            case "div":
                model.addAttribute("result", input1 / input2);
                break;
        }
        return "index";
    }
}
