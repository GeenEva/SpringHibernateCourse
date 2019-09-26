package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")    // so called 'parent-mapping'
public class HelloWorldController {

	//controller method to show initial html-form
	@RequestMapping("/showForm")
	public String showForm() {	
		return "helloWorld-form";
	}
	
//	//controller method to process html
//	@RequestMapping("/processForm")
//	public String processForm() {
//		return "helloWorld";
//	}
	
//	
//	@RequestMapping("/processForm")
//	public String letsShoutDude(HttpServletRequest request, Model model) {
//		
//	String studentName = request.getParameter("studentName");
//	
//	studentName = studentName.toUpperCase();
//	
//	String result = "HI " + studentName + "!! Nice to see you!!!";
//	
//	model.addAttribute("message", result);
//	
//		return "helloWorld";
//	}
	
	
	@RequestMapping("/processForm")
	public String letsShoutDude(@RequestParam ("studentName") String student, Model model) {
		
	String studentName = student.toUpperCase();
	
	String result = "HI " + studentName + "!! Nice to see you!!!";
	
	model.addAttribute("message", result);
	
		return "helloWorld";
	}
	
	
	
}
