<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>

<h1>Menu</h1>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<ul>
	<li><a href="${contextPath}/sqljstl">SQL Tags</a></li>
	<li><a href="${contextPath}/service">Service Layer</a></li>
</ul>


</body>
</html>