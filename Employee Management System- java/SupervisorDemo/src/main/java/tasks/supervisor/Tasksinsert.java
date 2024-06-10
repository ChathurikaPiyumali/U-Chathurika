package tasks.supervisor;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Tasksinsert")
public class Tasksinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// Retrieve the task details from the request parameters
		int taskId = Integer.parseInt(request.getParameter("taskId"));
		String taskName = request.getParameter("taskName");
		String deadline = request.getParameter("deadline");
		int employeeId = Integer.parseInt(request.getParameter("employeeId"));
		String status = request.getParameter("status");
		int supervisorId = Integer.parseInt(request.getParameter("supervisorId"));
		
		
		boolean isTrue;
		
		// Insert the task into the database using the TasksDBUtil
		isTrue =TasksDBUtil.inserttasks( taskName, deadline, employeeId, status, supervisorId); //return boolean value
		
		
		
		if(isTrue == true) {
			 // If the task insertion is successful, forward the request to successTask.jsp
			RequestDispatcher dis = request.getRequestDispatcher("successTask.jsp");
			dis.forward(request, response);	
		}
		else
		{
			// If the task insertion is unsuccessful, forward the request to unsuccessTask.jsp
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccessTask.jsp");
			dis2.forward(request, response);	
		}
		
		
		
	}

}
