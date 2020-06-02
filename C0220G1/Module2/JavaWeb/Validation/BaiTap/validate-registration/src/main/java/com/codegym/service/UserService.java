package com.codegym.service;

import com.codegym.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Page<User> findAll(Pageable pageable);

    Page<User> findByFirstNameContaining(String firstName,Pageable pageable);

    void save(User user);

    void remove(String firstName);

}
