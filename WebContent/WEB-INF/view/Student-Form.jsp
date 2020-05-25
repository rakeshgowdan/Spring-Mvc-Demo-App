<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
FirstName :: <form:input path="firstName"/>

<br><br>
LastName :: <form:input path="lastName"/>
<br><br>
<!-- 
Country :: <form:select path="country">
<form:option value="India" label="India"></form:option>
<form:option value="USA" label="USA"></form:option>
<form:option value="UK" label="UK"></form:option>
<form:option value="Brazil" label="Brazil"></form:option>

</form:select>
 -->
 Country :: <form:select path="country" items="${student.countryoptions}" />

<br><br>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>