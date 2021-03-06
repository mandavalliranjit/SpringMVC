package com.spring.customvalidation;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	
	@RequestMapping("/")
	public String mainPage() {
		return "home-page";
	}
	
	@RequestMapping("/customerDetails")
	public String customerDetailsPage(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customerFromPage", customer);
		return "customer-details";
	}
	
	//@Valid annotation is needed to let Spring know to use the hibernate bean validation for form
	
	@RequestMapping("/processForm")
	public String customerConfirmationpage(@Valid @ModelAttribute("customerFromPage") Customer customer, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "customer-details";
		}
		return "customer-confirmation";
	}

}
