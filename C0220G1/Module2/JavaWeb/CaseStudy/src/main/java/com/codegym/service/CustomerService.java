package com.codegym.service;

import com.codegym.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    List<Customer> findAll();
    Customer findById(Integer id);
    Page<Customer> findAllByHoTenContaining(String hoTen, Pageable pageable);
    void save(Customer customer);
    void remove(Integer id);

}
