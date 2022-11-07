package com.codegym.book.service.impl;

import com.codegym.book.exception.BookRunOut;
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
    public Book findById(Long id) {
        return iBookRepository.findById(id).orElse(null);
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

    @Override
    public void rent(Book book) throws BookRunOut {
        if (book.getQuantity() > 0 && book.getQuantity() != null) {
            book.setQuantity(book.getQuantity() - 1);
            this.iBookRepository.save(book);
        } else {
            throw new BookRunOut();
        }
    }

    @Override
    public void giveBookBack(Book book) {
        book.setQuantity(book.getQuantity() +1);
        iBookRepository.save(book);
    }


}
