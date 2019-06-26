<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- modelAttribute states which obj will be used to set/get form attributes -->
	<!-- when form is loaded it used getters of attributes to get values. If its null then the field is set empty -->
	<!-- When we submit it calls setters on attributes -->
	<!-- eg it calls getFirstName(), setFirstName() of student obj got frm controller -->
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName" />	<br>
		Last name : <form:input path="lastName" />	<br>
		
		<input type="submit" value="submit">
	</form:form>
</body>
</html>