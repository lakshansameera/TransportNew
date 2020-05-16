package com.Models;

public class Vehicle {

	private String regNo;
	private String type;
	private int noOfPassengers;
	private int availability;
	
	
	
	public Vehicle(String regNo, String type, int noOfPassengers, int availability) {
		super();
		this.regNo = regNo;
		this.type = type;
		this.noOfPassengers = noOfPassengers;
		this.availability = availability;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	
	
	
}
