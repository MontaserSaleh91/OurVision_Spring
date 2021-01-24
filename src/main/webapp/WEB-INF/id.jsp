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
		<h1>id</h1>
	    <form:errors path="id.*"/>
		<form:form method="POST" action="/id" modelAttribute="id">
	        <p>
	            <form:label path="email">email:</form:label>
	            <form:input type="text" path="email"/>
	        </p>
	        <p>
	            <form:label path="password">password:</form:label>
	            <form:input type="text" path="password"/>
	        </p>
	       
	        <form:input type="hidden" path="user_id" value="${user.id}"/>
	        <input type="submit" value="Create"/>
	    </form:form>
    </div>
    
</body>
</html>