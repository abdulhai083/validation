package com.exceptionhandling.validation.dto;

import com.exceptionhandling.validation.validation.ValidateGender;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserRequest {


    private int userId;

    @NotNull(message = "user name should not be null")
    private String name;

    @NotNull(message = "Mobile number cannot be null")
    @Pattern(regexp = "^\\d{10}$",message = "invalid mobile no")
    private String mobile;

    @Email(message = "invalid email ID")
    private String email;

    @ValidateGender
    private String gender;

    @Min(value = 10,message = "age cannot be less than 10")
    @Max(value = 50,message = "age cannot be greater than 50")
    private String age;

    @NotBlank(message = "nationality cannot be null or empty")
    private String nationality;
}
