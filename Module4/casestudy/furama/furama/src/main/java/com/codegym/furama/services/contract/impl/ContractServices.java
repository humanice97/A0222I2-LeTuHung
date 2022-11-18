package com.codegym.furama.services.contract.impl;

import com.codegym.furama.model.contract.Contract;
import com.codegym.furama.repository.contract.IContractRepository;
import com.codegym.furama.services.contract.IContractServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractServices implements IContractServices {
    @Autowired
    private IContractRepository iContractRepository;

    @Override
    public void save(Contract contract) {
        iContractRepository.save(contract);
    }

    @Override
    public void delete(Contract contract) {
        iContractRepository.delete(contract);
    }

    @Override
    public Contract getContractById(int id) {
        return iContractRepository.findById(id).orElse(null);
    }
    @Override
    public Page<Contract> getAll(Pageable pageable) {
        return iContractRepository.findAll(pageable);
    }
}
