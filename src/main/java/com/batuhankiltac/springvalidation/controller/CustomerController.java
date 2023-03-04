package com.batuhankiltac.springvalidation.controller;

import com.batuhankiltac.springvalidation.entity.Customer;
import com.batuhankiltac.springvalidation.model.CustomerDto;
import com.batuhankiltac.springvalidation.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/customers")
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    public void add(@Valid @RequestBody CustomerDto customerDto) {
        customerService.save(customerDto);
    }

    @GetMapping
    public List<Customer> getAll() {
        return customerService.getAll();
    }
}