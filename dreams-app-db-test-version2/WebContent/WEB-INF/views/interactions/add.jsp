<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<section class="add">

<h1>Post Your Dream</h1>

<spring:url value="/dream/add" var="formUrl" /> <form:form
	action="${formUrl}" method="POST" modelAttribute="dream"
	enctype="multipart/form-data">

	<div class="form-group">
		<div class="col-12">
			<form:input path="title" cssClass="form-control" type="text"
				placeholder="Title of the Dream" />
			<form:errors path="title" cssClass="error" />
		</div>
	</div>

	<div class="form-group">
		<div class="col-12">
			<form:textarea path="description" placeholder="Describe it :) " />
			<form:errors path="description" cssClass="error" />
		</div>
	</div>

	<div class="form-group">
		<div class="col-12">

			<form:input path="imageFile" cssClass="form-control" type="file" />
			<form:errors path="imageFile" cssClass="error" />
		</div>
	</div>

	<div class="form-group">
		<div class="col-12">
			<button type="submit">Post it!</button>
		</div>
	</div>

</form:form> </section>