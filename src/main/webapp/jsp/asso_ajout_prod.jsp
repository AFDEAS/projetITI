<!DOCTYPE html>
<html>
<head>
<title>Association | L'Eau qui germe</title>
<meta charset="UTF-8" />
<link type="text/css" rel="stylesheet" href="css/asso.css" />
<link rel="icon" href="img/eau.ico" />
<script src="js/asso_producteur_ajout.js" type="application/javascript"></script>

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
						Ajouter un Producteur		
					<h1>
			</div>
			
			<div id="barre"></div>
			
			<div id="corps_ajout_prod">
		
			<form id="ajout_prod" method="GET" action="ajout_producteur">
			
				<div class="update_ligne">Nom:  </div>				
				<input id="ajout_nom_prod" class="update_bout"> <br/>
				<br/>
				
				<div class="update_ligne">Prénom:  </div>
				<input id="ajout_prenom_prod" class="update_bout"> <br/>
				
				<div class="update_ligne">mail:  </div>
				<input id="ajout_mail_prod" class="update_bout"> <br/>
				
				<div class="update_ligne">Adresse:  </div>
				<input id="ajout_adress_prod" class="update_bout"><br/>
				
				<div class="update_ligne">Description:  </div>
				<textarea id="ajout_adress_prod" class="update_bout"></textarea><br/>
				
				
				<div id="produits_prod">
					<div class="produits_prod_titre">Produits disponibles: </div>

					<div class="produits_prod_surf">Surface (hectares): </div> <br/>
					
					<select class="produits_prod_nom" size="1">
						<option selected>Choisissez un produit </option>
						<option>Riz </option>
						<option>Carottes </option>
<!-- Options A remplacer par un c:ForEach -->
					</select>
					
					<input type="number" class="produits_prod_surface"> <br/>

					<select class="produits_prod_nom" size="1">
						<option selected>Choisissez un produit</option>
						<option>Riz </option>
						<option>Carottes </option>
<!-- Options A remplacer par un c:ForEach -->
					</select>
					
					<input type="number" class="produits_prod_surface"> <br/>
						
					
				</div>
				
				<a id="produits_prod_suppl" class="produits_prod_nom" onclick="Add_prdt()">Plus...</a> <br/>
				
				<script type="text/javascript">
				function Add_prdt(){
					var elem1 = document.createElement("select");
					elem1.className("produits_prod_nom");
					var opt0 = document.createElement("option");
					var opt1 = document.createElement("option");
					var opt2 = document.createElement("option");
					var t0 = document.createTextNode("Choissez une option");
					var t1 = document.createTextNode("Riz");
					var t2 = document.createTextNode("Carottes");
					opt0.appendChild(t0);
					opt1.appendChild(t1);
					opt2.appendChild(t2);
					elem1.appendChild(opt0);
					elem1.appendChild(opt1);
					elem1.appendChild(opt2);
					
					document.body.appendChild(elem1);
					
					var elem2 = document.createElement("input");
					elem2.className("produits_prod_surface");
					
					document.body.appendChild(elem2);
				}
				
				</script>	
				
				<div class="update_ligne">Image :  </div>
				<input id="ajout_photo_prod" class="fileupload update_bout" type="file" size="25"	name="photo_produit">
				
				<div class="update_ligne">Village :  </div>
				<select id="ajout_village_prod" class="update bout" size="1">
					<option>Makatoube </option>
					<option>Autre village </option>
<!-- Options A remplacer par un c:ForEach -->
				</select>
				<a href="village_ajout" class="update_bout_lien">Ajouter un village</a>
				<br/><br/>
						
				<input id="valid_ajout" type="submit" value="Valider" />
			</form>
		
			</div>
		
			</span>
		</span>
	</span>
</body>
</html>