package com.codegym.product.service;

import com.codegym.product.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();

    Product save(Product product);

    void delete(Long id);

    Optional<Product> findById(Long id);


}
