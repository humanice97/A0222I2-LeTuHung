package com.codegym.furama_manager.repository;

import com.codegym.furama_manager.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer,Long> {
}
