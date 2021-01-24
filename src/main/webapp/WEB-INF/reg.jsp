<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet"  href="css/reg.css">
    
    <title>Register</title>
</head>
<body>

<form action="/action_page.php" style="border:1px solid #ccc">
        <div class="container">
          <h1>Register</h1>
          <p>Please fill in this form to create an account.</p>
          <hr>
          <label for="first_name"><b>First Name</b></label>
          <input type="text" placeholder="Enter First Name" name="first_name" required>
          
          <label for="last_name"><b>Last Name</b></label>
          <input type="text" placeholder="Enter Last Name" name="last_name" required>

          <label for="email"><b>Email</b></label>
          <input type="text" placeholder="Enter Email" name="email" required>
          <br>
          <label for="phone_number"><b>Phone Number</b></label>
          <input type="text" placeholder="Enter Phone Number" name="phone_number" required>
      
          <label for="psw"><b>Password</b></label>
          <input type="password" placeholder="Enter Password" name="psw" required>
      
          <label for="psw-repeat"><b>Repeat Password</b></label>
          <input type="password" placeholder="Repeat Password" name="psw-repeat" required>
          
          <label>
            <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
          </label>
          
          <center>
          <div class="clearfix">
            <button type="submit" class="signupbtn">Sign Up</button>
          </div>
        </center>
        </div>
      </form>
	   
</body>
</html>