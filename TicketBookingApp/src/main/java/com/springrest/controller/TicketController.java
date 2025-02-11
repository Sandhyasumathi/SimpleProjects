package com.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.model.Passenger;
import com.springrest.model.Ticket;
import com.springrest.service.TicketService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/booking")
@Tag(name = "TicketBookingApiCalls", description = "This will have the methods to register an passenger and to fetch the details of the ticket based on ticket number")
public class TicketController {

	@Autowired
	private TicketService service;

	@PostMapping("/register-passenger")
	@Operation(summary = "Register Passenger" , description = "This is a post operation and will accept a Passenger object and add it to the DB")
	public ResponseEntity<Integer> registerPassenger(Passenger pass) {
		Passenger passenger = service.registerPassenger(pass);
		System.out.println(passenger);
		Integer ticketNum = passenger.getId();
		return new ResponseEntity<>(ticketNum, HttpStatus.CREATED);
	}

	@GetMapping("/getDetails/{ticketNum}")
	@Operation(summary = "Fetch Ticket details" , description = "This is a get operation and will accept a integer(TicketNumber to fetch the ticket details")
	public ResponseEntity<Ticket> getTicketDetails(@PathVariable("ticketNum") Integer ticketNum) {
		Passenger passenger = service.fetchInfoById(ticketNum);
		Ticket ticket = new Ticket();
		ticket.setName(passenger.getName());
		ticket.setArrival(passenger.getArrival());
		ticket.setDateOfJourney(passenger.getDateOfJourney());
		ticket.setDepature(passenger.getDepature());
		ticket.setPrice(500.0);
		ticket.setStatus("Confirmed");
		ticket.setTicketNumber(passenger.getId());
		System.out.println(ticket);
		return new ResponseEntity<Ticket>(ticket, HttpStatus.FOUND);
	}

}
