package com.springdemo.formtags;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{cityOptionsInSpringFormtagsServletXML}")
	private LinkedHashMap<String, String> cityOptions;
	
	@RequestMapping("/showForm")
	public String showMainPage(Model model) {
		//create a new student object
		Student newStudent = new Student();
		
		//add the object as a model attribute
		model.addAttribute("studentFromPage", newStudent);
		
		model.addAttribute("cityOptionsInController", cityOptions);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processFormAfterEntering(@ModelAttribute("studentFromPage")Student newStudent) {
		System.out.println("First Name "+ newStudent.getFirstName());
		System.out.println("Last Name "+ newStudent.getLastName());
		return "student-confirmation";
	}

}
