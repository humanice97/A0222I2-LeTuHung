package com.codegym.furama_manager.model.customer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "customer_type")
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_type_id", nullable = false)
    private Long id;
    @Column(name = "customer_type_name")
    private String name;

    @OneToMany(mappedBy = "customerType")
    private List<Customer> customerList;

}