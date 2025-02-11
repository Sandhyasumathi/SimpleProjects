package com.springrest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.springrest.exception.TouristNotFoundException;
import com.springrest.model.Tourist;
import com.springrest.repo.TouristRepo;

@Service
@Scope("prototype")
public class TouristServiceImpl implements TouristService{

	@Autowired
	private TouristRepo repo;
	
	public TouristServiceImpl() {
		System.out.println("Bean created for Tourist service");
	}
	
	@Override
	public String RegisterTourist(Tourist tourist) {
		Tourist t = repo.save(tourist);
		return "Tourist resgistration Completed for the id " + t.getId();
	}

	@Override
	public Tourist fetchTouristById(int id) throws TouristNotFoundException {
		return repo.findById(id).orElseThrow(()->new TouristNotFoundException("Tourist info not available"));
	}

	@Override
	public List<Tourist> fetchAllTourist() {
		
		return repo.findAll();
	}

	@Override
	public Tourist updateTouristData(Tourist tourist) throws TouristNotFoundException {
		Optional<Tourist> optional = repo.findById(tourist.getId());  
		if(optional.isPresent()) {
			return repo.save(tourist);
		}else
			throw new TouristNotFoundException("Given Tourist information is not available for updation");
	}

	@Override
	public String partialUpdate(int id, double budget) throws TouristNotFoundException {
		Optional<Tourist> optional = repo.findById(id);
		if(optional.isPresent()) {
			Tourist tourist = optional.get();
			tourist.setBudget(budget);
			repo.save(tourist);
			return "Budget has been updated sucessfully";
		}else
		   throw new TouristNotFoundException("Tourist info not available for the id " + id);
	}

	@Override
	public String deleteById(int id) throws TouristNotFoundException {
		Optional<Tourist> optional = repo.findById(id);
		if(optional.isPresent()) {
			
			repo.deleteById(id);
			return "Tourist info has been deleted sucessfully";
		}else
		   throw new TouristNotFoundException("Tourist info not available for the id " + id);

	}
	
	

}
