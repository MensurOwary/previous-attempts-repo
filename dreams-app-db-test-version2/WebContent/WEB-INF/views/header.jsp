<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>	
<header id="header">
	<a href="<spring:url value="/"/>">
		<span class="avatar1">
			<img src="<spring:url value="/resources/images/balloon.png" />" alt="logo" />
		</span>
	</a>
	<h1>
		This is <strong>Dreamer</strong>, where you can freely share your
		dreams and read others' :)
	</h1>
	<ul class="icons">
		<li><a href="<spring:url value="/dream/add"/>" title="AA" class="icon style2 fa-plus"><span
				class="label tooltiptext">Post Your Dream</span></a></li>
				
		<li><a href="<spring:url value="/dream/random"/>" class="icon style2 fa-random"><span
				class="label">A Random Dream</span></a></li>
				
		<li><a href="#" class="icon style2 fa-forumbee"><span
				class="label">Community</span></a></li>
				
		<li><a href="<spring:url value="/register"/>" class="icon style2 fa-user-plus"><span
				class="label">Register</span></a></li>
				
		<li><a href="<spring:url value="/login"/>" class="icon style2 fa-sign-in"><span
				class="label">Login</span></a></li>
				
	</ul>
</header>