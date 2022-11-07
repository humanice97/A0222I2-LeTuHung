package com.codegym.giohang.repository;

import com.codegym.giohang.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {
}
