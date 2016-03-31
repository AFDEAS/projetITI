<!DOCTYPE html>
<html>
<head>
<title>Association | L'Eau qui germe</title>
<meta charset="UTF-8" />
<link type="text/css" rel="stylesheet" href="css/asso.css" />
<link rel="icon" href="img/eau.ico" />
<script src="js/asso_restaurateur.js" type="application/javascript"></script>

</head>



<body>



	<!--   NAVIGATION   -->
	<header>

		<%@include file="asso_nav.jsp"%>

	</header>



	<span id="globalcontent"> 
	 <span id="content">	
	 
	 		<span id="col_00">
	 		<div id="titre_00">
					<h1>
						Ajouter un restaurateur		
					<h1>
			</div>
			
			<div id="barre"></div>
			
			<div id="corps_ajout_rest">
		
			<form id="ajout_rest" method="GET" action="ajout_restaurateur">
			
				<div class="update_ligne">Nom:  </div>				
				<input id="ajout_nom_rest" class="update_bout"> <br/>
				<br/>
				
				<div class="update_ligne">Prénom:  </div>
				<input id="ajout_prenom_rest" class="update_bout"> <br/>
				
				<div class="update_ligne">mail:  </div>
				<input id="ajout_mail_produit" class="update_bout"> <br/>
				
				<div class="update_ligne">Adresse:  </div>
				<input id="ajout_adress_rest" class="update_bout"><br/>
				
				<div class="update_ligne">Description:  </div>
				<textarea id="ajout_adress_rest" class="update_bout"></textarea><br/>
				
				
				<div class="update_ligne">Image :  </div>
				<input id="ajout_photo_rest" class="fileupload update_bout" type="file" size="25"	name="photo_produit">
						
				<input id="valid_ajout" type="submit" value="Valider" />
			</form>
		
			</div>
		
			</span>
		</span>
	</span>
</body>
</html>