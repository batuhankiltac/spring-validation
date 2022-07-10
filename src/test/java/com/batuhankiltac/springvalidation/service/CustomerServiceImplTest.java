package com.batuhankiltac.springvalidation.service;

import com.batuhankiltac.springvalidation.entity.Customer;
import com.batuhankiltac.springvalidation.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class CustomerServiceImplTest {

    @InjectMocks
    private CustomerServiceImpl customerServiceImpl;

    @Mock
    private CustomerService customerService;

    @Mock
    private CustomerRepository customerRepository;

    @Test
    void it_should_save_customer() {
        // Given
        final Customer customer = Customer.builder()
                .id(1)
                .fullName("Batuhan")
                .company("test-corp")
                .email("test@test.com")
                .build();

        // When
        when(customerServiceImpl.save(customer)).thenReturn(customer);

        // Then
        assertThat(customer.getId()).isNotNull();
        assertThat(customer.getFullName()).isEqualTo("Batuhan");
    }
}
