<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>

<html>
<head>
	<title>Student Registration Form</title>
</head>
<body>

	<h3>Het Studenten Registratie Formulier</h3>

	<form:form action = "processForm" modelAttribute = "student">
	
		Firstname: <form:input path = "firstName" />
		<br><br>
		Lastname: <form:input path = "lastName" />
		<br><br>
		Country:
		<br><br>
		<form:select path="country" >			
			<form:options items= "${theCountryOptions}"/>
		</form:select>
		<br><br>
		
		Favorite Programming Language: <br>
			<form:radiobutton path="favoriteLanguage" value="Java"/>  Java 
			<form:radiobutton path="favoriteLanguage" value="Ruby"/>  Ruby 
			<form:radiobutton path="favoriteLanguage" value="Python"/>  Python 
			<form:radiobutton path="favoriteLanguage" value="PHP"/>  PHP
	
		<br><br>
		
		Operating systems you use: <br>
		<form:checkbox path="operatingSystems" value="Mac OS" label="Mac"/>		
		<form:checkbox path="operatingSystems" value="Microsoft" label="Microsoft"/>
		<form:checkbox path="operatingSystems" value="Linux" label="Linux"/>
		<br><br>
		
		<input type = "submit" value="Submit" />
		
	</form:form>
	
	<br> <br>
	
	
	
</body>

</html>