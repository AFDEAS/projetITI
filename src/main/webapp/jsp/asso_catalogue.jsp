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
				</div>
				
				
				<span id="cat">
					
					<span class="item_cat viande">
					<a>
					  <div class="inner_item">
						<div class="image_produit"><img src="http://lorempixel.com/200/150/" ></div>
						<div class="nom_produit">
							Boeuf :
						</div>
						<div class="desc_produit">
							Viande rouge.
						</div> <br/><br/>
						
						<div class="disp_produit">
							Disponible de septembre à janvier
						</div> <br/>
						
						<div class="q_produit">
							Quantité maximale: 300kg
						</div>
					  </div>
					</a>
					</span>
					
					<span class="item_cat viande">
					<a>
					  <div class="inner_item">
						<div class="image_produit"><img src="http://lorempixel.com/200/150/" ></div>
						<div class="nom_produit">
							Poulet :
						</div>
						<div class="desc_produit">
							Viande blanche.
						</div> <br/><br/>
						
						<div class="disp_produit">
							Disponible de septembre à janvier
						</div> <br/>
						
						<div class="q_produit">
							Quantité maximale: 300kg
						</div>
					  </div>
					</a>
					</span>
					
					<span class="item_cat legume">
					<a>
					  <div class="inner_item">
						<div class="image_produit"><img src="http://lorempixel.com/200/150/" ></div>
						<div class="nom_produit">
							Riz :
						</div>
						<div class="desc_produit">
							Céréale.
						</div> <br/><br/>
						
						<div class="disp_produit">
							Disponible de septembre à janvier
						</div> <br/>
						
						<div class="q_produit">
							Quantité maximale: 10000kg
						</div>
					  </div>
					</a>
					</span>
	 
	 			</span>
	 			
	 		</span>
	 		
	 		<%@include file="../html/asso_catalogue_popup.html"%>
	 	
	 	</span>
	 </span>
	</span>
</body>
</html>