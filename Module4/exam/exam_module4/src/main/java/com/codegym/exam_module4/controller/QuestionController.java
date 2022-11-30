package com.codegym.exam_module4.controller;

import com.codegym.exam_module4.model.QuestionContent;
import com.codegym.exam_module4.service.impl.QuestionContentService;
import com.codegym.exam_module4.service.impl.QuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionContentService questionContentService;
    @Autowired
    QuestionTypeService questionTypeService;

    @GetMapping
    private String getPage(@PageableDefault(value = 4) Pageable pageable,
                           Model model) {
        Page<QuestionContent> questionContents = questionContentService.findAll(pageable);
        model.addAttribute("questionList", questionContents);
        return "list";
    }

    @GetMapping(value = "delete")
    private String deleteQuestion(@RequestParam(name = "id") Long id) {
        questionContentService.delete(questionContentService.getQuestionContentById(id));
        return "redirect:/question";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("questionList", new QuestionContent());
        model.addAttribute("questionTypeList", questionTypeService.findAll());
        return "create";
    }

    @PostMapping(value = "/save")
    private String saveEmployee(@Valid @ModelAttribute("questionList") QuestionContent questionContent, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("questionTypeList", questionTypeService.findAll());
            return "create";
        } else {
            model.addAttribute("questionTypeList", questionTypeService.findAll());
            questionContentService.save(questionContent);
            redirectAttributes.addFlashAttribute("msg", "add thanh cong");
            return "redirect:/question";
        }
    }

    @GetMapping("/update")
    public String showFormUpdate(@RequestParam(name = "id", defaultValue = "0") Long id,Model model) {
        model.addAttribute("questionListUpdate", questionContentService.getQuestionContentById(id));
        model.addAttribute("questionTypeList", questionTypeService.findAll());
        return "update";
    }



}
