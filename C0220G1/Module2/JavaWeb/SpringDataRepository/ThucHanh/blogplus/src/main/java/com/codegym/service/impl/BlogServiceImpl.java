package com.codegym.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.codegym.model.Blog;
import com.codegym.model.Category;
import com.codegym.repository.BlogRepository;
import com.codegym.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;


    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);

    }

    @Override
    public void remove(Long id) {
        blogRepository.deleteById(id);

    }

    @Override
    public Page<Blog> findAllByNameContaining(String name, Pageable pageable) {
        return blogRepository.findAllByNameContaining(name, pageable);
    }


    @Override
    public Page<Blog> findAllByCategory(Category category, Pageable pageable) {
        return blogRepository.findAllByCategory(category,pageable);
    }

    @Override
    public Page<Blog> findByCategory_Id(Long id, Pageable pageable) {
        return blogRepository.findByCategory_Id(id, pageable);
    }


}