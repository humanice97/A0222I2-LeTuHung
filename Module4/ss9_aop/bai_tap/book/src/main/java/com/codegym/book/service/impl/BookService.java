package com.codegym.book.service.impl;

import com.codegym.book.model.Book;
import com.codegym.book.repository.IBookRepository;
import com.codegym.book.service.IBookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService implements IBookService {
    final
    IBookRepository iBookRepository;

    public BookService(IBookRepository iBookRepository) {
        this.iBookRepository = iBookRepository;
    }

    @Override
    public List<Book> findAll() {
        return iBookRepository.findAll();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return iBookRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        iBookRepository.deleteById(id);
    }

    @Override
    public Object save(Book book) {
        iBookRepository.save(book);
        return null;
    }
}
