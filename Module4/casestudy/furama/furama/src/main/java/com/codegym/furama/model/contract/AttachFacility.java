package com.codegym.furama.model.contract;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "dich_vu_di_kem")
public class AttachFacility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_dich_vu_di_kem")
    private Integer id;
    @Column(name = "ten_dich_vu_di_kem")
    private  String name;
    @Column(name = "gia")
    private Float price;
    @Column(name = "don_vi")
    private String unit;
    @Column(name = "trang_thai")
    private String status;
    @OneToMany(mappedBy = "attachFacility")
    private List<ContractDetail> contractDetails;


}
