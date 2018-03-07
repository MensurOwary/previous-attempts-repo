<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${title}</title>
</head>
<body>

	<h1>Organizations</h1>
	
	<sql:query var="rs" dataSource="jdbc/springdb">
		SELECT * FROM organization
	</sql:query>
	
	
	<c:forEach var="row" items="${rs.rows}">
		<h3>
			${row.companyName}
		</h3>
		Foundation : ${row.yearOfIncorporation} <br>
		Postal Code : ${row.postalCode} <br>
		Employee Count : ${row.employeeCount} <br>
		Motto : ${row.slogan} <br><br>
		
	</c:forEach>

</body>
</html>