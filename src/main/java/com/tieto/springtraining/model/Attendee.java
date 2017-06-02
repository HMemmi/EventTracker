package com.tieto.springtraining.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.tieto.springtraining.view.IsPhoneNumber;

public class Attendee {

	@Size(min=2,max=30)
	private String name;
	@NotEmpty @Email
	private String emailAdress;
	@IsPhoneNumber
	private String phone;
	public String getEmailAdress() {
		return emailAdress;
	}
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
