<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>

<html>
<head>
	<title>Student Registration Form</title>
</head>
<body>

	<h3>Het Studenten Confirmatie Formulier</h3>

	<h1>GELUKT!</h1>
	
	The student is confirmed: ${student.firstName } ${student.lastName }
	<br>
	Country: ${student.country}
	<br>
	Favorite Language: ${student.favoriteLanguage }
	<br>
	Used Operating Systems: 
	
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems }">
			<li>	${temp } </li>
		</c:forEach>
	</ul>
	<br>
	
</body>

</html>