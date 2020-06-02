package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.model.ServiceResort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceResortService {
    Page<ServiceResort> findAll(Pageable pageable);
    List<ServiceResort> findAll();
    ServiceResort findById(Integer id);
    Page<ServiceResort> findAllBytenDichVuContaining(String tenDichVu, Pageable pageable);
    void save(ServiceResort serviceResort);
    void remove(Integer id);

}
