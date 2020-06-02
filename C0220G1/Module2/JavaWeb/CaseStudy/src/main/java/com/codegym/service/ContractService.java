package com.codegym.service;

import com.codegym.model.Contract;
import com.codegym.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ContractService {

    List<Contract> findAll();
    Contract findById(Integer id);
    void save(Contract contract);
    void remove(Integer id);

}
