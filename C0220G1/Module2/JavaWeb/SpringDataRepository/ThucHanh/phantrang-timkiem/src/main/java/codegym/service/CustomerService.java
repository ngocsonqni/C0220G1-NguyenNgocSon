package codegym.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import codegym.model.Customer;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Customer findById(Long id);
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);

    void save(Customer customer);

    void remove(Long id);

}