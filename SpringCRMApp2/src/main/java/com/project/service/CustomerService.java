package com.project.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.project.model.Customer;

@Service
public interface CustomerService {

	
	public List<Customer> getAllCustomers();
	public Customer registerCustomer(Customer customer);
	
	public Customer fetchById(int custid);
	
	public void deleteById(int custid);
}
