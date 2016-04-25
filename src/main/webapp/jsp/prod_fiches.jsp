<!DOCTYPE html>
<html>
<head>
<title>Producteur | L'Eau qui germe</title>
<meta charset="UTF-8" />
<link type="text/css" rel="stylesheet" href="css/prod.css" />
<link rel="icon" href="img/eau.ico" />
<script src="js/prod_fiches.js" type="application/javascript"></script>

</head>



<body>



	<!--   NAVIGATION   -->
	<header>

		<%@include file="prod_nav.jsp"%>

	</header>



	<span id="globalcontent"> 
	 <span id="content">	
	 
	 		<span id="col_00">
			<div id="titre_00">
					<h1>
						Bienvenue dans les fiches produit
					<h1>
			</div>
		
			
			<div id="barre"></div>
		
			<span id="corps_catalogue">
			 
				<div id="barre_ong_catalogue">
					<input id="rech_catalogue" type="text" placeholder="Rechercher un produit">
					<button id="bouttonok">ok!</button>
				</div>
				
				
				<span id="cat">
					
					
	 			</span>
	 			
	 		</span>
	 		
	 		<%@include file="../html/prod_fiche_popup.html"%>
	 	
	 	</span>
	 </span>
	</span>
</body>
</html>