package com.codegym.furama_manager.model.contract;

import com.codegym.furama_manager.model.customer.Customer;
import com.codegym.furama_manager.model.employee.Employee;
import com.codegym.furama_manager.model.service.Service;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "contract")
public class Contract {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id", nullable = false)
    private Long id;
    @Column(name = "date_start")
    private String dateStart;
    @Column(name = "date_end")
    private String dateEnd;
    private String deposit;
    @Column(name = "total_money")
    private String totalMoney;

    @ManyToOne
    @JoinColumn(name = "employee_id",referencedColumnName = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "customer_id",referencedColumnName = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "service_id",referencedColumnName = "id")
    private Service service;


    @OneToMany(mappedBy = "contract")
    private List<ContractDetail> contractDetails;

}