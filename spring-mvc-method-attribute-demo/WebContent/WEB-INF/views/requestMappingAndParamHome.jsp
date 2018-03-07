<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Request Param and Mapping Home</title>
<style>
body {
	font-family: Helvetica;
}

h1 {
	text-align: left;
	color: indigo;
}

input[type=text] {
	width: 350px;
	height: 30px;
	padding: 15px 10px;
}

input[type=submit] {
	width: 150px;
	height: 30px;
	color: white;
	background: green;
}
</style>
</head>
<body>
	<h1>${header}</h1>
	<h1>Test 1</h1>
	<form action="test1" method="POST">
		<label>Organization : <input type="text" name="orgName"
			placeholder="Enter an Organization Name">
		</label> <input type="submit" name="submit" value="Find!">
	</form>

	<h1>Test 2</h1>
	<form action="test2" method="GET">
		<label>Organization : <input type="text" name="orgName"
			placeholder="Enter an Organization Name">
		</label> <input type="submit" name="submit" value="Find!">
	</form>

	<h1>Test 3</h1>
	<form action="test3">
		<input type="submit" name="submit" value="Find!">
	</form>

	<h1>Test 4 : Default Value</h1>
	<form action="test4" method="POST">
		<label>Organization : <input type="text" name="orgName"
			placeholder="Enter an Organization Name">
		</label> <input type="submit" name="submit" value="Find!">
	</form>

	<h1>Test 5 : @RequestParam without a name attribute</h1>
	<form action="test5" method="POST">
		<label>Organization : <input type="text" name="orgName"
			placeholder="Enter an Organization Name">
		</label> <input type="submit" name="submit" value="Find!">
	</form>

</body>
</html>