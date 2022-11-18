package com.codegym.furama.model.contract;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "hop_dong_chi_tiet")
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hop_dong_chi_tiet")
    private Integer id;
    @Column(name = "so_luong")
    private Integer quantity;
    @ManyToOne
    @JoinColumn(name = "ma_dich_vu_di_kem")
    private AttachFacility attachFacility;
    @ManyToOne
    @JoinColumn(name = "ma_hop_dong")
    private Contract contract;
}
