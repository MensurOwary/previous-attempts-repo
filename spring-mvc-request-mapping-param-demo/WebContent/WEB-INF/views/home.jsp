<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<style>
	h1{
		text-align:center;
		font-family:Helvetica;
	}
</style>
</head>
<body>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<h1>Welcome and <c:out value="${greeting}"/>!</h1>
<hr>

<h3>Organization Details</h3>
<a href="${contextPath}/location">Click!</a>


</body>
</html>