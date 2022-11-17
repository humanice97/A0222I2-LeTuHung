package com.codegym.furama_manager.model.customer;

import com.codegym.furama_manager.model.contract.Contract;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false)
    private Long id;
    private String name;
    private String birthday;
    private Integer gender;
    @Column(name = "id_card")
    private String idCard;
    private String phone;
    private String email;
    private String address;
    @Column(name = "customer_code")
    private String customerCode;
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "customer_type_id",referencedColumnName = "customer_type_id")
    private CustomerType customerType;

    @OneToMany(mappedBy = "customer")
    private List<Contract> contractList;

}