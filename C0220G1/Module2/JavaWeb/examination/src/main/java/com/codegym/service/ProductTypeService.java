package com.codegym.service;

import com.codegym.model.ProductType;

import java.util.List;

public interface ProductTypeService {
    List<ProductType> findAll();
    ProductType findById(Integer id);
    void save(ProductType contract);
    void remove(Integer id);
}
