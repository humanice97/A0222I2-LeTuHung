package com.codegym.furama_manager.repository;

import com.codegym.furama_manager.model.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee,Long> {
}
