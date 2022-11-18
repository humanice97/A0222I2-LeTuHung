package com.codegym.furama.model.facility;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "kieu_thue")
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_kieu_thue")
    private  Integer id;
    @Column(name = "ten_kieu_thue")
    private String name;
    @OneToMany(mappedBy = "rentType")
    private List<Facility> facilities;


}
