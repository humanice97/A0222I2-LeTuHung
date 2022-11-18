package com.codegym.furama.model.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "vi_tri")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_vi_tri")
    private Integer id;
    @Column(name = "ten_vi_tri")
    private String name;
    @OneToMany(mappedBy = "position")
    private List<Employee> employees;


}
