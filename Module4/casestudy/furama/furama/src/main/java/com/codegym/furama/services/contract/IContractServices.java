package com.codegym.furama.services.contract;

import com.codegym.furama.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractServices {
    void save (Contract contract);
    void delete(Contract contract);
    Contract getContractById(int id);
    Page<Contract> getAll(Pageable pageable);
}