package com.codegym.furama_manager.model.service;

import com.codegym.furama_manager.model.contract.Contract;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String area;
    private String cost;
    private String maxPeople;
    private String standardRoom;
    @Column(name = "description_other_convenience")
    private String otherConvenience;
    private String poolArea;
    @Column(name = "number_of_floor")
    private String numOfFloor;
    private String serviceCode;
    private Integer status;
    @OneToMany(mappedBy = "service")
    @JsonBackReference
    List<Contract> contractList;

    @ManyToOne
    @JoinColumn(name = "service_type_id", referencedColumnName = "id")
    private ServiceType serviceType;

    @ManyToOne
    @JoinColumn(name = "rent_type_id", referencedColumnName = "id")
    private RentType rentType;
}