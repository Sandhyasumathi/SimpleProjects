package com.springrest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tourist {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String city;
	private String packageType;
	private double budget;
	public Tourist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tourist(int id, String name, String city, String packageType, double budget) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.packageType = packageType;
		this.budget = budget;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "Tourist [id=" + id + ", name=" + name + ", city=" + city + ", packageType=" + packageType + ", budget="
				+ budget + "]";
	}
	
	

}
