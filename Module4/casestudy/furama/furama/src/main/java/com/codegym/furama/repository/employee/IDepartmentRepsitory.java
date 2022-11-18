package com.codegym.furama.repository.employee;

import com.codegym.furama.model.employee.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartmentRepsitory extends JpaRepository<Department,Integer> {
}
