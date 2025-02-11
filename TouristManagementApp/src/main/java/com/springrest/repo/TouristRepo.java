package com.springrest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.model.Tourist;

@Repository
public interface TouristRepo extends JpaRepository<Tourist, Integer>{

}
