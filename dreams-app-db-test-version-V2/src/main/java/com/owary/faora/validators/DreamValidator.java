package com.owary.faora.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.owary.faora.domain.Dream;

@Component
public class DreamValidator implements Validator {

	@Override
	public boolean supports(Class<?> className) {
		return Dream.class.equals(className);
	}

	@Override
	public void validate(Object dreamObject, Errors errors) {
		Dream dream = (Dream) dreamObject;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "NotEmpty.dream.title");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "NotEmpty.dream.description", "Descr is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "imgUrl", "NotEmpty.dream.imgUrl", "IMG is empty");
		
		if(dream.getDescription().length()>10){
			errors.rejectValue("description", "TooLong.dream.description", "Default Message");
		}

	}

}
