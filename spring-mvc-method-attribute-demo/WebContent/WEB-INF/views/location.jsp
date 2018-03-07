<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Location</title>
<style>
	body{
		font-family:Helvetica;
	}
	
	input[type=text]{
		width:250px;
		height:40px;
	}
	
</style>
</head>
<body>

<h1>
	<c:out value="${greeting}"></c:out>
</h1>

<br>

<h1>Submitting Locations</h1>

<form action="listOrgs">
	<input type="text" name="locationName">
	<input type="submit" name="Get Organization">
</form>

</body>
</html>