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
		Lastname (*): <form:input path="lastName" placeholder="last name" />
		<form:errors path="lastName" cssClass="error" /> <br>
		Freepasses: <form:input path="freePasses" placeholder="between 1 and 10"/>
		<form:errors path="freePasses" cssClass="error"/><br>
		Postalcode: <form:input path="postalCode" placeholder="enter 5 characters"/>
		<form:errors path="postalCode" cssClass="error" /> <br>		
		Course code: <form:input path="courseCode" placeholder="enter course code"/>
		<form:errors path="courseCode" cssClass="error" /> <br>		
		
		
		<input type="submit" value="good to go >> "/>

	</form:form>
</body>

</html>