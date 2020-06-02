package com.codegym.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.codegym.model.Blog;
import com.codegym.model.Category;

public interface BlogRepository extends PagingAndSortingRepository<Blog,Long> {
    Page<Blog> findAllByNameContaining(String name, Pageable pageable);
    Page<Blog> findAllByCategory(Category category, Pageable pageable);
    Page<Blog> findByCategory_Id(Long id , Pageable pageable);
}