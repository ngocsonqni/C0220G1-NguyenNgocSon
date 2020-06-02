package com.codegym.repository;

import com.codegym.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User,String> {
    Page<User> findByFirstNameContaining(String firstName, Pageable pageable);
}
