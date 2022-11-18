package com.codegym.furama.services.customer;

import com.codegym.furama.model.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeServices {
    List<CustomerType> findAll();
}
