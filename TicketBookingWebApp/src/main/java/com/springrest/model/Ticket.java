package com.springrest.model;

public class Ticket {
	
	private int ticketNumber;
	private String status;
	private Double price;
	private String name;
	private String depature;
	private String arrival;
	private String dateOfJourney;
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(int ticketNumber, String status, Double price, String name, String depature, String arrival,
			String dateOfJourney) {
		super();
		this.ticketNumber = ticketNumber;
		this.status = status;
		this.price = price;
		this.name = name;
		this.depature = depature;
		this.arrival = arrival;
		this.dateOfJourney = dateOfJourney;
	}
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepature() {
		return depature;
	}
	public void setDepature(String depature) {
		this.depature = depature;
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
		return "Ticket [ticketNumber=" + ticketNumber + ", status=" + status + ", price=" + price + ", name=" + name
				+ ", depature=" + depature + ", arrival=" + arrival + ", dateOfJourney=" + dateOfJourney + "]";
	}

}
