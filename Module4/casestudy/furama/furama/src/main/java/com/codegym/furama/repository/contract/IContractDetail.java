package com.codegym.furama.repository.contract;

import com.codegym.furama.model.contract.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContractDetail extends JpaRepository<ContractDetail,Integer> {
}
