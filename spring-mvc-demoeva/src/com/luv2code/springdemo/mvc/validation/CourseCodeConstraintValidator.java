package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String[] coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String input, ConstraintValidatorContext context) {
		
		boolean result;
		
		if (input!= null) {
			
			for(String value: coursePrefix) {
			
				if (result = input.startsWith(value))
				
				return result;
			}
			
			return false;
		}
		
		//can be null
		else {return true;}
		
	}

}
