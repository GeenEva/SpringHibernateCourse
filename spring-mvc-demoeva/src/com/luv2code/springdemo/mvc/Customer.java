package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.mvc.validation.CourseCode;

@Component
public class Customer {
	
	private String firstName;
	
	@NotNull(message="you need to fill in something")
	@Size(min=1, message="is required")
	private String lastName;

	@NotNull(message="is required")
	@Min(value=1, message="must be at least 1")
	@Max(value=10, message="can not be greater than 10")
    private Integer freePasses;	

	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="enter 5 characters")
	private String postalCode;
	
	@CourseCode
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


	public String getCourseCode() {
		return courseCode;
	}


	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
	
}
