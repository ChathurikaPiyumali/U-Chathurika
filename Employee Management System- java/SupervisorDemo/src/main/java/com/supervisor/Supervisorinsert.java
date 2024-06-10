package com.supervisor;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// implementation class for inserting a new supervisor

@WebServlet("/Supervisorinsert")
public class Supervisorinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Handles the HTTP POST request to insert a new supervisor.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("uid");
		String password = request.getParameter("psw");
		
		boolean isTrue;
		// Insert the supervisor into the database using the SupervisorDBUtil
		isTrue = SupervisorDBUtil.insertsupervisor(name,email,phone,username,password);
		
		
		if(isTrue == true) {
			 // If the insertion is successful, forward the request to success.jsp
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);	
		}
		else
		{
			// If the insertion is unsuccessful, forward the request to unsuccess.jsp
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);	
		}
		
	}

}
