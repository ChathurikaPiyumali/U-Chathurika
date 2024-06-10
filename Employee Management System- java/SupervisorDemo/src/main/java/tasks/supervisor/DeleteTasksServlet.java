package tasks.supervisor;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//implementation class for deleting tasks

@WebServlet("/DeleteTasksServlet")
public class DeleteTasksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Retrieve the task ID from the request parameter
	    String taskId = request.getParameter("taskId");
	    boolean isTrue = false;

	    // Check if the task ID is not null and not empty
	    if (taskId != null && !taskId.trim().isEmpty()) {
	    	
	    	 // Delete the task using the TasksDBUtil
	        isTrue = TasksDBUtil.deleteTask(taskId.trim());
	    }

	    if (isTrue) {
	    	 // If the task is successfully deleted, forward the request to tasksaccount.jsp
	        RequestDispatcher dispatcher = request.getRequestDispatcher("tasksaccount.jsp");
	        dispatcher.forward(request, response);
	    } else {
	    	// If the task deletion fails, retrieve the task details
	        List<Tasks> tasksDetails = TasksDBUtil.getTasksDetails(taskId);
	        // Set the task details as a request attribute
	        request.setAttribute("ttasksDetails", tasksDetails);

	        
	        // Forward the request to tasksaccount.jsp
	        RequestDispatcher dispatcher = request.getRequestDispatcher("tasksaccount.jsp");
	        dispatcher.forward(request, response);
	    }
	}

}
