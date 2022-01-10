<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC  - Employee</title>
</head>
<body>
  <table>
    <tr>
      <td>First Name: ${Employee.username}</td>
    </tr>
    <tr>
      <td>Last Name: ${Employee.password}</td>
    </tr>
    <tr>
      <td>Email: ${Employee.email}</td>
    </tr>
    <tr>
      <td>Contact:{Employee.contact}</td>
    </tr>
    <tr>
      <td>City:{Employee.city}</td>
    </tr>
    <tr>
      <td>Zipcode:{Employee.zipcode}</td>
    </tr>
  </table>
</body>
</html>