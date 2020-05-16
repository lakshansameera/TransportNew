package com.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Models.Pyament;
import com.util.DBConnect;

public class paymentServices {
	
	DBConnect dbConnect = new DBConnect();
	Connection con = dbConnect.Connect();
	
	
	public ResultSet getAllPayments()
	{
		ResultSet rs = null;
		
		try {
			Statement stmt = con.createStatement();
			String sql = "Select * FROM payment";
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
	
	public ResultSet getPayments(String Nic)
	{
		ResultSet rs = null;
		
		try {
			Statement stmt = con.createStatement();
			String sql = "Select * FROM payment WHERE studentNic = '"+Nic+"'";
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
	
	public void addPaymnet(Pyament payment)
	{
		try {
			Statement stmt = con.createStatement();
			String sql ="INSERT INTO payment (studentNic,amount) VALUES ('"+payment.getStudentNic()+"','"+payment.getAmount()+"')";
			stmt.execute(sql);
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
	
	public void ReversePayment (Pyament payment)
	{
		try {
			Statement stmt = con.createStatement();
			String sql ="DELETE payment WHERE paymentId  = '"+payment.getStudentNic()+"'";
			stmt.execute(sql);
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		
	}
	
}
