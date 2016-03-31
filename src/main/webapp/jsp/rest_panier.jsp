<!DOCTYPE html>
<html>
<head>
<title>Restaurateur | L'Eau qui germe</title>
<meta charset="UTF-8" />
<link type="text/css" rel="stylesheet" href="css/rest.css" />
<link rel="icon" href="img/eau.ico" />
<script src="js/rest_pan.js" type="application/javascript"></script>

</head>



<body>



	<!--   NAVIGATION   -->
	<header>

		<%@include file="rest_nav.jsp"%>

	</header>




	<span id="globalcontent"> 
		<span id="content"> 
			<span id="liste_panier_v"> 
			
			
			<!--   PARTIE GAUCHE   --> 
		<span	id="col-pan-01">
			<div id="titre_01">
				<p>
				<h1>
					
					<h1>
						</p>
			</div>


			<div id="corps_01">
					<span class="contour_item_pan">
					<a>
					  <div class="inner_item_pan">
						<div class="image_contact"><img src="http://lorempixel.com/200/150/" ></div>
						
						<div class="text_item_pan">
						<div class="nom_produit">
							Riz :
						</div>
						<div class="desc_produit">
							Céréale, cuisinable sous tout type des formes, surtout soufflé avec du chocolat.
						</div> <br/><br/>
						
						<div class="disp_produit">
							Demandé pour le:
							<div class="disp_pan_produit">
								00/10/2016
							</div>
						</div> <br/>
						
						
						<div class="quant_pan_produit">
							<div class="q_pan_produit">
								100
							</div>kg
						</div>
						
						<div class="prix_p_produit">
							<div class="prix_pan_produit">
								70
							</div>Euros
						</div>
						</div>
						
						<div class="corps_btn_produit">
						<input type="button" onclick="afficherdetail()" class="modif_item_comm" value="Modifier" /><br/><br/>
						<input type="button" class="del_item_comm" value="Supprimer" />
						</div>
						
					  </div>
					</a>
				</span>
				
				
				<span class="contour_item_pan">
					<a>
					  <div class="inner_item_pan">
						<div class="image_contact"><img src="http://lorempixel.com/200/150/" ></div>
						
						<div class="text_item_pan">
						<div class="nom_produit">
							Poisson :
						</div>
						<div class="desc_produit">
							Céréale, cuisinable sous tout type des formes, surtout soufflé avec du chocolat.
						</div> <br/><br/>
						
						<div class="disp_produit">
							Demandé pour le:
							<div class="disp_pan_produit">
								00/10/2016
							</div>
						</div> <br/>
						
						
						<div class="quant_pan_produit">
							<div class="q_pan_produit">
								100
							</div>kg
						</div>
						
						<div class="prix_p_produit">
							<div class="prix_pan_produit">
								70
							</div>Euros
						</div>
						</div>
						
						<div class="corps_btn_produit">
						<input type="button" onclick="afficherdetail()" class="modif_item_comm" value="Modifier" /><br/><br/>
						<input type="button" class="del_item_comm" value="Supprimer" />
						</div>
						
					  </div>
					</a>
				</span>
				
				<span class="contour_item_pan">
					<a>
					  <div class="inner_item_pan">
						<div class="image_contact"><img src="http://lorempixel.com/200/150/" ></div>
						
						<div class="text_item_pan">
						<div class="nom_produit">
							Patate :
						</div>
						<div class="desc_produit">
							Céréale, cuisinable sous tout type des formes, surtout soufflé avec du chocolat.
						</div> <br/><br/>
						
						<div class="disp_produit">
							Demandé pour le:
							<div class="disp_pan_produit">
								00/10/2016
							</div>
						</div> <br/>
						
						
						<div class="quant_pan_produit">
							<div class="q_pan_produit">
								100
							</div>kg
						</div>
						
						<div class="prix_p_produit">
							<div class="prix_pan_produit">
								70
							</div>Euros
						</div>
						</div>
						
						<div class="corps_btn_produit">
						<input type="button" onclick="afficherdetail()" class="modif_item_comm" value="Modifier" /><br/><br/>
						<input type="button" class="del_item_comm" value="Supprimer" />
						</div>
						
					  </div>
					</a>
				</span>
				
				
			</div>
	</span>
	
	
	
	 <!-- SEPARATION VERTICALE -->
	<div id="ligneverticale_pan"></div>
	
	
	
	 <!--  PARTIE DROITE --  INFORMATIONS UTILISATEUR -->
	<span id="col-pan-02">
		<div id="titre_02">
				<p>
				<h1>
					Ma commande
					<h1>
						</p>
			</div>


			<div id="corps_02">

				<div class="rest_pan_ligne">  <div class="rest_pan_nom">Riz</div> x<div class="rest_pan_quant">100</div>kg <div class="rest_pan_prix"><div class="rest_pan_p">70</div>Euros</div> </div> <br/> 

				<div class="rest_pan_ligne">  <div class="rest_pan_nom">Poisson</div> x<div class="rest_pan_quant">100</div>kg <div class="rest_pan_prix"><div class="rest_pan_p">70</div>Euros</div> </div> <br/> 

				<div class="rest_pan_ligne">  <div class="rest_pan_nom">Patate</div> x<div class="rest_pan_quant">100</div>kg <div class="rest_pan_prix"><div class="rest_pan_p">70</div>Euros</div> </div> <br/> 
				
				<br/>
				<div id="barre_pan"></div>
				<br/>
								
				<div class="rest_acc_ligne">Total: <div id="rest_pan_montant" class="rest_pan_prix"><div class="rest_pan_p">210</div>Euros</div></div> </p> <br/>

				<p>
					<input type="button" id="validcommanderestau" value="Valider la commande" />
				</p>

			</div>
	</span> 
			
			
			
			
			
			
		<span id="detail_item_background" class="background_i"></span>
			
		<span id="detail_pan_window" class="w_i">
				<button id="detail_item_close" class="detail_item_li"><img src="img/cross.png" ></button>
				<div id="detail_item_image"><img src="http://lorempixel.com/200/150/" ></div>
				<div id="detail_item_titre">Riz</div> <br/> <br/>
			
				<div id="detail_item_desc" class="detail_item_li"> Céréale, cuisinable sous tout type des formes, surtout soufflé avec du chocolat.</div> <br/> <br/>
				<div id="detail_item_q" class="detail_item_li">Quantité voulue: (Quantité maximale <div id="detail_item_quant" class="detail_item_li">300kg</div>)</div><br/>
				<input type="number" value="0" name="detail_item_quant_commande" class="detail_item_li"> (kg) <br/> <br/>
				<div id="detail_item_p" class="detail_item_li">Prix de la commande: (<div id="detail_item_prix" class="detail_item_li">5</div>Euros/kg)</div> <br/>
				<div id="detail_item_prix_commande" class="detail_item_li"> </div>	<br/>
				<div id="detail_item_d">Date désirée de commande: <input name="date_livraison" type="date" id="detail_item_date" class="detail_item_li"> </div> <br/>
				<button id="detail_item_commande_modifier">Modifier</button> 
				<button id="detail_item_commande_annuler">Annuler</button> 
		</span>
			
			
		<span id="valid_pan_window" class="w_i">
				<button id="detail_item_close" class="detail_item_li"><img src="img/cross.png" ></button>
				
				<div id="valid_item_titre">Validation de la commande</div> <br/> <br/>
			
				<div id="detail_item_desc" class="detail_item_li"> Céréale, cuisinable sous tout type des formes, surtout soufflé avec du chocolat.</div> <br/> <br/>
				<div id="detail_item_q" class="detail_item_li">Quantité voulue: (Quantité maximale <div id="detail_item_quant" class="detail_item_li">300kg</div>)</div><br/>
				<input type="number" value="0" name="detail_item_quant_commande" class="detail_item_li"> (kg) <br/> <br/>
				<div id="detail_item_p" class="detail_item_li">Prix de la commande: (<div id="detail_item_prix" class="detail_item_li">5</div>Euros/kg)</div> <br/>
				<div id="detail_item_prix_commande" class="detail_item_li"> </div>	<br/>
				<div id="detail_item_d">Date désirée de commande: <input name="date_livraison" type="date" id="detail_item_date" class="detail_item_li"> </div> <br/>
				<button id="detail_item_commande_modifier">Modifier</button> 
				<button id="detail_item_commande_annuler">Annuler</button> 
		</span>	
			
			
			</span>
			
			<div id="pan_vide_i">
				
				<h3>Votre panier est vide. Allez dans l'onglet catalogue pour y trouver les articles disponibles.</h3>
				<a href="catalogue_restaurateur">Aller dans le catalogue</a>					
				
				
			</div>		
			
		</span>


	
	</span>


</body>

</html>