<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
  <form:form action="showUser" modelAttribute="employee" method="post">
   UserName: <input type ="text" name="username"/>
   password: <input type ="password" name="password"/>
   Email: <input type ="email" name="email"/>
   Contact: <input type ="number" name="contact"/>
   City: <input type = "text" name="city"/>
   Zipcode: <input type ="text" name="zipcode"/>
  </form:form>
</body>
</html>