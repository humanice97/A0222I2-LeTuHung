package com.codegym.furama.services.employee;

import com.codegym.furama.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEmployeeServices {
    List<Employee> findAll();
    Page<Employee> findByName(String name, Pageable pageable);
    void save (Employee employee);
    void delete(Employee employee);
    Employee getEmployeeById(int id);
    Page<Employee> getAll(Pageable pageable);
}
