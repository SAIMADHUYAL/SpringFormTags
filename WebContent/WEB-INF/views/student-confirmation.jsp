<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>This is Process Form</title>
	</head>
	
	<body>
		Student name is: ${student.firstName} ${student.lastName} 
		
		<br><br>
		
		Country: ${student.country }
		
		<br><br>
		Favorite Language: ${student.fav_language }
		<br><br>
		Operating Systems: 
		<ol>
		<c:forEach var = "temp" items = "${student.operatingSystems }">
			<li> ${temp}</li>
			</c:forEach>
		</ol>
	</body>
</html>