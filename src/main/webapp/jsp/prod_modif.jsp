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

		
		<span id="col_00">
			<div id="titre_00">
					<h1>
						Mes informations
					<h1>
			</div>
		
			<span id="corps_00">
			 <form id="prod_modif" method="POST" action="modificationproducteur">

			
				<div class="prod_acc_ligne">
					Nom:  
					<input name="nomproducteur" id="prod_submit_nom" type="text" class="prod_submit_suligne" value="${producteur.nom}">
				</div> <br/> <br/>

				<div class="prod_acc_ligne">
					Prénom: 
					<input name="prenomproducteu" id="prod_submit_prenom" type="text" class="prod_submit_suligne" value="${producteur.prenom}"> 
				</div> <br/><br/>

				<div class="prod_acc_ligne">
					Adresse: 
					<input name="adresseproducteur" id="prod_submit_adress" type="text" class="prod_submit_suligne" value="${restaurateur.adresse}"> 
				</div> <br/><br/>
				
				<div class="prod_acc_ligne">
					MotDePasse: 
					<input name="mdpproducteur" id="prod_submit_adress" type="password" class="prod_submit_suligne" value=""> 
				</div> <br/><br/>
				
				
				<button type="submit" name="submitmodifprod" value="prod_modif_button" class="prod_button"> Enregistrer </button>
				
				
				<button type="submit" name="cancelprod" value="prod_cancel_button" class="prod_button"> Annuler </button>
				
				

			 </form>
			</span>
	</span> 

	</span>

	</span>


</body>

</html>