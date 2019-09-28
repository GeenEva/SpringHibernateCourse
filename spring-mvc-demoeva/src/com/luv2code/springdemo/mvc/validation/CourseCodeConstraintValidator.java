package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String input, ConstraintValidatorContext context) {
		
		boolean result;
		
		if (input!= null) {
			result = input.startsWith(coursePrefix);
			System.out.println(context.toString());
		}
		
		else {return true;}
		
		return result;
	}

}
