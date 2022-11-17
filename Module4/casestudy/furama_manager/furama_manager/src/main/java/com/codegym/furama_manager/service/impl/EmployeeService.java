package com.codegym.furama_manager.service.impl;

import com.codegym.furama_manager.model.employee.Employee;
import com.codegym.furama_manager.repository.IEmployeeRepository;
import com.codegym.furama_manager.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    IEmployeeRepository iEmployeeRepository;

    @Override
    public List<Employee> findAll() {
        return iEmployeeRepository.findAll();
    }
}
