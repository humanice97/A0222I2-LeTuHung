package com.codegym.furama.model.facility;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "loai_dich_vu")
public class FacilityType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_loai_dich_vu")
    private  Integer id;
    @Column(name = "ten_Loai_divh_vu")
    private String name;
    @OneToMany(mappedBy = "facilityType")
    private List<Facility> facilities;

}
