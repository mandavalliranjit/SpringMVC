package com.spring.formvalidation;

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
public class CustomerController {

	@RequestMapping("/")
	public String homePage() {
		return "home-page";
	}
	
	@InitBinder
	public void trimWhiteSpacesInRequest(WebDataBinder webDataBinder) {
		System.out.println("Method annotate as @InitBinder");
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/customerDetails")
	public String showCustomerDetailsPage(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customerFromPage", customer);
		return "customer-details";
	}
	
	@RequestMapping("/processForm")
	public String processCustomerDetails(@Valid @ModelAttribute("customerFromPage") Customer newCustomer,BindingResult bindingResult) {
		System.out.println("LastName: "+newCustomer.getLastName());
		System.out.println("Binding result: "+bindingResult);
		if(bindingResult.hasErrors()) {
			return "customer-details";
		}else {
			return "customer-confirmation";
		}
		
	}
}
