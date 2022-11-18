package com.codegym.furama.repository.facility;

import com.codegym.furama.model.facility.FacilityType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFacilityTypeRepository extends JpaRepository<FacilityType,Integer> {

}
