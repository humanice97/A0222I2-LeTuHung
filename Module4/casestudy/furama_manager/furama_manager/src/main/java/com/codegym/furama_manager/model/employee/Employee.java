package com.codegym.furama_manager.model.employee;

import com.codegym.furama_manager.model.contract.Contract;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private Long id;
    private String name;
    private String birthday;
    private String idCard;
    private String salary;
    private String phone;
    private String email;
    private String address;
    private Integer status;

    @OneToMany(mappedBy = "employee")
    private List<Contract> contractList;

    @ManyToOne
    @JoinColumn(name = "position_id",referencedColumnName = "position_id")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "division_id",referencedColumnName = "division_id")
    private Division division;

    @ManyToOne
    @JoinColumn(name = "education_degree_id",referencedColumnName = "education_degree_id")
    private EducationDegree educationDegree;
}