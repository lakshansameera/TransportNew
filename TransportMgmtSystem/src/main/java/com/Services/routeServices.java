package com.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Models.Route;
import com.util.DBConnect;

public class routeServices {

	DBConnect dbConnect = new DBConnect();
	Connection con = dbConnect.Connect();
	
	private ResultSet getAllRoutes()
	{
	
		ResultSet rs = null;
		try {
		Statement stmt = con.createStatement();
		String sql = "Select * from routes";
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
	
	private ResultSet getSpecialRouteRequests()
	{
	
		ResultSet rs = null;
		try {
		Statement stmt = con.createStatement();
		String sql = "Select * from specialbookings";
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
	
	public void ApproveRequest(Route route)
	{
		try {
			Statement stmt = con.createStatement();
			String sql ="INSERT INTO specialbookingsapproved (BookingId, Driverid, vehicle, status) VALUES ('"+route.getBookingId()+"','"+route.getDriverId()+"','"+route.getVehicle()+"','"+route.getStatus()+"')";
			stmt.execute(sql);

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
	
	public void AssignVehicleDriverToRoutes(Route route)
	{
		try {
			Statement stmt = con.createStatement();
			String sql ="INSERT INTO vehicleroutes (RouteId,vehicleId,DriverId) VALUES ('"+route.getRouteId()+"','"+route.getVehicle()+"'";
			stmt.execute(sql);

			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public void changeVehicleDriverRoute(Route route)
	{
		try {
			Statement stmt = con.createStatement();
			String sql ="UPDATE vehicleroutes SET (vehicleId,DriverId) WHERE RouteId = '"+route.getRouteId()+"'";
			stmt.execute(sql);

			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	public void changeVehicleDriversp(Route route)
	{
		try {
			Statement stmt = con.createStatement();
			String sql ="UPDATE specialbookingsapproved SET (vehicle,Driverid) WHERE BookingId = '"+route.getBookingId()+"'";
			stmt.execute(sql);
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void DeleteSpRoutesp(Route route)
	{
		try {
			Statement stmt = con.createStatement();
			String sql ="DELETE FROM specialbookingsapproved WHERE BookingId = '"+route.getBookingId()+"'";
			stmt.execute(sql);
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void DeleteSpRoute(Route route)
	{
		try {
			Statement stmt = con.createStatement();
			String sql ="DELETE specialbookingsapproved WHERE RouteId = '"+route.getRouteId()+"'";
			stmt.execute(sql);
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertRoute(Route route)
	{
		
	}
	
	public void ModifyRoute(Route route)
	{
		
	}

	public void assignuserstoRoutes()
	{
		
	}
	
	public void removeUsersfromRoute()
	{
		
	}
}
