package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	Connection con = null;
	
	public Connection Connect() {
		
			 try {
				 Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oopproject","root", "");
					System.out.print("Database is connected !");
					//conn.close();
					//return con;
					}
					catch(Exception e)
					{
					System.out.print("Do not connect to DB - Error:"+e);
					
			}
			return con;
	}
}
