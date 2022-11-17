package com.codegym.furama_manager.service;

import com.codegym.furama_manager.model.customer.Customer;
import com.codegym.furama_manager.service.impl.CustomerService;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

}
