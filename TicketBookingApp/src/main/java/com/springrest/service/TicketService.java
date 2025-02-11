package com.springrest.service;

import org.springframework.stereotype.Service;

import com.springrest.model.Passenger;

public interface TicketService {
	
	public Passenger registerPassenger(Passenger pas);
	public Passenger fetchInfoById(int id);

}
