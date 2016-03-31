<%@ page pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head> 
		<title> A Propos | L'Eau qui germe </title>
		<meta charset="UTF-8"/>
		<link type="text/css" rel="stylesheet" href="css/css.css"/>
		<link rel="icon" href="img/eau.ico" />
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


	<h1>A Propos de l'association</h1>



	<div id="propos">

		<p id="imgpropos"> 
		
	
		<img src="img/${photoPropos.chemin}" alt="${photo.description}"> 

		
		</p>

		<p>
		${textePropos}
		</p>
	</div>
	

 </span>
<!--  PLAN DU SITE  -->

<footer>

 <%@include file="foot.jsp" %>

</footer>

</span>






</body>

</html>