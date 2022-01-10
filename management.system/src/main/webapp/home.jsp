<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME PAGE</title>
</head>
<body>
<form action="addEmployee" align="center">
	<input type="text" name="eId" placeholder="Enter ID"><br><br>
	<input type="text" name="eName" placeholder="Enter Name"><br><br>
	<input type="text" name="eDepartment" placeholder="Enter Department"><br><br>
	<input type="text" name="eDesignation" placeholder="Enter Designation"><br><br>
	<input type="text" name="eSalary" placeholder="Enter Salary"><br><br>
	<input type="Submit"><br><br>
	</form>
<form action="getEmployee" align="center">
	<input type="text" name="eId" placeholder="Enter ID for searching"><br><br>
	<input type="Submit">
</form>

<form action="deleteEmployee" align="center">
	<input type="text" name="eId" placeholder="Enter ID for deleting"><br><br>
	<input type="Submit">
</form>
</body>
</html></html>