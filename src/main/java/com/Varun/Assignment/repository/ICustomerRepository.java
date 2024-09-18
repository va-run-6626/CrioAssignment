package com.Varun.Assignment.repository;

import com.Varun.Assignment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
