package com.codegym.furama_manager.service;

import com.codegym.furama_manager.model.customer.Customer;
import com.codegym.furama_manager.service.impl.CustomerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);

}
