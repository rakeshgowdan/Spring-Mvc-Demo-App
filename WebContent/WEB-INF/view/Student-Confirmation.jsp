<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student-Confirmation</title>
</head>
<body>
<h4>Student Details</h4>
<br>
First Name is ${student.firstName}
<br>
Last Name is ${student.lastName}
<br>
Country is ${student.country}
<br>
Preferred coding language is ${student.language}
<br>
Can work on operating systems
<ul>
<c:forEach var="temp" items="${student.os}">
<li>
${temp}
</li>
</c:forEach>
</ul>

</body>
</html>