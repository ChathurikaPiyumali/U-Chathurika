<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Supervisor Details</title>
<style>
  body {
    font-family: Arial, sans-serif;
    background-color: #f2f2f2;
    margin: 0;
    padding: 20px;
  }

  h1 {
    text-align: center;
    color: #333;
  }

  table {
    width: 100%;
    border-collapse: collapse;
    margin-bottom: 20px;
  }

  th, td {
    padding: 10px;
    text-align: left;
    border-bottom: 1px solid #ddd;
  }

  th {
    background-color: #f5f5f5;
  }

  .button {
    display: inline-block;
    padding: 10px 20px;
    margin-right: 10px;
    text-decoration: none;
    color: #fff;
    background-color: #4CAF50;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    transition: background-color 0.3s;
  }

  .button:hover {
    background-color: #45a049;
  }

  .assigned-tasks-button {
    font-size: 18px;
    padding: 12px 24px;
    background-color: #2196F3;
  }

  .assigned-tasks-button:hover {
    background-color: #0b7dda;
  }
</style>
</head>
<body>
<h1>Supervisor Details</h1>

<table>
  <thead>
    <tr>
      <th>Supervisor ID</th>
      <th>Supervisor Name</th>
      <th>Supervisor Email</th>
      <th>Supervisor Phone</th>
      <th>Supervisor Username</th>
      <th>Supervisor Password</th>
      <th>Actions</th>
    </tr>
  </thead>
  <tbody>
  
  	  <%-- Iterate over the list of supervisor details --%>
    <c:forEach var="sup" items="${supDetails}">
      <c:set var="id" value="${sup.id}"/>
      <c:set var="name" value="${sup.name}"/>
      <c:set var="email" value="${sup.email}"/>
      <c:set var="phone" value="${sup.phone}"/>
      <c:set var="username" value="${sup.username}"/>
      <c:set var="password" value="${sup.password}"/>
      <tr>
        <td>${sup.id}</td>
        <td>${sup.name}</td>
        <td>${sup.email}</td>
        <td>${sup.phone}</td>
        <td>${sup.username}</td>
        <td>${sup.password}</td>
        <td>
        
           <%-- URL for updating supervisor details --%>
          <c:url value="updatesupervisor.jsp" var="supupdate">
            <c:param name="id" value="${id}"/>
            <c:param name="name" value="${name}"/>
            <c:param name="email" value="${email}"/>
            <c:param name="phone" value="${phone}"/>
            <c:param name="uname" value="${username}"/>
            <c:param name="pass" value="${password}"/>
          </c:url>
          <a href="${supupdate}" class="button">Update</a>

			<%-- URL for deleting supervisor account --%>
          <c:url value="deletesupervisor.jsp" var="supdelete">
            <c:param name="id" value="${id}"/>
            <c:param name="name" value="${name}"/>
            <c:param name="email" value="${email}"/>
            <c:param name="phone" value="${phone}"/>
            <c:param name="uname" value="${username}"/>
            <c:param name="pass" value="${password}"/>
          </c:url>
          
          
          <a href="${supdelete}" class="button" onclick="return confirm('Are you sure you want to delete your account?');">Delete</a>
        </td>
      </tr>
    </c:forEach>
  </tbody>
</table>

<%-- Button to navigate to assigned tasks page --%>
<a href="tasksaccount.jsp" class="button assigned-tasks-button">Assigned Tasks</a>

<script>
  // JavaScript code can be added here for additional interactivity or functionality
</script>
</body>
</html>