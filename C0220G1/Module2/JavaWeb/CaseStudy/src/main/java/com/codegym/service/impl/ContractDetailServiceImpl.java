package com.codegym.service.impl;

import com.codegym.model.Contract;
import com.codegym.model.ContractDetail;
import com.codegym.repository.ContractDetailRepository;
import com.codegym.repository.ContractRepository;
import com.codegym.service.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractDetailServiceImpl implements ContractDetailService {
    @Autowired
    private ContractDetailRepository contractDetailRepository;
    @Override
    public Page<ContractDetail> findAll(Pageable pageable) {
        return contractDetailRepository.findAll(pageable);
    }
    @Override
    public ContractDetail findById(Integer id) {
        return contractDetailRepository.findById(id).orElse(null);
    }



    @Override
    public void save(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);

    }

    @Override
    public void remove(Integer id) {
        contractDetailRepository.deleteById(id);
    }


}
