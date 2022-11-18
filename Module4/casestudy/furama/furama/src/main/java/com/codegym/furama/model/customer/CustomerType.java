package com.codegym.furama.model.customer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "loai_khach")
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_loai_khach")
    private Integer id;
    @Column(name = "ten_loai_khach")
    private String name;
    @OneToMany(mappedBy = "customerType")
    private List<Customer> customers;

}
