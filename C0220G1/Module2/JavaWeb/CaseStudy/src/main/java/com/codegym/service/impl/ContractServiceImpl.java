package com.codegym.service.impl;

import com.codegym.model.Contract;
import com.codegym.model.Customer;
import com.codegym.repository.ContractRepository;
import com.codegym.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractRepository contractRepository;
    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }
    @Override
    public Contract findById(Integer id) {
        return contractRepository.findById(id).orElse(null);
    }


    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);

    }

    @Override
    public void remove(Integer id) {
        contractRepository.deleteById(id);
    }


}
