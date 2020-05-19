<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

	<head>
		<title>Student Registration Form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			
			First Name: <form:input path="firstName" /><!-- here the spring gets the field to firstName i.e., student.getFirstName() -->
			<br><br>
			
			Last Name: <form:input path="lastName"/>
			<br><br>
			
			Country:
			<!-- Creating Drop Down List -->
			<form:select path="country">
				<form:options items="${countryList }"/>
			</form:select>
			
			<br><br>
			Favorite Language:
			<!-- Creating Radio Buttons -->
			Java<form:radiobutton path="fav_language" value="Java"/>
			PHP<form:radiobutton path="fav_language" value="PHP"/>
			HTML<form:radiobutton path="fav_language" value="HTML"/>
			CSS<form:radiobutton path="fav_language" value="CSS"/>
			<input type="submit" value="Submit" /><!-- After submitting the spring sets the feilds i.e., student.setFirstName() & student.setLastName() -->
		</form:form>
	</body>


</html>