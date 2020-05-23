package com.rakesh.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("SecondController")
public class SecondController {
	
	@RequestMapping("/showForm")
	public String showHtmlForm() {
		return "HelloWorld-Form";
	}

}
