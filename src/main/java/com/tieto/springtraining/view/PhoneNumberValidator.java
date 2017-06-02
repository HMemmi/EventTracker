package com.tieto.springtraining.view;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<IsPhoneNumber, String> {

	
	IsPhoneNumber phone;
	@Override
	public void initialize(IsPhoneNumber phone) {
		this.phone=phone;
	}

	@Override
	public boolean isValid(String phoneNumber, ConstraintValidatorContext arg1) {
		
		if(phoneNumber.equals(null)){
			return false;
		}
		if(phoneNumber.length()>9){
			return false;
		}
		
		return phoneNumber.matches("[0-9()-]*]");
	}

}
