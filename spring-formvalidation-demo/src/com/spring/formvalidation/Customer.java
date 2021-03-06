package com.spring.formvalidation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Required;

public class Customer {
	String firstName;
	
	@NotNull(message="Last Name is required")
	@Size(min=1, message="is required")
	String lastName;
	
	@NotNull(message="is required")
	@Min(value=0, message="Minimum value is 0")
	@Max(value=10, message="Maximum value is 10")
	Integer freePasses;
	
	@NotNull(message="Postal Code cannot be null")
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="Value can be only 5 digits/characters")
	
	String postalCode;
	
	public Customer() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	

}
