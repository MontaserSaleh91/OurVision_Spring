<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>new</title>
</head>
<body>
	<div class="container1">
		<h1>address</h1>
	    <form:errors path="address.*"/>
		<form:form method="POST" action="/address" modelAttribute="address">
	        <p>
	            <form:label path="street">street:</form:label>
	            <form:input type="text" path="street"/>
	        </p>
	        <p>
	            <form:label path="city">city:</form:label>
	            <form:input type="text" path="city"/>
	        </p>
	       	<p>
	            <form:label path="phone_number">phone_number:</form:label>
	            <form:input type="text" path="phone_number"/>
	        </p>
	        <form:input type="hidden" path="user_address" value="${user.id}"/>
	        <input type="submit" value="Create"/>
	    </form:form>
    </div>
    
</body>
</html>