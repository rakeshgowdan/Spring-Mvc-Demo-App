package com.rakesh.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentController {

	
	@RequestMapping("showForm")
	public String showForm(Model theModel) {
		
		//create student object
		Student thestudent=new Student();
		
		//add student to model
		theModel.addAttribute("student",thestudent);
		//return form
		return "Student-Form";
	}
	@RequestMapping("processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println(theStudent.getFirstName() +" "+theStudent.getLastName());
		
		
		
		return "Student-Confirmation";
		
	}
	
	
}
