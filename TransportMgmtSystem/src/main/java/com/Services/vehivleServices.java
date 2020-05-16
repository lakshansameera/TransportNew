package com.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Models.Vehicle;
import com.util.DBConnect;

public class vehivleServices {

	
	DBConnect dbConnect = new DBConnect();
	Connection con = dbConnect.Connect();
	
	public ResultSet getAllVehicles()
	{
		ResultSet rs = null;
		try {
		Statement stmt = con.createStatement();
		String sql = "Select * from vehicles";
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
	
	public void addVehicle(Vehicle vehicle)
	{
		try {
			Statement stmt = con.createStatement();
			String sql ="INSERT INTO vehicles (regNo,Type,noOfPassengers,availability) VALUES ('"+vehicle.getRegNo()+"','"+vehicle.getType()+"','"+vehicle.getNoOfPassengers()+"','"+vehicle.getAvailability()+"')";
			stmt.execute(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void ModifyVehicle(Vehicle vehicle)
	{
		try {
			Statement stmt = con.createStatement();
			String sql ="UPDATE vehicles SET (Type,noOfPassengers,availability) VALUES ('"+vehicle.getRegNo()+"','"+vehicle.getType()+"','"+vehicle.getNoOfPassengers()+"','"+vehicle.getAvailability()+"') WHERE regNo= '"+ vehicle.getRegNo()+"' ";
			stmt.execute(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	public void DeleteVehicle()
	{
		
	}
	
	public ResultSet getVehicle(String type)
	{
		ResultSet rs = null;
		try {
		Statement stmt = con.createStatement();
		String sql = "Select * from vehicles WHERE Type = '"+ type+"'";
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
	
	public ResultSet getAvailableVehicle(int availability)
	{
		ResultSet rs = null;
		try {
		Statement stmt = con.createStatement();
		String sql = "Select * from vehicles WHERE availability = '"+ availability +"'";
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
	
	public void NotifyBreakDown(Vehicle vehicle)
	{
		if (vehicle.getAvailability()==0)
		{
			vehicle.setAvailability(1);
		}
		else 
		{
			vehicle.setAvailability(1);
		}
		DBConnect dbConnect = new DBConnect();
		Connection con = dbConnect.Connect();
		//int res=0;//return 0 whrn data is not fetched
		try {
			Statement stmt = con.createStatement();
			String sql ="UPDATE vehicles SET  vehicleStatus='"+ vehicle.getAvailability() +"' WHERE vehicleNo = '"+ vehicle.getRegNo()+"'";
			stmt.execute(sql);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	
	
}
