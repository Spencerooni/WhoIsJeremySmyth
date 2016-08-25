<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert the Employee details</title>
</head>
<body>

<h1>Employee Details Form</h1>

${msg}
<p></p>



<form action="EmployeeController" method="GET">
  Employee Number:<br>
  <input type="text" name="employeeNum"><br>
  First name:<br>
  <input type="text" name="firstName"><br>
  Last Name:<br>
  <input type="text" name="lastName"><br>
  <p></p>
  <input type="submit">
</form>


</body>
</html>