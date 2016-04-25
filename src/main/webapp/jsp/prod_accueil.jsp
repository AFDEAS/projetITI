<%@ page pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Producteur | L'Eau qui germe</title>
<meta charset="UTF-8" />
<link type="text/css" rel="stylesheet" href="css/prod.css" />
<link rel="icon" href="img/eau.ico" />
</head>



<body>



	<!--   NAVIGATION   -->
	<header>

		<%@include file="prod_nav.jsp"%>

	</header>



	<span id="globalcontent"> 
	 <span id="content">	

	<!--   PARTIE GAUCHE   --> 
		<span	id="col-01">
			<div id="titre_01">
				<p>
				<h1>
					Bienvenue
					<h1>
						</p>
			</div>


			<div id="corps_01">
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Donec bibendum magna at dolor egestas, dictum elementum velit
					iaculis. Cras aliquet metus eget odio dapibus, molestie tempor dui
					posuere. Quisque rutrum suscipit turpis non aliquet. Aliquam augue
					sapien, viverra imperdiet orci quis, dapibus scelerisque dui.
					Integer maximus porta sem, vitae tempor nibh lacinia vel.
			</div>
	</span>
	
	
	
	 <!-- SEPARATION VERTICALE -->
	<div id="ligneverticale"></div>
	
	
	
	 <!--  PARTIE DROITE --  INFORMATIONS UTILISATEUR -->
	<span id="col-02">
		<div id="titre_02">
				<p>
				<h1>
					Mes informations
					<h1>
						</p>
			</div>


			<div id="corps_02">

				<div class="prod_acc_ligne">Nom:  <div id="prod_acc_nom" class="prod_acc_suligne">${producteur.nom}</div> </div> <br/> 

				<div class="prod_acc_ligne">Prénom: <div id="prod_acc_prenom" class="prod_acc_suligne"></div>${producteur.prenom} </div> <br/>

				<div class="prod_acc_ligne">Adresse: <div id="prod_acc_adress" class="prod_acc_suligne">${producteur.adresse}</div> </div> <br/>
				
				<div class="prod_acc_ligne">Nombre de commande en cours: <div id="prod_acc_nbcommandes" class="prod_acc_suligne">PAS COMPLETE</div></div><br/>
				
				<div class="prod_acc_ligne">Solde: <div id="prod_acc_montant" class="rest_acc_suligne">A COMPLETER CFA</div> </p> <br/>

				<p>
					<a href="modificationproducteur"><input type="button" id="modifprod" value="Modifier mes informations" /></a>
				</p>

			</div>
	</span> 

	</span>



</span>


</body>

</html>