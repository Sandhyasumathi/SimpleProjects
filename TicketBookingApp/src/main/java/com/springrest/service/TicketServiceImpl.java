package com.springrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.model.Passenger;
import com.springrest.model.Ticket;
import com.springrest.repo.TicketRepo;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepo repo;
	@Override
	public Passenger registerPassenger(Passenger pas) {
		
		return repo.save(pas);
	}

	@Override
	public Passenger fetchInfoById(int id) {
		Passenger passenger = repo.findById(id).get();
//		Ticket ticket = new Ticket();
//		ticket.setName(passenger.getName());
//		ticket.setDateOfJourney(passenger.getDateOfJourney());
//		ticket.
		return passenger;
	}

}
