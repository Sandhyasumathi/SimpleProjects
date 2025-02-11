package com.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springrest.model.Passenger;
import com.springrest.model.Ticket;
import com.springrest.service.TicketService;

@Controller
public class TicketController 
{
	@Autowired
	private TicketService service;
	
	@PostMapping("/book-ticket")
	public String bookTicket(@ModelAttribute Passenger passenger, Model model)
	{
		System.out.println("From COntroller " + passenger);
		Integer ticketNumber=service.registerPassenger(passenger);
		model.addAttribute("ticketNumber", ticketNumber);
		return "index";//LVN
	}
	
	@GetMapping("/passenger-form")
	public String bookTicketFrom(@ModelAttribute Passenger passenger, Model model)
	{
		
		model.addAttribute("passenger", new Passenger());
		return "index";//LVN
	}
	
	@GetMapping("/ticket-form")
	public String ticketForm(@ModelAttribute Passenger passenger, Model model)
	{
		
		model.addAttribute("passenger", new Passenger());
		return "ticket-form";//LVN
	}
	@GetMapping("/get-ticket")
	public String getTicket(@RequestParam("ticketNumber")Integer ticketNumber, Model model)
	{
		Ticket ticket = service.getFullTicket(ticketNumber);
		model.addAttribute("ticket", ticket);
		return "ticket-info";
	}

}

