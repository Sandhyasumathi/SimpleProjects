package com.springrest.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springrest.model.Passenger;
import com.springrest.model.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	private String url1="http://localhost:8080/ticketbooking/api/booking/register-passenger";
	private String url2="http://localhost:8080/ticketbooking/api/booking/getDetails/{ticketNum}";

	@Override
	public int registerPassenger(Passenger pass) {
		System.out.println("From Service" + pass);
		RestTemplate template = new RestTemplate();
		ResponseEntity<Integer> response = template.postForEntity(url1, pass, Integer.class);
		Integer ticketNum = response.getBody();
		return ticketNum;
	}

	@Override
	public Ticket getFullTicket(Integer ticketNum) {
		RestTemplate template = new RestTemplate();
		ResponseEntity<Ticket> response = template.getForEntity(url2, Ticket.class, ticketNum);
		Ticket ticket = response.getBody();
		return ticket;
	}

}
