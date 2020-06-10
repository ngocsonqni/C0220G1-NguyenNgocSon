package com.codegym.service.impl;

import com.codegym.model.ProductType;
import com.codegym.repository.ProductTypeRepository;
import com.codegym.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {
    @Autowired
    private ProductTypeRepository productTypeRepository;
    @Override
    public List<ProductType> findAll() {
        return productTypeRepository.findAll();
    }
    @Override
    public ProductType findById(Integer id) {
        return productTypeRepository.findById(id).orElse(null);
    }
    @Override
    public void save(ProductType product) {
        productTypeRepository.save(product);

    }
    @Override
    public void remove(Integer id) {
        productTypeRepository.deleteById(id);
    }
}
