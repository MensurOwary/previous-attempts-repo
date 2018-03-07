<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<section class="thumbnails">
	<!--  
	<c:forEach var="items" items="${dreams}">
		<div>
			<c:forEach var="item" items="${items}">
				<a href="${item.imgUrl}"> <img src="${item.imgUrl}" alt="" />
					<h3>${item.title}</h3>
				</a>
			</c:forEach>
		</div>
	</c:forEach>
	-->
	<c:forEach var="items" items="${dreams}">
		<div>
			<c:forEach var="item" items="${items}">
				<a href="dream/1"> <img src="<spring:url value="${item.imgUrl}"/>" alt="" />
					<h3>${item.title}</h3>
				</a>
			</c:forEach>
		</div>
	</c:forEach>

</section>