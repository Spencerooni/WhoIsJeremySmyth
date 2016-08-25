<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert the Employee details</title>
<link rel="stylesheet" type="text/css" href="style.css"/>
</head>
<body>

<h1>Employee Details Form</h1>

<!--${msg}-->
<p></p>
<p>Please enter an employees details into the following form:</p>
<p></p>


<form action="index.mvc" method="POST">
  Employee Number:<br>
  <input type="text" name="employeeNum"><br>
  <p></p>
  First name:<br>
  <input type="text" name="firstName"><br>
 <p></p>
  Last Name:<br>
  <input type="text" name="lastName"><br>
  <p></p>
  Address:<br>
  <input type="text" name="address1"><br>
  <p></p>
  <input type="text" name="address2"><br>
  <p></p>
  <input type="text" name="address3"><br>
  <p></p>
  City:<br>
  <input type="text" name="city"><br>
  <p></p>
  County:<br>
  <input type="text" name="county"><br>
  <p></p>
  Postcode:<br>
  <input type="text" name="postcode"><br>
  <p></p>
  Country:<br>
  <input type="text" name="country"><br>
  <p></p>
  Email Address:<br>
  <input type="text" name="email"><br>
  <p></p>
  Nation Insurance Number(NIN):<br>
  <input type="text" name="nationalInsuranceNum"><br>
  <p></p>
  Account Number:<br>
  <input type="text" name="accountName"><br>
  <p></p>
  IBAN:<br>
  <input type="text" name="iban"><br>
  <p></p>
  BIC:<br>
  <input type="text" name="bic"><br>
  <p></p>
  Starting Salary:<br>
  <input type="text" name="salary"><br>  
  <p></p>
  <input type="submit">
</form>



<p></p>
<button type="button">View Employee Report</button>


</body>
</html>