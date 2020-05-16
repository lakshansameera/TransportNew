package com.Models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.DBConnect;

public class Student extends user {
	
	DBConnect dbConnect = new DBConnect();
	Connection con = dbConnect.Connect();

	public ResultSet checkPayments()
	{

			ResultSet rs = null;
			try {
			Statement stmt = con.createStatement();
			String sql = "Select * from payment where studentNic = '"+ super.getNic() + "'";
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
	public void requestForSpecialRoutes(Route route)
	{
		try {
			Statement stmt = con.createStatement();
			String sql ="INSERT INTO specialbookings (start, end,fromdateandtime,todateandTime,requestBy,description) VALUES ('"+route.getStart()+"','"+route.getEnd()+"','"+route.getStartTime()+"','"+route.getEndTime()+"','"+super.getNic()+"','"+ route.getDescription() +"')";
			stmt.execute(sql);

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}
