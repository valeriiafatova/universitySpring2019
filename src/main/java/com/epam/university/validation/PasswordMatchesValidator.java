package com.epam.university.validation;

import com.epam.university.form.RegistrationForm;
import com.epam.university.validation.annotation.PasswordMatcher;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatcher, RegistrationForm> {
    @Override
    public boolean isValid(RegistrationForm form, ConstraintValidatorContext constraintValidatorContext) {
        if(form.getPassword() == null || form.getPassword_confirm() == null){
            return true;
        }
        return form.getPassword().equals(form.getPassword_confirm());
    }
}
