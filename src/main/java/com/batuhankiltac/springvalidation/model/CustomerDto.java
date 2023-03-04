package com.batuhankiltac.springvalidation.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CustomerDto {

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
