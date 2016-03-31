<%@ page pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head> 
		<title> Contacts | L'Eau qui germe </title>
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

	<span id="poscontact">  
		
	
		<c:forEach var="Contact" items="${listecontact}"> 
		
		<div class="contact">
			<h2>${Contact.nom} ${Contact.prenom} </h2>
			<p>Téléphone: ${Contact.telephone}</p>
			<p>Email: ${Contact.email}</p>

			<p>
			${Contact.description} </p></div>

		<div id="barre"></div>
		
		</c:forEach>

		
		
	

</span>


 </span>
</span>






</body>

</html>