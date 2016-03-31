<%@ page pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
  <head>
    <style type="text/css">
      html, body { height: 100%; margin: 0; padding: 0; }
      #map { height: 100%; }
    </style>
    <title> Carte | L'Eau qui germe </title>
    <meta charset=UTF-8></meta>
    <link rel="stylesheet" type="text/css" href="css/css.css">
    <link rel="icon" href="img/eau.ico" />
     <script src="js/carte.js" type="application/javascript"></script>
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
 <span id="mapcontent">


    <div id="explication">

      <p> Voici une carte intéractive avec les différents villages où l'association mène des actions. Cliquez sur les points rouges pour plus d'informations!</p>


    </div>



   <div id="map">




   </div> 
   
   <% int j = 0;
int z = 0;%>

<c:forEach var="village" items="${listVillage}"> 


<% 
		
				request.setAttribute("photomap", (hei.iti.projet.model.Photo) request.getSession().getAttribute("PhotoMap"+j));
				System.out.println("j="+j);
				System.out.println("photomap = "+request.getSession().getAttribute("PhotoMap"+j));
				System.out.println("photomaps = "+request.getSession().getAttribute("photomap"));
				
				
				j++;
				
				 
				 %>
				 
				 
				 

       <div class="information">

          <div class="infotitre">${village.nom}</div>

          <img class="imginfo" src="img/${photomap.chemin}">

          <p>${village.description}</p>

          <input class="fermer" type="button" id="fermer" value="Fermer" />


        </div>

</c:forEach>

         
   

   
    <script async defer
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyArsEhSre8WGWT-ajKr1ERUvEf-WJpL3sQ&callback=initMap">
    </script>
		

		
 </span>
</span>


<!-- 
<footer id="footcarte">


	 <%@include file="foot.jsp" %>


</footer>
-->

  </body>
</html>