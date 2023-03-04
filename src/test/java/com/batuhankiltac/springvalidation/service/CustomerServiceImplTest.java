package com.batuhankiltac.springvalidation.service;

import com.batuhankiltac.springvalidation.converter.CustomerConverter;
import com.batuhankiltac.springvalidation.entity.Customer;
import com.batuhankiltac.springvalidation.model.CustomerDto;
import com.batuhankiltac.springvalidation.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class CustomerServiceImplTest {

    @InjectMocks
    private CustomerServiceImpl customerServiceImpl;

    @Mock
    private CustomerRepository customerRepository;

    @Mock
    private CustomerConverter customerConverter;

    @Test
    void it_should_save_customer() {
        // Given
        final CustomerDto customerDto = CustomerDto.builder().build();
        final Customer customer = Customer.builder().build();
        when(customerConverter.convert(customerDto)).thenReturn(customer);

        // When
        customerServiceImpl.save(customerDto);

        // Then
        verify(customerConverter).convert(customerDto);
        verify(customerRepository).save(customer);
    }

    @Test
    void it_should_get_all_customers() {
        // Given
        Customer customer = Customer.builder().build();
        List<Customer> customers = Collections.singletonList(customer);

        // When
        customerServiceImpl.getAll();

        // Then
        verify(customerRepository).findAll();
        assertThat(customers).isNotEmpty();
    }
}
