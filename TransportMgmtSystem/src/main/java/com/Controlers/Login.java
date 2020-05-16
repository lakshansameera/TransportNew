package com.Controlers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Services.userServices;
import com.util.DBConnect;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		
		System.out.println("Servelet got");
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
				
		userServices userService = new userServices();
		int res = userService.login(username, password);

			
		if (res>0) {
				HttpSession session = request.getSession();
				session.setAttribute("name",username);
				session.setAttribute("type",res);
				System.out.print("ok");
				//RequestDispatcher rs1 = request.getRequestDispatcher("HomeUser.jsp");
				//rs1.forward(request, response);
				response.sendRedirect("index.jsp");
				
			}
	
	}

}
