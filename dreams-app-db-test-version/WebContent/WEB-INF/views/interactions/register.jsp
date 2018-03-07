<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<script type="text/javascript">
	var datefield = document.createElement("input")
	datefield.setAttribute("type", "date")
	if (datefield.type != "date") { //if browser doesn't support input type="date", load files for jQuery UI Date Picker
		document
				.write('<link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" />\n')
		document
				.write('<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"><\/script>\n')
		document
				.write('<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"><\/script>\n')
	}
</script>

<script>
	if (datefield.type != "date") { //if browser doesn't support input type="date", initialize date picker widget:
		jQuery(function($) { //on document.ready
			$('input[type=date]').datepicker({
				dateFormat : 'yy-mm-dd'
			});
		})
	}
</script>

<section class="register">
	<h1>Register</h1>

	<spring:url value="/__admin00__/register" var="formUrl" />

	<form:form action="${formUrl}" method="POST" modelAttribute="user">

		<div class="form-group">
			<div class="col-12">
				<form:input path="username" type="text" cssClass="form-control"
					placeholder="Username" />
				<form:errors path="username" cssClass="error" />
			</div>
		</div>

		<div class="form-group">
			<div class="col-12">
				<form:input path="firstName" type="text" cssClass="form-control"
					placeholder="First Name" />
				<form:errors path="firstName" cssClass="error" />
			</div>
		</div>

		<div class="form-group">
			<div class="col-12">
				<form:input path="surname" type="text" cssClass="form-control"
					placeholder="Surname" />
				<form:errors path="surname" cssClass="error" />
			</div>
		</div>

		<div class="form-group">
			<div class="col-12">
				<form:input path="password" type="password" cssClass="form-control"
					placeholder="Password" />
				<form:errors path="password" cssClass="error" />
			</div>
		</div>

		<div class="form-group">
			<div class="col-12">
				<form:input path="email" type="email" cssClass="form-control"
					placeholder="example@example.com" />
				<form:errors path="email" cssClass="error" />
			</div>
		</div>

		<div class="form-group">
			<div class="col-12">
				<form:radiobutton path="gender" id="male" value="M"
					cssClass="form-control" />
				<label for="male">Male</label>
				<form:radiobutton path="gender" id="female" value="F"
					cssClass="form-control" />
				<label for="female">Female</label>

				<form:errors path="gender" cssClass="error" />
			</div>
		</div>

		<div class="form-group">
			<div class="col-12">
				<form:input path="birthDate" type="date" value="1999-01-13"
					cssClass="form-control" />
				<form:errors path="birthDate" cssClass="error" />
			</div>
		</div>

		<div class="form-group">
			<div class="col-12">
				<form:input path="avatar" type="file" cssClass="form-control" />
				<form:errors path="avatar" cssClass="error" />
			</div>
		</div>

		<div class="form-group">
			<div class="col-12">
				<button type="submit">Post it!</button>
			</div>
		</div>

	</form:form>
</section>