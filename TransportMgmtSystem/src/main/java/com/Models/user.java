package com.Models;

public class user {
	private String userName;
	private String name;
	private String email;
	private String address;
	private String city;
	private String contactNumber;
	private String regNo;
	private int userType;
	private int userStatus;
	private String Nic;
	
	public user() {
		super();
	}


	
	public user(String name, String email, String address, String city, String contactNumber, String regNo,
			int userType, int userStatus) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.city = city;
		this.contactNumber = contactNumber;
		this.regNo = regNo;
		this.userType = userType;
		this.userStatus = userStatus;
	}



	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getNic() {
		return Nic;
	}



	public void setNic(String nic) {
		Nic = nic;
	}	
	
	
}
