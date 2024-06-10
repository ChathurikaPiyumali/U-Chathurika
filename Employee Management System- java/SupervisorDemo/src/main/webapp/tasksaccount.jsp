<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tasks Account</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        margin: 0;
        padding: 20px;
    }
    .container {
        max-width: 1200px;
        margin: 0 auto;
    }
    h1 {
        color: #333;
        text-align: center;
    }
    table {
        border-collapse: collapse;
        width: 100%;
        margin-bottom: 20px;
        background-color: #fff;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    th, td {
        padding: 12px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }
    th {
        background-color: #333;
        color: #fff;
    }
    .button {
        padding: 8px 16px;
        text-decoration: none;
        border-radius: 4px;
        display: inline-block;
        margin-right: 10px;
    }
    .update-button {
        background-color: #4CAF50;
        color: white;
    }
    .delete-button {
        background-color: #f44336;
        color: white;
    }
    .create-button {
        background-color: #2196F3;
        color: white;
    }
    .refresh-button {
        background-color: #2196F3;
        color: white;
    }
    .button-container {
        text-align: center;
        margin-bottom: 20px;
    }
</style>
</head>
<body>
<div class="container">
    <h1>Tasks Page</h1>
    
    <table>
        <tr>
            <th>Task ID</th>
            <th>Task Name</th>
            <th>Deadline</th>
            <th>Employee ID</th>
            <th>Status</th>
            <th>Supervisor ID</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="task" items="${tasksDetails}">
            <tr>
                <td>${task.taskId}</td>
                <td>${task.taskName}</td>
                <td>${task.deadline}</td>
                <td>${task.employeeId}</td>
                <td>${task.status}</td>
                <td>${task.supervisorId}</td>
                <td>
                
                	 <%-- URL for updating a task --%>
                	 
                    <c:url value="updatetasks.jsp" var="taskupdate">
                        <c:param name="taskId" value="${task.taskId}"/>
                        <c:param name="taskName" value="${task.taskName}"/>
                        <c:param name="deadline" value="${task.deadline}"/>
                        <c:param name="employeeId" value="${task.employeeId}"/>
                        <c:param name="status" value="${task.status}"/>
                        <c:param name="supervisorId" value="${task.supervisorId}"/>
                    </c:url>
                    
                    
                    <a href="${taskupdate}" class="button update-button">Update</a>
                    
                    <%-- URL for deleting a task --%>
                    <c:url value="deletetasks.jsp" var="taskdelete">
                        <c:param name="taskId" value="${task.taskId}"/>
                        <c:param name="taskName" value="${task.taskName}"/>
                        <c:param name="deadline" value="${task.deadline}"/>
                        <c:param name="employeeId" value="${task.employeeId}"/>
                        <c:param name="status" value="${task.status}"/>
                        <c:param name="supervisorId" value="${task.supervisorId}"/>
                    </c:url>
                    <a href="${taskdelete}" class="button delete-button">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    
    <div class="button-container">
        <a href="tasksinsert.jsp" class="button create-button">Create New Task</a>
        <form action="RefreshTasksServlet" method="get" style="display: inline;">
            <input type="submit" name="refresh" value="Refresh Tasks" class="button create-button">
        </form>
    </div>
</div>
</body>
</html>