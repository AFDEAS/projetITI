	 <div id="rectangle"></div>
		<div id="AFDEAS"> <a id="lien" href="accueilproducteur" > <img src="img/logo.png" > </a></div>
		 <a id="lien" href="comptes_producteur"  > 		<div id="part1" class="part">	 <h2>Mes Comptes</h2>   	</div> </a>  
		 <a id="lien" href="commandes_producteur"  > 	<div id="part2" class="part">	 <h2>Commandes</h2>   	</div> </a>  
		 <a id="lien" href="ficheproduit_producteur"  >	<div id="part3" class="part">	 <h2>Fiches Produit</h2>   	</div> </a>  
		 <a id="lien" href="contact_producteur"  > 		<div id="part4" class="part">	 <h2>Contact</h2>   	</div> </a>  
		 <a id="liendeco" onclick="deco()" >				<div id="part5" class="part">  	 <h2>Déconnexion</h2>  	</div> </a>  

		 <script language="javascript">
		 	function deco(){

		 		if(confirm("Voulez vous vraiment vous deconnecter? Vous perdrez toutes les modifications non enregistrees.")){
		 			document.location='/ProjetITI/deconnecter';
		 		};
		 	}
		 </script>