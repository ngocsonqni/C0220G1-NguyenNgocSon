package com.codegym.service;

import com.codegym.model.blog;


import java.util.List;


public interface BlogService {
    List<blog> findAll();

    blog findById(Long id);

    void save(blog blog);

    void remove(Long id);
}