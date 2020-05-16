package com.Controlers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Models.user;
import com.Services.userServices;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		doGet(request, response);
		String nic = request.getParameter("nic");
		String email = request.getParameter("email");
		String name = request.getParameter("Name");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String contactNumber = request.getParameter("contactNumber");
		String RejNo = request.getParameter("rejNumber");
		String Type = request.getParameter("userType");	
		
		int res=-1;
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

		user us = new user(name,email,address,city,contactNumber,RejNo,res,1,nic);
		userServices userservice = new userServices();
		userservice.insertUser(us);
		
		
		RequestDispatcher view = request.getRequestDispatcher("HomeUser.jsp");
		view.forward(request, response);
		//UserServices userservice = new UserServices();
		//userservice.insertUser(us);
	}

	

}
