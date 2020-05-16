package com.Models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.DBConnect;

public class Driver extends user{
	
	DBConnect dbConnect = new DBConnect();
	Connection con = dbConnect.Connect();

	public ResultSet checkDutiesNormal()
	{
		
		ResultSet rs = null;
		try {
		Statement stmt = con.createStatement();
		String sql = "Select * from vehicleroutes where DriverId = '"+ super.getNic() + "'";
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
	
	public ResultSet CheckSpecialDuties()
	{

		ResultSet rs = null;
		try {
		Statement stmt = con.createStatement();
		String sql = "Select * from specialbookingsapproved where Driverid = '"+ super.getNic() + "'";
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
}
