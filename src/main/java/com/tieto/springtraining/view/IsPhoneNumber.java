package com.tieto.springtraining.view;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=PhoneNumberValidator.class)
public @interface IsPhoneNumber {
	
	 String message = "{Phone}";
	String message() default message;
	Class<?>[] groups() default{};
	Class<? extends Payload>[] payload() default{};
}
