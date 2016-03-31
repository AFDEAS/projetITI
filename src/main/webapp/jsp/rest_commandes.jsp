<!DOCTYPE html>
<html>
<head>
<title>Restaurateur | L'Eau qui germe</title>
<meta charset="UTF-8" />
<link type="text/css" rel="stylesheet" href="css/rest.css" />
<link rel="icon" href="img/eau.ico" />
<script src="js/rest_comm.js" type="application/javascript"></script>

</head>



<body>



	<!--   NAVIGATION   -->
	<header>

		<%@include file="rest_nav.jsp"%>

	</header>



	<span id="globalcontent"> 
		<span id="content"> 
			<span id="liste_commandes"> 
			
			
			
				<div id="barre_ong_command">
					<div class="item_barre_command" id="i_b_co_1">En Attente</div>
					<div class="item_barre_command" id="i_b_co_2_s">En cours</div>
					<div class="item_barre_command" id="i_b_co_3">Historique</div>
				</div>
		
			
			
			<span id="comm">
				
				<span class="item_comm_i attente">
					<a>
					  <div class="inner_comm">
						<div class="nom_produit">
							Endives :
						</div> <br/><br/>
						
						<div class="num_comm">
							no : 12345
						</div> <br/>
						
						<div class="disp_produit">
							date de livraison : <div id="dateliv">20/10/2016</div>
						</div> <br/>
						
						
						<div class="quant_produit">
							2000kg
						</div>
						<div class="prix_produit">
							600Euros
						</div><br/><br/>
						<div class="btn_detail"> Detail	</div> <br/>
						<div class="etat_comm" class="">
							
						</div>
						
					  </div>
					</a>
					</span>
			
					<span class="item_comm encours">
					<a>
					  <div class="inner_comm">
						<div class="nom_produit">
							Riz :
						</div> <br/><br/>
						
						<div class="num_comm">
							no : 12345
						</div> <br/>
						
						<div class="disp_produit">
							date de livraison : <div id="dateliv">20/12/2016</div>
						</div> <br/>
						
						
						<div class="quant_produit">
							1000kg
						</div>
						<div class="prix_produit">
							150Euros
						</div><br/><br/>
						<div class="btn_detail"> Detail	</div> <br/>
						<div class="etat_comm" class="">
							
						</div>
						
						
					  </div>
					</a>
					</span>
			
					<span class="item_comm_i attente">
					<a>
					  <div class="inner_comm">
						<div class="nom_produit">
							Boeuf :
						</div> <br/><br/>
						
						<div class="num_comm">
							no : 12345
						</div> <br/>
						
						<div class="disp_produit">
							date de livraison : <div id="dateliv">20/10/2016</div>
						</div> <br/>
						
						
						<div class="quant_produit">
							300kg
						</div>
						<div class="prix_produit">
							3000Euros
						</div><br/><br/>
						<div class="btn_detail"> Detail	</div> <br/>
						<div class="etat_comm" class="">
							
						</div>
						
						
					  </div>
					</a>
					</span>
					
					<span class="item_comm_i historique">
					<a>
					  <div class="inner_comm">
						<div class="nom_produit">
							Pois :
						</div> <br/><br/>
						
						<div class="num_comm">
							no : 12345
						</div> <br/>
						
						<div class="livr_comm">
							date de livraison : <div id="dateliv">20/10/2016</div>
						</div> <br/>
						
						
						<div class="quant_produit">
							300kg
						</div>
						<div class="prix_produit">
							500 Euros
						</div><br/><br/>
						<div class="btn_detail"> Detail	</div> <br/>
						<div class="etat_comm" class="">
							
						</div>
						
						
					  </div>
					</a>
					</span>
					
					
			</span>
			
			<span id="detail_item_background" class="background_i"></span>
		
			<span id="detail_mail_window" class="w_i">
				<button id="detail_item_close" class="detail_item_li"><img src="img/cross.png" ></button>
				<form id="sendmail" action="mailto:" method="GET">
					<div id="suj_mail">Sujet: <input name="subject" type="text"/> </div> <br/>
					<div id="desc_exp">Message</div>
					<div id="message_text"><textarea id="mailcontent"></textarea></div>
					<input id="bouton_envoi" type="submit" value="Send">
				</form>	
			</span>
		
		
			</span>
		</span>

	</span>


</body>

</html>