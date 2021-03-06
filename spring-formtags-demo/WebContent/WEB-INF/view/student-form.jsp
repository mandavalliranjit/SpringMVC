<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>

<form:form action="processForm" modelAttribute="studentFromPage">
	<br></br>
First Name: <form:input path="firstName" />
	<br></br>
Last Name: <form:input path="lastName" />
	<br></br>
Country:
	<form:select path="country">
		<form:options items="${studentFromPage.countryOptions}" />
	</form:select>

	<br></br>
	City Of Origin: 
	<form:select path="city">
		<form:options items="${cityOptionsInController}" />
	</form:select>

	<br></br>
	Favourite Language:
	 <form:radiobutton path="favoriteLanguage" value="Java"
		label="Java Language" />
	<form:radiobutton path="favoriteLanguage" value="C#"
		label=".NET language" />
	<form:radiobutton path="favoriteLanguage" value="PHP"
		label="PHP Language" />
	<form:radiobutton path="favoriteLanguage" value="Ruby"
		label="Ruby Language" />
	<br></br>
	
	Operating Systems:
	<form:checkboxes items="${studentFromPage.osItemList}"
		path="operatingOS" />

	<br></br>
	<input type="submit" value="Process Form" />


</form:form>


<body>

</body>
</html>