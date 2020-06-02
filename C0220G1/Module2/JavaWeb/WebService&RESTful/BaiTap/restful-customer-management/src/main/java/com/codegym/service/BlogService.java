package com.codegym.service;


import com.codegym.model.Blog;
import com.codegym.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface BlogService {
    List<Blog> findAll();

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);



    Page<Blog> findAllByNameContaining(String name, Pageable pageable);

    Page<Blog> findAllByCategory(Category category, Pageable pageable);
    Page<Blog> findByCategory_Id(Long id, Pageable pageable);

}