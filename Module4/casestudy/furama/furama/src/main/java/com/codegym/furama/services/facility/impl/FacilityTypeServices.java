package com.codegym.furama.services.facility.impl;

import com.codegym.furama.model.facility.FacilityType;
import com.codegym.furama.repository.facility.IFacilityTypeRepository;
import com.codegym.furama.services.facility.IFacilityTypeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FacilityTypeServices implements IFacilityTypeServices {
    @Autowired
    private IFacilityTypeRepository iFacilityTypeRepository;
    @Override
    public List<FacilityType> findAll() {
        return iFacilityTypeRepository.findAll();
    }
}
