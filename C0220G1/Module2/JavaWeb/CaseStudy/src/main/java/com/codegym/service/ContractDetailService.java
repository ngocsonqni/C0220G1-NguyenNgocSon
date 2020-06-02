package com.codegym.service;

import com.codegym.model.Contract;
import com.codegym.model.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContractDetailService {
    Page<ContractDetail> findAll(Pageable pageable);
    ContractDetail findById(Integer id);
    void save(ContractDetail contractDetail);
    void remove(Integer id);
}
