package com.codegym.furama.model.contract;

import com.codegym.furama.model.customer.Customer;
import com.codegym.furama.model.employee.Employee;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "hop_dong")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hop_dong")
    private Integer id;
    @Column(name = "ngay_lam_hop_dong")
    private Date startDate;
    @Column(name = "ngay_ket_thuc")
    private Date endDate;
    @Column(name = "tien_dat_coc")
    private Float deposit;
    @OneToMany(mappedBy = "contract")
    private List<ContractDetail> contractDetails;
    @ManyToOne
    @JoinColumn(name = "ma_nhan_vien")
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "ma_khach_hang")
    private Customer customer;


}
