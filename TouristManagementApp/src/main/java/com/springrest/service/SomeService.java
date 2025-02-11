package com.springrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SomeService {

	@Autowired
	private TouristService service;
	
	public SomeService() {
		System.out.println("Bean created for service");
	}
}
