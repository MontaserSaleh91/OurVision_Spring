<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Register</h1>
	    <form:errors path="newPass.*"/>
	    
	    <form:form method="POST" action="/newpass" modelAttribute="newPass" enctype="multipart/form-data">
	        <p>
	            <form:label path="personal_image">file:</form:label>
	            <form:input type="file" path="personal_image" accept="image/png, image/jpeg" />
	        </p>
	        <p>
	            <form:label path="id_image">img:</form:label>
	            <form:input type="file" path="id_image"accept="image/png, image/jpeg" />
	        </p>
	        <p>
	            <form:label path="full_name">full_name:</form:label>
	            <form:input type="text" path="full_name"/>
	        </p>
	         <p>
	            <form:label path="id_number">id_number:</form:label>
	            <form:input type="text" path="id_number"/>
	        </p>
	        <p>
	            <form:label path="date_of_birth">date_of_birth:</form:label>
	            <form:input type="date" path="date_of_birth"/>
	        </p>
	        <p>
	            <form:label path="place_of_birth">place_of_birth:</form:label>
	            <form:input path="place_of_birth"/>
	        </p>
	        <p>
	            <form:label path="sex">sex:</form:label>
	            <form:input path="sex"/>
	        </p>
	        <p>
	            <form:label path="profission">profission:</form:label>
	            <form:input path="profission"/>
	        </p>
	        
	        <div class="col-sm-12"><input type="submit" value="NewPass"/>
		         <div class="btn btn-warning">Submit</div>

		   </div>
	        
	    </form:form>
</body>
</html>