<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details</title>
</head>
<body>
	First Name: ${customerFromPage.firstName}
	<br></br> Last Name: ${customerFromPage.lastName}
	<br></br> Number of free passes: ${customerFromPage.freePasses}
	<br></br> Postal Code: ${customerFromPage.postalCode}

</body>
</html>