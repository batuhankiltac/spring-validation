package com.batuhankiltac.springvalidation.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Must be not null.")
    @NotBlank(message = "Must be not blank.")
    @Size(min = 2, message = "Must be longer than 2 characters.")
    private String fullName;

    @NotNull(message = "Must be not null.")
    @NotBlank(message = "Must be not blank.")
    @Size(min = 2, message = "Must be longer than 1 character.")
    private String company;

    @NotNull(message = "Must be not null.")
    @NotBlank(message = "Must be not blank.")
    @Email(message = "Email should be valid.")
    private String email;

    @NotNull(message = "Must be not null.")
    @NotBlank(message = "Must be not blank.")
    @Pattern(regexp = "[0-9\\s]{12}")
    private String phone;
}