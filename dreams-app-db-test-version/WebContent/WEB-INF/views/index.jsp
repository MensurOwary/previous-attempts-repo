<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>${title}</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="<spring:url value="/resources/css/bootstrap.css"/>" />
<link rel="stylesheet" href="<spring:url value="/resources/css/main.css"/>" />
</head>
<body>

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<jsp:include page="header.jsp"/>

		<!-- Main -->
		<section id="main">  
		
			<jsp:include page="${page}"/>
		
		</section>


		<!-- Footer -->
		<jsp:include page="footer.jsp" />

	</div>

	<!-- Scripts -->
	<script src="<spring:url value="/resources/js/jquery.min.js"/>"></script>
	<script src="<spring:url value="/resources/js/skel.min.js"/>"></script>
	<script src="<spring:url value="/resources/js/main.js"/>"></script>
	<script src="<spring:url value="/resources/js/bootstrap.min.js"/>"></script>

</body>
</html>