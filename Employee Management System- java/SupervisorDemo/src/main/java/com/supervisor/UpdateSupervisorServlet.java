package com.supervisor;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet implementation class for updating supervisor details.

@WebServlet("/UpdateSupervisorServlet")
public class UpdateSupervisorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("supid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		boolean isTrue;
		
		// Update the supervisor details in the database using the SupervisorDBUtil
		isTrue = SupervisorDBUtil.updatesupervisor(id, name, email, phone, username, password);
		
		if(isTrue == true) {
			// If the update is successful, retrieve the updated supervisor details
			List<Supervisor> supDetails = SupervisorDBUtil.getSupervisorDetails(id);
			// Set the updated supervisor details as a request attribute
			request.setAttribute("supDetails" , supDetails);
			
			// Forward the request to useraccount.jsp
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
		else {
			// If the update is unsuccessful, retrieve the existing supervisor details
			List<Supervisor> supDetails = SupervisorDBUtil.getSupervisorDetails(id);
			request.setAttribute("supDetails" , supDetails);
			
			// Forward the request to useraccount.jsp
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
		
	}

}
