package com.Controlers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Models.Vehicle;
import com.Services.vehivleServices;

/**
 * Servlet implementation class AddVehicle
 */
public class AddVehicle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddVehicle() {
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
		
		String regNo = request.getParameter("rejNo");
		String type = request.getParameter("vehicleType");;
		int noOfPassengers =Integer.parseInt(request.getParameter("noOfPessengers"));
		String available = request.getParameter("VehicleStatus");
		
		int availability = 0 ;
		
		if(available.equals("Available"))
		{
			availability =1;
		}
		else
		{
			availability= 0;
		}
		
		Vehicle vehicle = new Vehicle(regNo,type,noOfPassengers,availability);
		vehivleServices vs =  new vehivleServices();
		vs.addVehicle(vehicle);
		
	
		RequestDispatcher view = request.getRequestDispatcher("HomeUser.jsp");
		view.forward(request, response); 
	}
}
