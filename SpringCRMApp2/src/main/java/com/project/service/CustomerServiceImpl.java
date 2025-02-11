package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Customer;
import com.project.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepo repo;
	@Override
	public List<Customer> getAllCustomers() {
		
		return repo.findAll();
	}

	@Override
	public Customer registerCustomer(Customer customer) {
		return repo.save(customer);
		
	}

	@Override
	public Customer fetchById(int custid) {
		
		return repo.getReferenceById(custid);
	}

	@Override
	public void deleteById(int custid) {
		
		repo.deleteById(custid);
	}

}
