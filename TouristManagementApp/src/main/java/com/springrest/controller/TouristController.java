package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.exception.TouristNotFoundException;
import com.springrest.model.Tourist;
import com.springrest.service.TouristService;

@RestController
public class TouristController {
	
	@Autowired
	private TouristService service;
	
	@PostMapping("/regTourist")
	public ResponseEntity<String> registerTourist(@RequestBody Tourist tourist) {
		return new ResponseEntity<>(service.RegisterTourist(tourist),HttpStatus.CREATED);
	}
	
	@GetMapping("/getTourist/{id}")
	public ResponseEntity<?> getTourist(@PathVariable("id") int id) {
		try {
			return new ResponseEntity<Tourist>(service.fetchTouristById(id),HttpStatus.OK);
		} catch (TouristNotFoundException e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/getAllTourist")
	public ResponseEntity<?> getAllTourist() {
		try {
			List<Tourist> list = service.fetchAllTourist();
			return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Some Error in fetching the data",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/updateTourist")
	public ResponseEntity<?> updateTourist(@RequestBody Tourist tourist) {
		try {
			Tourist trst = service.updateTouristData(tourist);
			return new ResponseEntity<Tourist>(trst,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Some Error in updating the data",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PatchMapping("/partialUpdateTourist/{id}/{budget}")
	public ResponseEntity<?> partialUpdateTourist(@PathVariable int id, @PathVariable double budget) {
		try {
			String message = service.partialUpdate(id, budget);
			return new ResponseEntity<String>(message,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Some Error in updating the data",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/deleteTourist/{id}")
	public ResponseEntity<?> deleteTourist(@PathVariable int id) {
		try {
			String message = service.deleteById(id);
			return new ResponseEntity<String>(message,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Some Error in updating the data",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
