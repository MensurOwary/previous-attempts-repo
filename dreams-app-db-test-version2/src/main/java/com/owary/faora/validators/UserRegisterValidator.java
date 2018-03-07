package com.owary.faora.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.owary.faora.domain.User;

@Component
public class UserRegisterValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object userObject, Errors errors) {
		User user = (User) userObject;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty.user.username", "Username is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "NotEmpty.user.firstName", "First Name is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "surname", "NotEmpty.user.surname", "Surname is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty.user.password", "Password is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty.user.email", "Email is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "NotEmpty.user.gender", "Gender is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "birthDate", "NotEmpty.user.birthDate", "Birth date is empty");

		if(user.getFile() != null && user.getFile().isEmpty()){
			errors.rejectValue("file", "NotEmpty.user.file", "You must upload an image file");
		}
		
	}

}
