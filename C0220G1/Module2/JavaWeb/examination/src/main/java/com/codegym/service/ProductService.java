package com.codegym.service;

import com.codegym.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);
    List<Product> findAll();
    Product findById(Integer id);
    Page<Product> findAllByTenHangContaining(String tenHang, Pageable pageable);
    void save(Product product);
    void remove(Integer id);

}
