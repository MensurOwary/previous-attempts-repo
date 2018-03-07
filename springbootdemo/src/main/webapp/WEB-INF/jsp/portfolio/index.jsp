<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
  <!-- Theme Made By www.w3schools.com - No Copyright -->
  <title>Portfolio of ${title}</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-default">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">${title}</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#who">WHO</a></li>
        <li><a href="#what">WHAT</a></li>
        <li><a href="#where">WHERE</a></li>
      </ul>
    </div>
  </div>
</nav>

<!-- First Container -->
<div class="container-fluid bg-1 text-center" id="who">
  <h3 class="margin">${header1}</h3>
  <img src="${pageContext.request.contextPath}/images/bird.jpg" class="img-responsive img-circle margin" style="display:inline" alt="Bird" width="350" height="350">
  <h3>${lower1}</h3>
</div>

<!-- Second Container -->
<div class="container-fluid bg-2 text-center" id="what">
  <h3 class="margin">${header2}</h3>
  <p>${lower2}</p>
</div>

<!-- Third Container (Grid) -->
<div class="container-fluid bg-3 text-center" id="where">    
  <h3 class="margin">${location}</h3><br>
  <div class="row">
    <div class="col-sm-4">
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
      <img src="${pageContext.request.contextPath}/images/birds1.jpg" class="img-responsive margin" style="width:100%" alt="Image">
    </div>
    

    
    <div class="col-sm-4"> 
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
      <img src="${pageContext.request.contextPath}/images/birds2.jpg" class="img-responsive margin" style="width:100%" alt="Image">
    </div>
    <div class="col-sm-4"> 
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
      <img src="${pageContext.request.contextPath}/images/birds3.jpg" class="img-responsive margin" style="width:100%" alt="Image">
    </div>
  </div>
</div>

<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>
