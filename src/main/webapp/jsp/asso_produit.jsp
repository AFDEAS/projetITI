<!DOCTYPE html>
<html>
<head>
<title>Association | L'Eau qui germe</title>
<meta charset="UTF-8" />
<link type="text/css" rel="stylesheet" href="css/asso.css" />
<link rel="icon" href="img/eau.ico" />
<script src="js/asso_pdt.js" type="application/javascript"></script>

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
						Ajouter un produit		
					<h1>
			</div>
			
			<div id="barre"></div>
		
			<div id="barre_ong_produit">
					<div class="item_barre_catalogue" id="i_b_ca_1_s">Existant</div>
					<div class="item_barre_catalogue" id="i_b_ca_2">Nouveau</div>
			</div>
		
			<div id="corps_update" class="c_v">
			
			
			<form id="update_pdt" method="GET" action="update_produit">
			
				<div class="update_ligne">Nom du produit:  </div>
				
				<select id="update_nom_produit" class="update_bout" size="1">
					<option>Boeuf </option>
<!-- Options A remplacer par un c:ForEach -->
				</select>
				<br/>
				
				<div class="update_ligne">Quantité:  </div>
				<input id="update_quant_produit" class="update_bout"> <br/>
				
				<div class="update_ligne">Disponible le:  </div>
				<input id="update_date" class="update_bout" type="date"><br/>
				
				<input id="valid_update" type="submit" value="Valider" />
			</form>
			</div>
		
		
			<div id="corps_ajout" class="c_i">
		
			<form id="ajout_pdt" method="GET" action="ajout_produit">
			
				<div class="update_ligne">Nom du produit:  </div>				
				<input id="ajout_nom_produit" class="update_bout"> <br/>
				<br/>
				
				<div class="update_ligne">Prix:  </div>
				<input id="ajout_prix_produit" class="update_bout"> <br/>
				
				<div class="update_ligne">Quantité:  </div>
				<input id="ajout_quant_produit" class="update_bout"> <br/>
				
				<div class="update_ligne">Disponible le:  </div>
				<input id="ajout_date" class="update_bout" type="date"><br/>
				
				<div class="update_ligne">Image (facultatif):  </div>
				<input id="ajout_photo_produit" class="fileupload update_bout" type="file" size="25"	name="photo_produit">
						
				<input id="valid_ajout" type="submit" value="Valider" />
			</form>
		
			</div>
		
			</span>
		</span>
	</span>
</body>
</html>