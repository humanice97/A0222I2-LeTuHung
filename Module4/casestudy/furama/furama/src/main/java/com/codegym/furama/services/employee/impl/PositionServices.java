package com.codegym.furama.services.employee.impl;

import com.codegym.furama.model.employee.Position;
import com.codegym.furama.repository.employee.IPositionRepository;
import com.codegym.furama.services.employee.IPositionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServices implements IPositionServices {
    @Autowired
    private IPositionRepository iPositionRepository;

    @Override
    public List<Position> findAll() {
        return iPositionRepository.findAll();
    }
}
