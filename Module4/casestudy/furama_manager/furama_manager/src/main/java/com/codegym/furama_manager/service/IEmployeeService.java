package com.codegym.furama_manager.service;

import com.codegym.furama_manager.model.customer.Customer;
import com.codegym.furama_manager.model.employee.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
}
