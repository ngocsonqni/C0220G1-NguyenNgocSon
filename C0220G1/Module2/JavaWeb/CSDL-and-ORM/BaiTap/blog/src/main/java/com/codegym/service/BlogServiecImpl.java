package com.codegym.service;

import com.codegym.model.blog;
import com.codegym.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiecImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public blog findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void save(blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.remove(id);
    }
}