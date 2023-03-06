package com.exceptionhandling.validation.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class GenderValidator implements ConstraintValidator<ValidateGender,String> {
    @Override
    public boolean isValid(String genderType, ConstraintValidatorContext constraintValidatorContext) {
        try {
            System.out.println("exception in gender");
            Gender gender = Gender.valueOf(genderType.toUpperCase());
            return true;
        }catch(IllegalArgumentException e){
            System.out.println("in catch block");
            return false;
        }
    }
}
