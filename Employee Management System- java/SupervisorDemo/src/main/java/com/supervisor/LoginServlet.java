package com.supervisor;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		// Retrieve the user name and password from the request parameters
		String username = request.getParameter("uid");
		String password = request.getParameter("pass");
		boolean isTrue ;
		
		 // Validate the user name and password using the SupervisorDBUtil class
		 isTrue = SupervisorDBUtil.validate(username, password);
		
		if(isTrue == true) {
			 // If the login is successful, retrieve the supervisor details using the username
			List<Supervisor> supDetails = SupervisorDBUtil.getSupervisor(username);
			request.setAttribute("supDetails",supDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}else {
			// If the login fails, display an alert message using JavaScript
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or password is incorrect ');");
			out.println("location='login.jsp'");
			out.println("</script>");
		}
		
		
		
		
		
		
	}

}


