<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer-Form</title>
<style >
.error{color:red;}
</style>
</head>
<body>
<i>Fill up the below form </i>
<form:form action="processForm" modelAttribute="customer">
FirstName :: <form:input path="fname"/>
<br><br>
LastName(*) :: <form:input path="lname"/>
<form:errors path="lname"  cssClass="error" />
<br><br>
<input type="submit" value="Submit"/>
</form:form>

</body>
</html>