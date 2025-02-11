package com.springrest.service;

import java.util.List;

import com.springrest.exception.TouristNotFoundException;
import com.springrest.model.Tourist;

public interface TouristService 
{

	public String RegisterTourist(Tourist tourist);
	public Tourist fetchTouristById(int id) throws TouristNotFoundException;
	public List<Tourist> fetchAllTourist();
	
	public Tourist updateTouristData(Tourist tourist) throws TouristNotFoundException;
	
	public String partialUpdate(int id, double budget) throws TouristNotFoundException;
	
	public String deleteById(int id) throws TouristNotFoundException;
}
