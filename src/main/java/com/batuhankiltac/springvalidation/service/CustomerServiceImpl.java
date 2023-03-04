package com.batuhankiltac.springvalidation.service;

import com.batuhankiltac.springvalidation.converter.CustomerConverter;
import com.batuhankiltac.springvalidation.entity.Customer;
import com.batuhankiltac.springvalidation.model.CustomerDto;
import com.batuhankiltac.springvalidation.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerConverter customerConverter;

    @Override
    public void save(CustomerDto customerDto) {
        Customer customer = customerConverter.convert(customerDto);
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}