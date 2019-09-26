<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE>
<html>
<head>
	<title>Customer Registration Form</title>

	<style>
		.error{color:red}
	</style>


</head>

<body>

	<h3>Welcome to the Customer Form</h3>

	<form:form action="processForm" modelAttribute="customer">
		
		Please fill in the form. (*) means required. <br>
	
		Firstname: <form:input path="firstName" placeholder="first name" /> <br>
		Lastname (*): <form:input path="lastName" placeholder="last name" /> <br>
		<form:errors path="lastName" cssClass="error" />
		<br>

		<input type="submit" value="good to go >> "/>

	</form:form>
</body>

</html>