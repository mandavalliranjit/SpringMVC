<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello world input from this page</title>
</head>
<body>
	<form action="processForm" method="get">
		<input type="text" name="studentName" placeholder="what's your name?" />
		<input type="submit" />
	</form>
	
	<form action="processFormVersionTwo" method="get">
		<input type="text" name="studentNameVersionTwo" placeholder="Enter your name" />
		<input type="submit"/>
	</form>
	
	<form action="processFormVersionThree" method="get">
		<input type="text" name = "studentNameVersionThree" placeholder="Enter name for request mapping annotation"/>
		<input type = "submit"/>
	</form>
	
</body>
</html>