package com.codegym.furama.model.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "trinh_do")
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_trinh_do")
    private Integer id;
    @Column(name = "ten_trinh_do")
    private String name;
    @OneToMany(mappedBy = "level")
    private List<Employee> employees;

}
