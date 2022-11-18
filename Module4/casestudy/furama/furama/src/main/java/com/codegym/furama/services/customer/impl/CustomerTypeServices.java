package com.codegym.furama.services.customer.impl;

import com.codegym.furama.model.customer.CustomerType;
import com.codegym.furama.repository.customer.ICustomerTypeRepository;
import com.codegym.furama.services.customer.ICustomerTypeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServices implements ICustomerTypeServices {
    @Autowired
    private ICustomerTypeRepository iCustomerTypeRepository;
    @Override
    public List<CustomerType> findAll() {
        return iCustomerTypeRepository.findAll();
    }
}
