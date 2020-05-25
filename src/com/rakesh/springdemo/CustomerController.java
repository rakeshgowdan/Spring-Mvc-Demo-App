package com.rakesh.springdemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Customer")
public class CustomerController {
	
	//add initBinder to trim white spaces
	//remove leading and trailing white spaces
	//reslove validation
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor str=new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class,str);
		
	}

	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("customer",new Customer());
		return "Customer-form";
	}
	@RequestMapping("processForm")
	public String processForm(
			@Valid
			@ModelAttribute("customer")
			Customer theStudent,
			BindingResult br)	
	{
		System.out.println(theStudent.getFname() +" "+theStudent.getLname());
		
		
		if(br.hasErrors()) {
		return "Customer-form";	
		}else {
			
		return "Customer-Confirmation";
		}
	}
}
