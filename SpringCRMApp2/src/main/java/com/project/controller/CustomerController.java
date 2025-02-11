package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.model.Customer;
import com.project.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService service;

	@GetMapping("/crmdetails")
	public String getAllCustomers(Model model) {
		
		List<Customer> cList = service.getAllCustomers();
		model.addAttribute("customersList",cList);
		return "customerinfo";
	}
	
	@GetMapping("/showform")
	public String getForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "showform";
	}
	
	@PostMapping("/registerCustomer")
	public String register(@ModelAttribute Customer customer, Model model) {
		
	     Customer cust = service.registerCustomer(customer);
	     if(cust!=null) {
	    	 model.addAttribute("RegSuccessMsg",cust.getFname() + " your Registration is sucessfull");
	    	 return "customerinforeg";
	     }else 
	    	 model.addAttribute("RegFailureMsg","Some issue in registration");
	    	 return "customerinforeg2";
		
	}
	
	@GetMapping("/updateform")
	public String update(@RequestParam("cxid") int custid, Model model) {
		Customer customer = service.fetchById(custid);
		model.addAttribute("customer",customer);
		
		return "updateform";
	}
	
	@GetMapping("/deleteData")
	public String delete(@RequestParam("cxid") int custid) {

		service.deleteById(custid);
		return "redirect:/crmdetails";
	}
	
	
}
