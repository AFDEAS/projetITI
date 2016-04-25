<!DOCTYPE html>
<html>
<head>
<title>Association | L'Eau qui germe</title>
<meta charset="UTF-8" />
<link type="text/css" rel="stylesheet" href="css/asso.css" />
<link rel="icon" href="img/eau.ico" />
<script src="js/asso_catal.js" type="application/javascript"></script>

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
						Bienvenue dans le catalogue
					<h1>
			</div>
		
			<a href="produit_association"><button id="ajout_produit">Ajouter un produit</button></a>
		
			<div id="barre"></div>
		
			<span id="corps_catalogue">
			 
				<div id="barre_ong_catalogue">
					<div class="item_barre_catalogue" id="i_b_ca_1">Legumes</div>
					<div class="item_barre_catalogue" id="i_b_ca_2">Fruits</div>
					<div class="item_barre_catalogue" id="i_b_ca_3">Viandes</div>
					<div class="item_barre_catalogue" id="i_b_ca_4">Poissons</div>
					<div class="item_barre_catalogue" id="i_b_ca_5">Autre</div>
					<div class="item_barre_catalogue" id="i_b_ca_6_s">Tout</div>
					<input id="rech_catalogue" type="text" placeholder="Rechercher un produit">
					<button id="bouttonok">ok!</button>
				</div>
				
				
				<span id="cat">
					
					
	 			</span>
	 			
	 		</span>
	 		
	 		<%@include file="../html/asso_catalogue_popup.html"%>
	 	
	 	</span>
	 </span>
	</span>
</body>
</html>