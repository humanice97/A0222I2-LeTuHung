package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TranslateController {
    @GetMapping("/translate")
    public String showForm() {
        return "index";
    }

    @PostMapping("translate")
    public String getTranslate(@RequestParam("input") String name, Model model) {
        switch (name){
            case "Hello":
                model.addAttribute("result","Xin chao");
                break;
            case "Goodbye":
                model.addAttribute("result","Tam biet");
                break;
            default:
                model.addAttribute("result","Khong ton tai");
        }
        return "index";
    }
}
