package com.codegym.book.controller;

import com.codegym.book.model.Book;
import com.codegym.book.service.IBookService;
import com.codegym.book.service.impl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BookController {
    final
    BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/list")
    public String home(Model model) {
        model.addAttribute("book", bookService.findAll());
        return "list";
    }

    @GetMapping("/add")
    public String create(Model model) {
        model.addAttribute("book", new Book());
        return "create";
    }

    @PostMapping("/create")
    public String save(Model model, @ModelAttribute("book") Book book, RedirectAttributes redirectAttributes) {
        model.addAttribute("book", bookService.save(book));
        redirectAttributes.addFlashAttribute("msg", "add thanh cong");
        return "redirect:/list";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable("id") Long id) {
        model.addAttribute("book", bookService.findById(id));
        return "detail";
    }

    @GetMapping("/rent/{id}")
    public String rent(@PathVariable Long id, Model model){

        return "redirect:/list";
    }

}

