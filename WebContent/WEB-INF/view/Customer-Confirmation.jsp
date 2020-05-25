<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details</title>
</head>
<body>
FirstName :: ${customer.fname}
<br>
LastName :: ${customer.lname}
<br>
Has enrolled for ${customer.courseCode}
<br>
Following customer Needs ${customer.freePasses} passes for the Webinar at location ${customer.postalCode}
</body>
</html>