<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Student Confirmation Page</title>
</head>
<body>
	Student's first name is: ${studentFromPage.firstName}
	<br> <br/>Student's last name is : ${studentFromPage.lastName}
	<br> <br/>The student is confirmed
	<br> <br/>Student's Country is ${studentFromPage.country}
	<br> <br/>Student's City is ${studentFromPage.city}
	<br> <br/>Student's favourite language is ${studentFromPage.favoriteLanguage}
	<br> <br/>Student's Operating system is ${studentFromPage.operatingOS}
</body>
</html>