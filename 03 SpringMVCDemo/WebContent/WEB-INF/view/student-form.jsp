<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Student Registration form</title>
	</head>
	
	<body>
		
		<form:form action="processForm" modelAttribute="student" >
			
			First name: <form:input path="firstName"/>
			<br><br>
			
			Last name: <form:input path="lastName"/>
			<br><br>
			
			Country: 
			<form:select path="country">
				<form:options items="${student.countryOptions}" />
			</form:select>
			<br><br>
			
			Favorite language:
			<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"  />
			<br><br>
			
			Operating Systems:
			Linux <form:checkbox path="operatingSystems" value="Linux"/>
			Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
			MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
			<br><br>
			
			<input type="submit" value="submit" />
			
		</form:form>
		
	</body>
</html>