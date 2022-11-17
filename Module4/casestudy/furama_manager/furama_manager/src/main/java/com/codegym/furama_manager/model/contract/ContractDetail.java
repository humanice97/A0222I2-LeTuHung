package com.codegym.furama_manager.model.contract;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "contract_detail")
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_detail_id", nullable = false)
    private Long id;
    private String quantity;

    @ManyToOne
    @JoinColumn(name = "contract_id",referencedColumnName = "contract_id")
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "attach_service_id",referencedColumnName = "attach_service_id")
    private AttachService attachService;

}