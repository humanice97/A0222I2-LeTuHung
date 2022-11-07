package com.codegym.giohang.service;

import com.codegym.giohang.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
