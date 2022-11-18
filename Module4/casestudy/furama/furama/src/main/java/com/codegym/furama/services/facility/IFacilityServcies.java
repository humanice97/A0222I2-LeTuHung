package com.codegym.furama.services.facility;

import com.codegym.furama.model.employee.Employee;
import com.codegym.furama.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IFacilityServcies {
    List<Facility> findAll();
    Page findByName(String name, Pageable pageable);
    void save (Facility facility);
    void delete(Facility facility);
    Facility getFaciltyById(int id);
    Page<Facility> getAll(Pageable pageable);
}
