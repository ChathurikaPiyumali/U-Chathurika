package com.supervisor;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteSupervisorServlet")
public class DeleteSupervisorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("supid");
		boolean isTrue;
		
		isTrue = SupervisorDBUtil.deleteSupervisor(id);
		
		// Call the deleteSupervisor method from SupervisorDBUtil to delete the supervisor
		if (isTrue == true) {
			// If deletion is successful, navigate to the supervisorinsert.jsp page
			RequestDispatcher dispatcher = request.getRequestDispatcher("supervisorinsert.jsp");
			dispatcher.forward(request, response);
			
		}
		
		// If deletion fails, retrieve the supervisor details using the ID
		else {
			List<Supervisor> supDetails = SupervisorDBUtil.getSupervisorDetails(id);
			request.setAttribute("supDetails", supDetails);
			
			// Navigate to the useraccount.jsp page
			RequestDispatcher dispatcher = request.getRequestDispatcher("useraccount.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
		
	}

}
