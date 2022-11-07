package com.codegym.giohang.service.impl;

import com.codegym.giohang.model.Product;
import com.codegym.giohang.repository.IProductRepository;
import com.codegym.giohang.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepository iProductRepository;

    @Override
    public Iterable<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return iProductRepository.findById(id);
    }
}
