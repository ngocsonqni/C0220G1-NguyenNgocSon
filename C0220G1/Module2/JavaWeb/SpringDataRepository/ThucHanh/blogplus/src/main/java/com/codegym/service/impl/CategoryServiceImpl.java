package com.codegym.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.codegym.model.Category;
import com.codegym.repository.CategoryRepository;
import com.codegym.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public Page<Category> findAll(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }


    @Override
    public Page<Category> findAllByNameContaining(String name, Pageable pageable) {
        return categoryRepository.findAllByNameContaining(name, pageable);
    }




    @Override
    public void save(Category category) {
        categoryRepository.save(category);

    }

    @Override
    public void remove(Long id) {
        categoryRepository.deleteById(id);

    }
}