package com.spring.customvalidation;

import com.spring.customvalidation.validation.CourseCode;

public class Customer {

	private String firstName;
	private String lastName;
	
	@CourseCode(value="TOPS", message="Message should start with TOPS")
	private String courseCode;

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

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
