package com.codegym.furama.model.facility;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "dich_vu")
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_dich_vu")
    private  Integer id;
    @Column(name = "ten_dich_vu")
    private String name;
    @Column(name = "dien_tich")
    private Integer area;
    @Column(name = "chi_phi_thue")
    private Double cost;
    @Column(name = "so_nguoi_toi_da")
    private Integer maxPeople;
    @Column(name = "tieu_chuan_phong")
    private String standardRoom;
    @Column(name = "mo_ta_tien_nghi_khac")
    private String descriptionOtherConvenience;
    @Column(name = "dien_tich_ho_boi")
    private Double poolArea;
    @Column(name = "so_tang")
    private Integer numberOfFloors;
    @ManyToOne
    @JoinColumn(name = "ma_kieu_thue")
    private RentType rentType;
    @ManyToOne
    @JoinColumn(name = "ma_loai_dich_vu")
    private FacilityType facilityType;

}
