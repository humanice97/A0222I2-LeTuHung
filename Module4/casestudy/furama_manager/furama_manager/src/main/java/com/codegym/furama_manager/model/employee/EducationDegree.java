package com.codegym.furama_manager.model.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "education_degree")
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "education_degree_id", nullable = false)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "educationDegree")
    @JsonBackReference
    private List<Employee> employees;


}