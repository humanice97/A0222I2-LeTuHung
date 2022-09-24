package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MoneyController {
    @GetMapping("/money")
    public String showForm(){
        return "index";
    }
    @PostMapping("/money")
    public String getMoney(@RequestParam("input") Integer input,
                           @RequestParam("select1") String select1,
                           @RequestParam("select2") String select2,
                           Model model) {
        if(select1.equals(select2)){
            model.addAttribute("result",input);
        }
        if(select1.equals("a") && select2.equals("b")){
            int result = input*24000;
            model.addAttribute("result",result);
            model.addAttribute("vnd","VND");
        }
        if(select1.equals("b") && select2.equals("a")){
            int result = input/24000;
            model.addAttribute("result",result);
            model.addAttribute("usd","USD");
        }
        return "index";
    }
}
