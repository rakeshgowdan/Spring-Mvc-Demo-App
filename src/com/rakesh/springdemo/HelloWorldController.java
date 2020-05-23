package com.rakesh.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	//show initial form
	@RequestMapping("/showForm")
	public String showHtmlForm() {
		return "HelloWorld-Form";
	}
	//process initial form
	@RequestMapping("processForm")
	public String processForm() {
		
		return "HelloWorld-User";
	}

	@RequestMapping("processFormVersion2")
	public String processFormVersion2(HttpServletRequest request,Model m) {
		String theName=request.getParameter("studentName");
		System.out.println(theName);
		theName=theName.toUpperCase();
		String message="Yo!!"+theName;
		m.addAttribute("result",message);
		
		
		return "HelloWorld-User";
	}
	@RequestMapping("processFormVersion3")
	public String processFormVersion3(@RequestParam("studentName") String theName,Model m) {
		//String theName=request.getParameter("studentName");
		System.out.println("-->@RequestParam");
		System.out.println(theName);
		theName=theName.toUpperCase();
		String message="Yo!!"+theName;
		m.addAttribute("result",message);
		
		
		return "HelloWorld-User";
	}

}
