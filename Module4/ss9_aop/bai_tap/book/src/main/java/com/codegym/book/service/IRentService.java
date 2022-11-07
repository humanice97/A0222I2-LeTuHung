package com.codegym.book.service;

import com.codegym.book.model.Book;
import com.codegym.book.model.Rent;

import java.util.List;

public interface IRentService {
    List<Rent> findAll();

    Rent findById(Long id);

    void saveBookCode(Book book);

    void delete(Rent rent);


}
