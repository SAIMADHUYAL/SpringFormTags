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
			<form:select path="country">
				<form:option value="Brazil" label="Brazil"/>
				<form:option value="India" label="India"/>
				<form:option value="United States" label="United States"/>
				<form:option value="Singapore" label="Singapore"/>
				<form:option value="Indonasia" label="Indonasia"/>
			</form:select>
			<input type="submit" value="Submit" /><!-- After submitting the spring sets the feilds i.e., student.setFirstName() & student.setLastName() -->
		</form:form>
	</body>


</html>