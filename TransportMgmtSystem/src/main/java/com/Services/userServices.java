package com.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import com.Models.user;
import com.util.DBConnect;

public class userServices {

	DBConnect dbConnect = new DBConnect();
	Connection con = dbConnect.Connect();
	
	public int login(String userName, String passWord)
	{
		//login sucessfull res>0 log in unsucessfull res<1 
		int res=0;
		
	
		
		try {
			Statement stmt = con.createStatement();
			String sql = "Select * from users where userName = '"+ userName + "'and password = '"+passWord+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
		while (rs.next()) {
				String Type = rs.getString("UserType");
				if (Type.equals("Student"))
				{
					res = 1;
					
				}
				
				if (Type.equals("Employee"))
				{
					res = 2;
					
				}
				
				if (Type.equals("Driver"))
				{
					res = 3;
					
				}
				if (Type.equals("Admin"))
				{
					res = 4;
					
				}
				
			}
		rs.close();
	    stmt.close();
	    con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("password ok");
		return res;
	}
	
	public boolean availabilityofUsername(String userName)
	{
		boolean res=false;
		try {
			Statement stmt = con.createStatement();
			String sql = "Select * from users where userName = '"+ userName + "'";
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				res=true;
			}
		rs.close();
	    stmt.close();
	    con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return res;
	}
	
	public user getUser(String Nic)
	{
		
		
		user us = new user();
		try {
			Statement stmt = con.createStatement();
			String sql = "Select * from userdetails where NIC = '"+ Nic + "'";
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
			String	Name =rs.getString("Name");
			String	email =rs.getString("email");
			String	Address =rs.getString("Address");
			String	city =rs.getString("city");
			String	Contactno =rs.getString("Contactno");
			String	RegNo =rs.getString("RegNo");
			String	Type = rs.getString("UserType");
			int usertype = 0;	
				if (Type.equals("Student"))
				{
					 usertype = 1;
					
				}
				
				if (Type.equals("Employee"))
				{
					usertype = 2;
					
				}
				
				if (Type.equals("Driver"))
				{
					usertype =  3;
					
				}
				if (Type.equals("Admin"))
				{
					usertype = 4;
					
				}
				us.setAddress(Address);
				us.setContactNumber(Contactno);
				us.setEmail(email);
				us.setName(Name);
				us.setRegNo(RegNo);
				us.setUserStatus(getUserStatus(Nic));
				us.setCity(city);
				us.setNic(Nic);
				us.setUserType(usertype);

			}
		rs.close();
	    stmt.close();
	    con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return us;
	}
	
	public int getUserStatus(String Nic)
	{
		int res= 0;
		try {
			Statement stmt = con.createStatement();
			String sql = "Select status from users where NIC = '"+ Nic + "'";
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				res = rs.getInt("status");
			}
		rs.close();
	    stmt.close();
	    con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return res;
		
	}
	
	public int getStatusfromuserName(String userName)
	{
		int res= 0;
		try {
			Statement stmt = con.createStatement();
			String sql = "Select status from users where userName = '"+ userName + "'";
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				res = rs.getInt("status");
			}
		rs.close();
	    stmt.close();
	    con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return res;
	}
	
	public ResultSet getAllusers(String userType)
	{
		ResultSet rs = null;
		try {
		Statement stmt = con.createStatement();
		String sql = "Select * from userdetails where UserType = '"+ userType + "'";
		rs = stmt.executeQuery(sql);
	    stmt.close();
	    con.close();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}

		return rs;
		
	}

	public int resetPassword (String userName)
	{
		Random rand = new Random();
		int password = rand.nextInt(100000);
		try {
			Statement stmt = con.createStatement();
			String sql = "UPDATE users set password = '"+password+"' userdetails where userName = '"+ userName + "'";
			stmt.execute(sql);
		    stmt.close();
		    con.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		
		return password;
	}
	
	public int changeStatus (String username)
	{
		int status = getStatusfromuserName(username);
		if (status==0)
		{
			status  = 1;
		}
		else 
		{
			status = 0;
		}
		try {
			Statement stmt = con.createStatement();
			String sql = "UPDATE users set status = '"+status+"' userdetails where userName = '"+ username + "'";
			stmt.execute(sql);
		    stmt.close();
		    con.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		
		
		return status;
	}

	public int insertUser(user us)
	{
		int Type = us.getUserType();
		String type = null;
		if (Type==1)
		{
			type = "Student";
			
		}
		
		if (Type== 2)
		{
			type = "Employee";
			
		}
		
		if (Type == 3)
		{
			type = "Driver";
			
		}
		if (Type == 4)
		{
			type = "Admin";
			
		}
		
		int res=0;//return 0 whrn data is not fetched
		try {
			Statement stmt = con.createStatement();
			String sql ="INSERT INTO userdetails(NIC,Name,email,Address,city,Contactno,RegNo,UserType) VALUES ('"+us.getNic()+"','"+us.getName()+"','"+us.getEmail()+"','"+us.getAddress()+"','"+us.getAddress()+"','"+us.getCity()+"','"+us.getContactNumber()+"','"+us.getRegNo()+"','"+type+"')";
			stmt.execute(sql);
			res =1;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			res = 0;
		}
		return res;
	}

	public void updateUser(user us)
	{
		int Type = us.getUserType();
		String type = null;
		if (Type==1)
		{
			type = "Student";
			
		}
		
		if (Type== 2)
		{
			type = "Employee";
			
		}
		
		if (Type == 3)
		{
			type = "Driver";
			
		}
		if (Type == 4)
		{
			type = "Admin";
			
		}
		
		int res=0;//return 0 whrn data is not fetched
		try {
			Statement stmt = con.createStatement();
			String sql ="UPDATE userdetails SET (Name,email,Address,city,Contactno,RegNo,UserType) VALUES ('"+us.getName()+"','"+us.getEmail()+"','"+us.getAddress()+"','"+us.getAddress()+"','"+us.getCity()+"','"+us.getContactNumber()+"','"+us.getRegNo()+"','"+type+"') WHERE NIC ='"+us.getNic()+"' ";
			stmt.execute(sql);
			res =1;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			res = 0;
		}
	}
	
}
