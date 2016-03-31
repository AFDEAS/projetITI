<%@ page pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Restaurateur | L'Eau qui germe</title>
<meta charset="UTF-8" />
<link type="text/css" rel="stylesheet" href="css/rest.css" />
<link rel="icon" href="img/eau.ico" />
<script src="js/restaurateur.js" type="application/javascript"></script>

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
						Bienvenue dans le catalogue
					<h1>
			</div>
		
			<div id="barre"></div>
		
			<span id="corps_catalogue">
			 
				<div id="barre_ong_catalogue">
					
					
				</div>
				
				<input id="rech_catalogue" type="text" placeholder="Rechercher un produit">
				<button id="bouttonok">ok!</button>
				<span id="cat">
					
					
				
				
				</span>
				
			 		 
			 
			 
			 </span>
		
		<span id="detail_item_background" class="background_i"></span>
			
		<span id="detail_item_window" class="w_i">
				<button id="detail_item_close" class="detail_item_li"><img src="img/cross.png" ></button>
				<div id="detail_item_image"><img src="http://lorempixel.com/200/150/" ></div>
				<div id="detail_item_titre">Plouf</div> <br/> <br/>
			
				<div id="detail_item_desc" class="detail_item_li"> une description plus fatasse à coller</div> <br/> <br/>
				<div id="detail_item_q" class="detail_item_li">Quantité voulue: (Quantité maximale <div id="detail_item_quant" class="detail_item_li">300kg</div>)</div><br/>
				<input type="number" value="0" name="detail_item_quant_commande" class="detail_item_li"> (kg) <br/> <br/>
				<div id="detail_item_p" class="detail_item_li">Prix de la commande: (<div id="detail_item_prix" class="detail_item_li">5</div>Euros/kg)</div> <br/>
				<div id="detail_item_prix_commande" class="detail_item_li"> </div>	<br/>
				<div id="detail_item_d">Date désirée de commande: <input name="date_livraison" type="date" id="detail_item_date" class="detail_item_li"> </div> <br/>
				<button name="detail_item_ajouter">Ajouter au panier</button> 
		</span>
		
		
		
	</span> 

	</span>

	</span>


</body>

</html>