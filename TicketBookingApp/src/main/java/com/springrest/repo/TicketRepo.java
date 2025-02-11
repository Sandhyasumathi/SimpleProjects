package com.springrest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.model.Passenger;

@Repository
public interface TicketRepo extends JpaRepository<Passenger, Integer> {

}
