	 <div id="rectangle"></div>
		<div id="AFDEAS"> <a id="lien" href="accueil_association" > <img src="img/logo.png" > </a></div>
		 <a id="lien" href="comptes_association"  > 		<div id="part1" class="part">	 <h2>Comptes</h2>   	</div> </a>  
		 <a id="lien" href="producteurs"  > 				<div id="part2" class="part">	 <h2>Producteurs</h2>   	</div> </a>  
		 <a id="lien" href="restaurateurs"  >		 		<div id="part3" class="part">	 <h2>Restaurateurs</h2>   	</div> </a>  
		 <a id="lien" href="catalogue_association"  > 		<div id="part4" class="part">	 <h2>Catalogue</h2>   	</div> </a>  
		 <a id="lien" href="commandes_association"  >		<div id="part5" class="part">  	 <h2>Commandes</h2>   	</div> </a> 
		 <a id="lien" href="fichesproduit_association"  >	<div id="part6" class="part">  	 <h2>Fiches Produit</h2>      	</div> </a>  
		 <a id="liendeco" onclick="deco()" >				<div id="part7" class="part">  	 <h2>Déconnexion</h2>  	</div> </a>  

		 <script language="javascript">
		 	function deco(){

		 		if(confirm("Voulez vous vraiment vous deconnecter? Vous perdrez toutes les modifications non enregistrees.")){
		 			document.location='/ProjetITI/deconnexion';
		 		};
		 	}
		 </script>