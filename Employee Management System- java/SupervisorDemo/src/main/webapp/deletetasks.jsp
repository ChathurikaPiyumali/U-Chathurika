<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Task</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
	margin: 0;
	padding: 20px;
}

h1 {
	color: #333;
	font-size: 32px;
	margin-bottom: 20px;
	text-align: center;
}

form {
	max-width: 400px;
	margin: 0 auto;
	background-color: #fff;
	padding: 20px;
	border-radius: 4px;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

label {
	display: block;
	font-weight: bold;
	margin-bottom: 10px;
}

input[type="text"], input[type="date"] {
	width: 100%;
	padding: 10px;
	font-size: 16px;
	border: 1px solid #ddd;
	border-radius: 4px;
	box-sizing: border-box;
	margin-bottom: 20px;
}

input[type="submit"] {
	background-color: #dc3545;
	color: #fff;
	padding: 10px 20px;
	font-size: 16px;
	font-weight: bold;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #c82333;
}
</style>
</head>
<body>
	<h1>Delete Assigned Task</h1>
	<%
	//Retrieve task ID from request parameter and parse it as an integer

	String taskIdParam = request.getParameter("taskId");
	int taskId = 0;
	if (taskIdParam != null && !taskIdParam.trim().isEmpty()) {
		taskId = Integer.parseInt(taskIdParam.trim());
	}

	// Retrieve other task details from request parameters
	String taskName = request.getParameter("taskName");
	String deadline = request.getParameter("deadline");

	// Retrieve employee ID from request parameter and parse it as an integer
	String employeeIdParam = request.getParameter("employeeId");
	int employeeId = 0;
	if (employeeIdParam != null && !employeeIdParam.trim().isEmpty()) {
		employeeId = Integer.parseInt(employeeIdParam.trim());
	}

	String status = request.getParameter("status");

	// Retrieve supervisor ID from request parameter and parse it as an integer
	String supervisorIdParam = request.getParameter("supervisorId");
	int supervisorId = 0;
	if (supervisorIdParam != null && !supervisorIdParam.trim().isEmpty()) {
		supervisorId = Integer.parseInt(supervisorIdParam.trim());
	}
	%>
	
	<form action="deleteT" method="post">
    <label for="taskId">Task ID:</label>
    <input type="text" id="taskId" name="taskId" value="<%= taskId %>" readonly><br>
    
    <label for="taskName">Task Name:</label>
    <input type="text" id="taskName" name="taskName" value="<%= taskName %>" readonly><br>
    
    <label for="deadline">Deadline:</label>
    <input type="date" id="deadline" name="deadline" value="<%= deadline %>" readonly><br>
    
    <label for="employeeId">Employee ID:</label>
    <input type="text" id="employeeId" name="employeeId" value="<%= employeeId %>" readonly><br>
    
    <label for="status">Status:</label>
    <input type="text" id="status" name="status" value="<%= status %>" readonly><br>
    
    <label for="supervisorId">Supervisor ID:</label>
    <input type="text" id="supervisorId" name="supervisorId" value="<%= supervisorId %>" readonly><br>
    
    <input type="submit" name="submit" value="Delete Task">
	</form>
</body>
</html>