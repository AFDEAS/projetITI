<%@ page pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head> 
		<title> Projets | L'Eau qui germe </title>
		<meta charset="UTF-8"/>
		<link type="text/css" rel="stylesheet" href="css/css.css"/>
		<link rel="icon" href="img/eau.ico" />
		<link rel="stylesheet" href="owl-carousel/owl.carousel.css">
	<link rel="stylesheet" href="owl-carousel/owl.transitions.css">
	<link rel="stylesheet" href="owl-carousel/owl.theme.css">
	<script src="js/projets.js" type="application/javascript"></script>
	</head>

<body>




	
<!-- NAVIGATION -->
	
<c:if test="${utilisateurConnecte == null}">	
<header>
	<%@include file="nav.jsp" %>
</header>
</c:if>


<c:if test="${utilisateurConnecte != null}">
<header>
		<%@include file="nav_mod.jsp"%>
</header>
</c:if>


<span id="globalcontent">
 <span id="content">



<c:forEach var="projet" items="${listProjet}"> 

	 <div class="projet" id="proj11"> <h2>${projet.nom}</h2>
	 </div> 

	
</c:forEach>
 





	<div id="empcarproj">

		<div id="owl-demo" class="owl-carousel owl-theme">
 
 			<c:forEach var="photo" items="${listPhoto}"> 
 
 
		  <div class="item"><img class="imgprojet" src="img/${photo.chemin}">
		  <div class="contientdesc">${photo.description}

	 </div> </div>

			</c:forEach>

		 

		
		</div>


	</div>

 </span>
</span>

<!--  PLAN DU SITE  -->

<footer>

 <%@include file="foot.jsp" %>

</footer>

	<script src="js/jquery-1.11.3.min.js"></script>
 
	<!-- Include js plugin -->
	<script src="owl-carousel/owl.carousel.js" type="application/javascript"></script>

	<script>
    	$(document).ready(function() {
      	$("#owl-demo").owlCarousel({

	      autoPlay: 3000,
    	  navigation : true,
	      slideSpeed : 300,
	      paginationSpeed : 400,
	      singleItem : true

	      // "singleItem:true" is a shortcut for:
    	  // items : 1, 
    	  // itemsDesktop : false,
  		  // itemsDesktopSmall : false,
	      // itemsTablet: false,
	      // itemsMobile : false

     	 });
    	});

 
	</script>



</body>

</html>