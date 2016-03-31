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
						Ajouter un Village		
					<h1>
			</div>
			
			<div id="barre"></div>
			
			<div id="corps_ajout_rest">
		
			<form id="ajout_vill" method="GET" action="ajout_village">
			
				<div class="update_ligne">Nom du Village:  </div>				
				<input id="ajout_nom_vill" class="update_bout"> <br/>
				<br/>
				
				<div class="update_ligne">Code Postal:  </div>
				<input id="ajout_cp_vill" class="update_bout"> <br/>
				
				<div class="update_ligne">Latitude:  </div>
				<input id="ajout_lat_vill" class="update_bout"> <br/>
				
				<div class="update_ligne">Longitude:  </div>
				<input id="ajout_long_vill" class="update_bout"><br/>
				
				
				<div class="update_ligne">Image :  </div>
				<input id="ajout_photo_vill" class="fileupload update_bout" type="file" size="25"	name="photo_produit">
						
				<input id="valid_ajout" type="submit" value="Valider" />
			</form>
		
			</div>
		
			</span>
		</span>
	</span>
</body>
</html>