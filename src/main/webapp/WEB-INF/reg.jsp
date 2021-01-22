<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link rel="stylesheet"  href="css/style.css">
<title>index</title>
</head>
<body>

<h1>Register</h1>
	    <form:errors path="user.*"/>
	    
	    <form:form method="POST" action="/registration" modelAttribute="user">
	        <p>
	            <form:label path="first_name">FirstName:</form:label>
	            <form:input type="text" path="first_name"/>
	        </p>
	         <p>
	            <form:label path="last_name">LastName:</form:label>
	            <form:input type="text" path="last_name"/>
	        </p>
	        <p>
	            <form:label path="email">Email:</form:label>
	            <form:input type="email" path="email"/>
	        </p>
	        <p>
	            <form:label path="password">Password:</form:label>
	            <form:password path="password"/>
	        </p>
	        <p>
	            <form:label path="passwordConfirmation">Password Confirmation:</form:label>
	            <form:password path="passwordConfirmation"/>
	        </p>
	        
	        <div class="col-sm-12"><input type="submit" value="Register"/>
		         <div class="btn btn-warning">Submit</div>
		             color: white;
    			     font-size: 20px;
   				     border: 1px solid white;
  				     background-color: #080808;
   					 width: 32%;
   				     margin-left: 41%;
    				 margin-top: 16px;
					 box-shadow: 0px 2px 2px 0px white;
		   </div>
	        
	    </form:form>

	   
</body>
</html>