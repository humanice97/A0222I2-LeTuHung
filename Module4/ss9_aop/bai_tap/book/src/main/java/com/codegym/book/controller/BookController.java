package com.codegym.book.controller;

import com.codegym.book.exception.BookRunOut;
import com.codegym.book.model.Book;
import com.codegym.book.model.Rent;
import com.codegym.book.service.impl.BookService;
import com.codegym.book.service.impl.RentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BookController {
    final
    BookService bookService;
    final
    RentService rentService;

    public BookController(BookService bookService, RentService rentService) {
        this.bookService = bookService;
        this.rentService = rentService;
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
    public String rent(@PathVariable Long id, RedirectAttributes redirectAttributes) throws BookRunOut {
        Book book = bookService.findById(id);
        this.bookService.rent(book);
        this.rentService.saveBookCode(book);
        redirectAttributes.addFlashAttribute("msg", "thue thanh cong");
        return "redirect:/list";
    }

    @GetMapping("/rentList")
    public String showListRent(Model model) {
        model.addAttribute("rent", rentService.findAll());
        return "listRent";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteById(id);
        return "redirect:/list";
    }
   @ExceptionHandler(BookRunOut.class)
    public String showErr(){
        return "error";
   }

}

