package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String[] coursePrefixes;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefixes = theCourseCode.value();
	}

	@Override
	public boolean isValid(String input, ConstraintValidatorContext context) {
		
		boolean result = false;
		
		if (input!= null) {
			
			for(String value: coursePrefixes) {
				result = input.startsWith(value);	
				if(result) {
					break;	
				}
			}
		}
		//can be null
		else {
			result = true;
		}
	
	return result;
	}
	
}
