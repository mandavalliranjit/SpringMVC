package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// Controller method to show initial form
	@RequestMapping("/showform")
	public String showForm() {
		return "helloworld-form";
	}

	// Controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//Controller method to read form data and add data to model
	@RequestMapping("/processFormVersionTwo")
	public String toUpperCaseMethod(HttpServletRequest request, Model model) {
		//read the request parameter  from HTML form
		String name = request.getParameter("studentNameVersionTwo");
		
		// convert to all caps
		name = name.toUpperCase();
		
		//add message to model
		model.addAttribute("message", "Yo "+ name);
		
		return "helloworld";
		
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentNameVersionThree")String nameEnteredOnPage, Model model) {
		String name = nameEnteredOnPage.toUpperCase();
		model.addAttribute("message", "Hello "+name);
		return "helloworld";
		
	}
}
