package com.batuhankiltac.springvalidation.repository;

import com.batuhankiltac.springvalidation.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}