<!DOCTYPE html>
<html>
<head>
<title>Association | L'Eau qui germe</title>
<meta charset="UTF-8" />
<link type="text/css" rel="stylesheet" href="css/asso.css" />
<link rel="icon" href="img/eau.ico" />
<script src="js/asso_producteur.js" type="application/javascript"></script>

</head>



<body>



	<!--   NAVIGATION   -->
	<header>

		<%@include file="asso_nav.jsp"%>

	</header>



	<span id="globalcontent"> 
	 <span id="content">	
	 
	 		<span id="col_00">
	 		
	 		
			<a href="producteurs_ajout"><button id="btn_ajout_producteur">Ajouter un producteur</button></a>
	 		
			<div id="barre"></div>
 		
	 		
		 		<span class="contour_contact">
					<div class="item_contact">
						<div class="image_contact"><img src="http://lorempixel.com/200/150/" ></div>
						<div class="text_contact">
							<div class="nom_contact">Verne</div> <br/>
							<div class="prenom_contact">Jules</div> <br/>
							<div class="mail_contact">jules.verne@afffff.sn</div> <br/> <br/>
							<div class="adress_contact">12 rue des anges, Dakar</div> <br/> <br/>
							<div class="desc_contact">Donc avec une petite description qui va devoir etre un peu longue puisque sinon on verra pas la dynamisation du site, donc faut la faire durer un peu, comme le soleil, sans lequel, on risque de canner très vite, et très douloureusement.</div>
						</div>
													
							<!--  BOUTON DE TYPE MAIL TO... VOIR AVEC LA BALISE A (fonction mailto) -->
						<div class="buttons_contact">	
							<button class="detail_contact button_contact">Detail</button>  
							<button class="mailto_contact button_contact">Envoyer un mail</button> 
							<button class="modif_contact button_contact">Modifier</button> 
						</div>
					</div>

				</span>
				
		 		<span class="contour_contact">
					<div class="item_contact">
						<div class="image_contact"><img src="http://lorempixel.com/200/150/" ></div>
						<div class="text_contact">
							<div class="nom_contact">Verne</div> <br/>
							<div class="prenom_contact">Jules</div> <br/>
							<div class="mail_contact">jules.verne@afffff.sn</div> <br/> <br/>
							<div class="adress_contact">12 rue des anges, Dakar</div> <br/> <br/>
							<div class="desc_contact">Donc avec une petite description qui va devoir etre un peu longue puisque sinon on verra pas la dynamisation du site, donc faut la faire durer un peu, comme le soleil, sans lequel, on risque de canner très vite, et très douloureusement.</div>
						</div>
													
							<!--  BOUTON DE TYPE MAIL TO... VOIR AVEC LA BALISE A (fonction mailto) -->
						<div class="buttons_contact">	
							<button class="detail_contact button_contact">Detail</button>
							<button class="mailto_contact button_contact">Envoyer un mail</button> 
							<button class="modif_contact button_contact">Modifier</button> 
						</div>
					</div>

				</span>
				
				<%@include file="../html/asso_detail_contact.html" %>
			
				<%@include file="../html/asso_mail_contact.html" %>
			
			</span>
		</span>
	</span>
</body>
</html>