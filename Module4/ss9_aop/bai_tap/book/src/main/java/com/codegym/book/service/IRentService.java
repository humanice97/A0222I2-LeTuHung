package com.codegym.book.service;

import com.codegym.book.model.Rent;

import java.util.List;

public interface IRentService {
    List<Rent> findAll();

    Rent findById(Long id);

    void saveBookCode(Rent rent);

    void delete(Rent rent);
}
