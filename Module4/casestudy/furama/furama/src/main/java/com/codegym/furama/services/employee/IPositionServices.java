package com.codegym.furama.services.employee;

import com.codegym.furama.model.employee.Position;

import java.util.List;

public interface IPositionServices {
    List<Position> findAll();
}
