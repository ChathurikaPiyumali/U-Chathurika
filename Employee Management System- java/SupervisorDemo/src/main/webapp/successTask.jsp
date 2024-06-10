<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
<style>
body {
	background-color: #f2f2f2;
	font-family: Arial, sans-serif;
	text-align: center;
	padding-top: 100px;
}

h1 {
	color: #4CAF50;
	font-size: 36px;
	margin-bottom: 20px;
}

p {
	color: #666;
	font-size: 18px;
}

.spinner {
	margin-top: 30px;
	width: 50px;
	height: 50px;
	border-radius: 50%;
	border: 5px solid #f3f3f3;
	border-top: 5px solid #4CAF50;
	animation: spin 1s linear infinite;
	display: inline-block;
}

@
keyframes spin { 0% {
	transform: rotate(0deg);
}
100
%
{
transform
:
rotate(
360deg
);
}
}
</style>
</head>
<body>
	<h1>Success!</h1>
	<p>Task operation completed successfully.</p>
	<div class="spinner"></div>
	<p>
		Redirecting to Tasks Account in <span id="countdown">5</span>
		seconds...
	</p>

	<script>
	
	 // Set the initial countdown value
    var countdown = 5;
 	// Get the countdown element
    var countdownElement = document.getElementById("countdown");
 	
 	
    var countdownTimer = setInterval(function() {
        countdown--;
        countdownElement.textContent = countdown;
        if (countdown <= 0) {
        	
        	// Stop the countdown timer
            clearInterval(countdownTimer);
            
         	// Redirect to the tasksaccount.jsp page
            window.location.href = "tasksaccount.jsp";
        }
    }, 1000);
</script>
</body>
</html>