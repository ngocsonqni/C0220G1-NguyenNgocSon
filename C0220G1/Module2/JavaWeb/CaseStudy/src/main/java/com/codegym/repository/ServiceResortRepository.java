package com.codegym.repository;

import com.codegym.model.ServiceResort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceResortRepository extends JpaRepository<ServiceResort,Integer> {
    Page<ServiceResort> findAllBytenDichVuContaining(String tenDichVu, Pageable pageable);
}
