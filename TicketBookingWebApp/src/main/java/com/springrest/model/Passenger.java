package com.springrest.model;

public class Passenger {
	private int id;
	private String name;
	private String departure;
	private String arrival;
	private String dateOfJourney;
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passenger(int id, String name, String depature, String arrival, String dateOfJourney) {
		super();
		this.id=id;
		this.name = name;
		this.departure = depature;
		this.arrival = arrival;
		this.dateOfJourney = dateOfJourney;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String depature) {
		this.departure = depature;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	
	public String getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(String dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", depature=" + departure + ", arrival=" + arrival
				+ ", dateOfJourney=" + dateOfJourney + "]";
	}

	
	

}
