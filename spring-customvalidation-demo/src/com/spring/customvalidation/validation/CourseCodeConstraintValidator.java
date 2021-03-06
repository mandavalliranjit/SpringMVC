package com.spring.customvalidation.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{
	private String coursePrefix;

	@Override
	public void initialize(CourseCode courseCode) {
		//.value() below is the value that the user enters on the screen
		coursePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String courseCodeValue, ConstraintValidatorContext constraintValidatorContext) {
		return courseCodeValue.startsWith(coursePrefix);
	}
	

}
