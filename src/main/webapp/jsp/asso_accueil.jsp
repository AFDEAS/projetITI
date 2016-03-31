<!DOCTYPE html>
<html>
<head>
<title>Association | L'Eau qui germe</title>
<meta charset="UTF-8" />
<link type="text/css" rel="stylesheet" href="css/asso.css" />
<link rel="icon" href="img/eau.ico" />
</head>



<body>



	<!--   NAVIGATION   -->
	<header>

		<%@include file="asso_nav.jsp"%>

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
					Lorem ipsum dolor sit amet, consectetur adipiscing elit.
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

				<div id="asso_acc_nom" class="asso_acc_ligne">Nom: PERU </div> <br/> 

				<div id="asso_acc_prenom" class="asso_acc_ligne">Prénom: Patrice </div> <br/>

				<div id="asso_acc_adress" class="asso_acc_ligne">Adesse: 19 rue de la liberté, Dakar </div> <br/>
				
				<div id="asso_acc_command" class="asso_acc_ligne">Nombre de commande en cours: 3</div><br/>
				
				<div id="asso_acc_solde" class="asso_acc_ligne">Solde: 10000 CFA </div><br/>

				<p>
					<a href="modificationassociation"><input type="button" id="modifasso" value="Modifier mes informations" /></a>
				</p>

			</div>
	</span> 

	</span>



</span>


</body>

</html>