package tasks.supervisor;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RefreshTasksServlet")
public class RefreshTasksServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// Retrieve all tasks using the TasksDBUtil
    	List<Tasks> tasksDetails = TasksDBUtil.getAllTasks();
    	
    	 // Set the tasks details as a request attribute
        request.setAttribute("tasksDetails", tasksDetails);

        
        // Forward the request to tasksaccount.jsp
        RequestDispatcher dis = request.getRequestDispatcher("tasksaccount.jsp");
        dis.forward(request, response);
        
    }
}