package com.batuhankiltac.springvalidation.service;

import com.batuhankiltac.springvalidation.entity.Customer;
import com.batuhankiltac.springvalidation.model.CustomerDto;

import java.util.List;

public interface CustomerService {
    void save(CustomerDto customerDto);
    List<Customer> getAll();
}