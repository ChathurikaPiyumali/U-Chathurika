<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assign Task</title>
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

input[type="text"],
input[type="date"] {
width: 100%;
padding: 10px;
font-size: 16px;
border: 1px solid #ddd;
border-radius: 4px;
box-sizing: border-box;
margin-bottom: 20px;
}

input[type="submit"] {
background-color: #007bff;
color: #fff;
padding: 10px 20px;
font-size: 16px;
font-weight: bold;
border: none;
border-radius: 4px;
cursor: pointer;
}

input[type="submit"]:hover {
background-color: #0056b3;
}
</style>
</head>
<body>
<h1>Assign Task</h1>
<form action="insertT" method="post">
<label for="taskId">Task ID:</label>
<input type="text" id="taskId" name="taskId" required><br>

<label for="taskName">Task Name:</label>
<input type="text" id="taskName" name="taskName" required><br>

<label for="deadline">Deadline:</label>
<input type="date" id="deadline" name="deadline" required><br>

<label for="employeeId">Employee ID:</label>
<input type="text" id="employeeId" name="employeeId" required><br>

<label for="status">Status:</label>
<input type="text" id="status" name="status" required><br>

<label for="supervisorId">Supervisor ID:</label>
<input type="text" id="supervisorId" name="supervisorId" required><br>

<input type="submit" name="submit" value="Assign Task">
</form>
</body>
</html>