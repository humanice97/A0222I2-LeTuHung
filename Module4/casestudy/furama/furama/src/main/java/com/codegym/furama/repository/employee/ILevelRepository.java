package com.codegym.furama.repository.employee;

import com.codegym.furama.model.employee.Level;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILevelRepository extends JpaRepository<Level,Integer> {
}
