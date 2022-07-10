package com.batuhankiltac.springvalidation.service;

import com.batuhankiltac.springvalidation.entity.Customer;
import com.batuhankiltac.springvalidation.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}