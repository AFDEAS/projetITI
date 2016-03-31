<%@ page pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head> 
		<title> L'Eau qui germe </title>
		<meta charset="UTF-8"/>
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="Boostrap/bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link type="text/css" rel="stylesheet" href="css/css.css"/>
		<link rel="icon" href="img/eau.png" />
    <!-- Basic stylesheet -->
<link rel="stylesheet" href="owl-carousel/owl.carousel.css">
 <link rel="stylesheet" href="owl-carousel/owl.transitions.css">
 <!-- Default Theme -->
<link rel="stylesheet" href="owl-carousel/owl.theme.css">


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




<span id="col-01">

	<p id="presentation">
		${texteAccueil}
	</p>





<!-- CAROUSSEL -->
	<div id="empcar">
  
		<div id="owl-demo" class="owl-carousel owl-theme">
 
	<c:forEach var="photo" items="${listPhoto}"> 
	  		<div class="item"><img src="img/${photo.chemin}" alt="${photo.description}"></div>
 	</c:forEach>
 
 
 
		</div>

	</div>




</span>






<span id="col-02">

<!-- RESEAUX SOCIAUX -->

	<div id="RS"> <h3> Nous suivre sur Facebook!</h3> 
	 
		<a href="https://fr-fr.facebook.com/Afdeas" target="_blank" />  
			<img src="img/facebook.png" />
		</a>

	</div>



<c:if test="${utilisateurConnecte == null}">

<!-- ZONE MEMBRE -->

	<div id="ZM"> <p> 
	

<c:if test="${messageErreur != null}">

<p>Email ou mot de passe incorrect</p>

</c:if>

		<div id="titreform">
			Zone Membre
		</div>


	


		<form method=POST  >
		
			<div id="login">
				Identifiant
			</div>
			<div id="caselogin">
				<champ name="login" />
				<input type="text" name="login" size="20" maxlength="30" placeholder="Votre Identifiant" required> 
			</div>


			<div id="password">
				Mot de Passe
			</div>
			<div id="casepassword">
				<champ name="password" />
				<input type="password" name="password" size="20" maxlength="30" placeholder="Votre Mot de Passe" required> 
			</div>


			<div id="soumettre">
				<champ name="soumettre" />
				<input type="submit" value="Se connecter"> 
			</div>

		</form>



		<div  id="mdpperdu"> 
			<a href="http://www.google.fr" target="_blank" >  Mot de passe perdu	</a>
		</div>

	</div>


</c:if>

<!-- FAIRE UN DON -->

	<div id="Don">
		<form action="https://www.paypal.com/cgi-bin/webscr" target="_blank" method="post" target="_top"> 
			<input type="hidden" name="cmd" value="_s-xclick">
			<input type="hidden" name="hosted_button_id" value="53JSZTGKNXDM2">
			<input type="image" src="img/Boutonfaireundon.png" border="0" name="submit" alt="PayPal, le réflexe sécurité pour payer en ligne">
		</form>
	</div>

</span>


<!--  PLAN DU SITE -->

<footer>


 <%@include file="foot.jsp" %>



</footer>


</span>









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





    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
   <!-- <script src="../../assets/js/vendor/holder.min.js"></script> -->
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
   <!-- <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script> -->
</body>
