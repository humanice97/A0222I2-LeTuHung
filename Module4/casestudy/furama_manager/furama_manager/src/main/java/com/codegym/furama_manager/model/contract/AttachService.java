package com.codegym.furama_manager.model.contract;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "attach_service")
public class AttachService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attach_service_id", nullable = false)
    private Long id;
    private String name;
    private String cost;
    private String unit;
    private String status;

    @OneToMany(mappedBy = "attachService")
    private List<ContractDetail> contractDetails;

}