package com.springrest.service;

import com.springrest.model.Passenger;
import com.springrest.model.Ticket;

public interface TicketService {
	
	public int registerPassenger(Passenger pass);
	
	public Ticket getFullTicket(Integer ticketNum);

}
