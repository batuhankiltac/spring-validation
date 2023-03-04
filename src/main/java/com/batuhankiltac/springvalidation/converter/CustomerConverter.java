package com.batuhankiltac.springvalidation.converter;

import com.batuhankiltac.springvalidation.entity.Customer;
import com.batuhankiltac.springvalidation.model.CustomerDto;
import org.springframework.stereotype.Component;

@Component
public class CustomerConverter {

    public Customer convert(CustomerDto customerDto) {
        return Customer.builder()
                .email(customerDto.getEmail())
                .company(customerDto.getCompany())
                .phone(customerDto.getPhone())
                .fullName(customerDto.getFullName())
                .build();
    }
}
