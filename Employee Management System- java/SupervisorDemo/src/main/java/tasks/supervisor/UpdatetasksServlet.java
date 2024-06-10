package tasks.supervisor;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdatetasksServlet")
public class UpdatetasksServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	 // Retrieve the task details from the request parameters
    	int taskId = Integer.parseInt(request.getParameter("taskId"));
        String taskName = request.getParameter("taskName");
        String deadline = request.getParameter("deadline");
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        String status = request.getParameter("status");
        int supervisorId = Integer.parseInt(request.getParameter("supervisorId"));

        // Update the task in the database using the TasksDBUtil
        boolean isTrue = TasksDBUtil.updatetasks(taskId, taskName, deadline, employeeId, status, supervisorId);

        // Retrieve the updated task details from the database
        List<Tasks> tasksDetails = TasksDBUtil.getTasksDetails(String.valueOf(taskId));
        
        // Set the updated task details as a request attribute
        request.setAttribute("tasksDetails", tasksDetails);

        // Forward the request to tasksaccount.jsp
        RequestDispatcher dis = request.getRequestDispatcher("tasksaccount.jsp");
        dis.forward(request, response);
    }
}