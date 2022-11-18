package com.codegym.furama_manager.service.impl;

import com.codegym.furama_manager.model.customer.Customer;
import com.codegym.furama_manager.repository.ICustomerRepository;
import com.codegym.furama_manager.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepository iCustomerRepository;
    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return iCustomerRepository.findAll(pageable);
    }

}
