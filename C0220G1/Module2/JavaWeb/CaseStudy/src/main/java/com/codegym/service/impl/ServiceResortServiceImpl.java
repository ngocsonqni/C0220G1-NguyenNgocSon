package com.codegym.service.impl;

import com.codegym.model.Customer;
import com.codegym.model.ServiceResort;
import com.codegym.repository.CustomerRepository;
import com.codegym.repository.ServiceResortRepository;
import com.codegym.service.ServiceResortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceResortServiceImpl implements ServiceResortService {
    @Autowired
    private ServiceResortRepository serviceResortRepository;
    @Override
    public Page<ServiceResort> findAll(Pageable pageable) {
        return serviceResortRepository.findAll(pageable);
    }
    @Override
    public List<ServiceResort> findAll(){
        return serviceResortRepository.findAll();
    }

    @Override
    public ServiceResort findById(Integer id) {
        return serviceResortRepository.findById(id).orElse(null);
    }

    @Override
    public Page<ServiceResort> findAllBytenDichVuContaining(String tenDichVu, Pageable pageable) {
        return serviceResortRepository.findAllBytenDichVuContaining(tenDichVu, pageable);
    }

    @Override
    public void save(ServiceResort serviceResort) {
        serviceResortRepository.save(serviceResort);

    }

    @Override
    public void remove(Integer id) {
        serviceResortRepository.deleteById(id);
    }

}
