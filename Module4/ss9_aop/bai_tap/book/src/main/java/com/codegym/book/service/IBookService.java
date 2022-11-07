package com.codegym.book.service;

import com.codegym.book.exception.BookRunOut;
import com.codegym.book.model.Book;
import com.codegym.book.model.Rent;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    List<Book> findAll();

    Book findById(Long id);

    void deleteById(Long id);

    Object save(Book book);

    void rent(Book book) throws BookRunOut;

    void giveBookBack(Book book);


}
