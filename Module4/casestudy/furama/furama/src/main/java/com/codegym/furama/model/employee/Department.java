package com.codegym.furama.model.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "bo_phan")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_bo_phan")
    private Integer id;
    @Column(name = "ten_bo_phan")
    private String name;

    @JsonBackReference
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

}
