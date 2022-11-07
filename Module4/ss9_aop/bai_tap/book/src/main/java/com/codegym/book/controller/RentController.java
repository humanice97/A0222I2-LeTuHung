package com.codegym.book.controller;

import com.codegym.book.exception.NotFoundRentCode;
import com.codegym.book.model.Book;
import com.codegym.book.model.Rent;
import com.codegym.book.service.IBookService;
import com.codegym.book.service.IRentService;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RentController {
    final
    IBookService iBookService;
    final
    IRentService iRentService;

    public RentController(IBookService iBookService, IRentService iRentService) {
        this.iBookService = iBookService;
        this.iRentService = iRentService;
    }


    @GetMapping("/giveBookBack/{id}")
    public String giveBookBack(@PathVariable Long id) throws NotFoundRentCode {
        Rent rent = iRentService.findById(id);
        iRentService.delete(rent);
        this.iBookService.giveBookBack(rent.getBook());
        return "redirect:/list";
    }

    @ExceptionHandler(NotFoundRentCode.class)
    public String showErrPage() {
        return "error";
    }

}
