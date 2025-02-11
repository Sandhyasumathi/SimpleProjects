package com.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Ticket Booking App",
				version = "v1.0",
				description = "This API will Book and generate the Ticket"
				),
		servers = @Server(
				url="http://localhost:8080/ticketbooking",
				description = "This Api is deployed in the following url"
				)
		)
public class TicketBookingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingAppApplication.class, args);
	}

}
