<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f5f5f5;
        margin: 0;
        padding: 0;
    }
    .container {
        max-width: 400px;
        margin: 50px auto;
        text-align: center;
        background-color: #fff;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    }
    h1 {
        color: #4285f4;
        font-size: 36px;
        margin-bottom: 10px;
    }
    h2 {
        color: #333;
        font-size: 24px;
        margin-bottom: 30px;
    }
    form {
        text-align: left;
    }
    input[type="text"],
    input[type="password"] {
        width: 100%;
        padding: 12px;
        margin-bottom: 20px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }
    .remember-me {
        display: flex;
        align-items: center;
        margin-bottom: 20px;
    }
    .remember-me input[type="checkbox"] {
        margin-right: 5px;
    }
    input[type="submit"] {
        width: 100%;
        padding: 12px;
        background-color: #4285f4;
        color: #fff;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        font-size: 16px;
        transition: background-color 0.3s;
    }
    input[type="submit"]:hover {
        background-color: #3367d6;
    }
    .links {
        margin-top: 20px;
    }
    .links a {
        display: block;
        margin-bottom: 10px;
        color: #4285f4;
        text-decoration: none;
    }
</style>
</head>
<body>
<div class="container">
    <h1>ABC Company</h1>
    <h2>Supervisor Login</h2>
    <form action="log" method="post">
        <input type="text" id="uid" name="uid" placeholder="Username" required>
        <input type="password" id="pass" name="pass" placeholder="Password" required>
        <div class="remember-me">
            <input type="checkbox" id="remember" checked>
            <label for="remember">Remember me</label>
        </div>
        <input type="submit" name="submit" value="Sign in">
    </form>
    <div class="links">
        <a href="supervisorinsert.jsp">Don't have an account? Register here</a>
    </div>
</div>
</body>
</html>