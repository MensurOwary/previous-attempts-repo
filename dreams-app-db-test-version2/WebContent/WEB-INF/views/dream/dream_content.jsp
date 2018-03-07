<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="container-fluid">
	<div class="row">
		<div class="col-12 post">
			<div class="row">
				<div class="col-4 image-container">
					<img src="<spring:url value="/${dream.imgUrl}" />" class="img-responsive" alt=""
						width="100%">
				</div>
				<div class="col-8 description">
					<h1>${dream.title}</h1>
					<p>${dream.description}</p>
				</div>
			</div>
		</div>
	</div>
</div>