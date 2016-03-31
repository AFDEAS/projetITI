<!DOCTYPE html>
<html>
<head>
<title>Restaurateur | L'Eau qui germe</title>
<meta charset="UTF-8" />
<link type="text/css" rel="stylesheet" href="css/rest.css" />
<link rel="icon" href="img/eau.ico" />
</head>



<body>



	<!--   NAVIGATION   -->
	<header>

		<%@include file="rest_nav.jsp"%>

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
			 <form id="rest_modif" method="POST" action="modificationrestaurateur">

			
				<div class="rest_acc_ligne">
					Nom:  
					<input name="nomrestaurateur" id="rest_submit_nom" type="text" class="rest_submit_suligne" value="${restaurateur.nom}">
				</div> <br/> <br/>

				<div class="rest_acc_ligne">
					Prénom: 
					<input name="prenomrestaurateur" id="rest_submit_prenom" type="text" class="rest_submit_suligne" value="${restaurateur.prenom}"> 
				</div> <br/><br/>

				<div class="rest_acc_ligne">
					Adresse: 
					<input name="adresserestaurateur" id="rest_submit_adress" type="text" class="rest_submit_suligne" value="${restaurateur.adresse}"> 
				</div> <br/><br/>
				
				<div class="rest_acc_ligne">
					MotDePasse: 
					<input name="mdprestaurateur" id="rest_submit_adress" type="password" class="rest_submit_suligne" value=""> 
				</div> <br/><br/>
				
				
				<button type="submit" name="submitmodifrestau" value="rest_modif_button" class="rest_button"> Enregistrer </button>
				
				
				<button type="submit" name="cancelrestau" value="rest_cancel_button" class="rest_button"> Annuler </button>
				
				

			 </form>
			</span>
	</span> 

	</span>

	</span>


</body>

</html>