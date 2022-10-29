package com.codegym.book.service;

import com.codegym.book.model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    List<Book> findAll();

    Optional<Book> findById(Long id);

    void deleteById(Long id);

    Object save(Book book);
}
