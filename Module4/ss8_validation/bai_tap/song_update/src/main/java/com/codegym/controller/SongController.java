package com.codegym.controller;

import com.codegym.model.Song;
import com.codegym.service.impl.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class SongController {
    @Autowired
    SongService songService;

    @GetMapping("/home")
    public String getList(Model model) {
        model.addAttribute("song", songService.findAll());
        return "list";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("song", new Song());
        return "create";
    }

    @PostMapping("/save")
    public String save(@Validated @ModelAttribute("song") Song song, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
//            model.addAttribute("song",new Song());
            return "create";
        } else {
            songService.save(song);
            redirectAttributes.addFlashAttribute("msg", "add thanh cong");
            return "redirect:/home";
        }
    }

    @GetMapping("/song/{id}/delete")
    public String ShowFormDelete(@PathVariable Long id, Model model) {
        model.addAttribute("song", songService.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("song") Song song, RedirectAttributes redirectAttributes) {
        songService.delete(song.getId());
        redirectAttributes.addFlashAttribute("msg", "delete thanh cong");
        return "redirect:/home";
    }

    @GetMapping("/song/{id}/update")
    public String ShowFormUpdate(@PathVariable Long id, Model model) {
        model.addAttribute("song", songService.findById(id));
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("song") Song song, RedirectAttributes redirectAttributes) {
        songService.save(song);
        redirectAttributes.addFlashAttribute("msg", "update thanh cong");
        return "redirect:/home";
    }


}
