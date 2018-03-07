<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Variables -->
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>

<head>

	<meta charset="utf-8">
	<meta name="viewport"
		content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="description" content="">
	<meta name="author" content="">
	
	<title>Title</title>
	
	<!-- Bootstrap core CSS -->
	<link href="${path}/vendor/bootstrap/css/bootstrap.css" rel="stylesheet">
	
	<!-- Custom styles for this template -->
	<link href="${path}/css/4-col-portfolio.css" rel="stylesheet">

</head>

<body>
	<div class="container">
		<div class="row">
		<c:forEach items="${dreams}" var="dream">
			<div class="col-lg-3 col-md-4 col-sm-6 portfolio-item">
				<div class="card h-100">
					<a href="#"><img class="card-img-top"
						src="http://placehold.it/700x400" alt=""></a>
					<div class="card-body">
						<h4 class="card-title">
							<a href="#">${dream.header}</a>
						</h4>
						<p class="card-text">${dream.content}</p>
					</div>
				</div>
			</div>
		</c:forEach>	
			
		</div>
	</div>



	<!-- Bootstrap core JavaScript -->
	<script src="${path}/vendor/jquery/jquery.min.js"></script>
	<script src="${path}/vendor/popper/popper.min.js"></script>
	<script src="${path}/vendor/bootstrap/js/bootstrap.min.js"></script>

</body>

</html>
