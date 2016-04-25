<!DOCTYPE html>
<html>
<head>
<title>Association | L'Eau qui germe</title>
<meta charset="UTF-8" />
<link type="text/css" rel="stylesheet" href="css/asso.css" />
<link rel="icon" href="img/eau.ico" />
<script src="js/asso_comm.js" type="application/javascript"></script>

</head>



<body>



	<!--   NAVIGATION   -->
	<header>

		<%@include file="asso_nav.jsp"%>

	</header>



	<span id="globalcontent"> 
		<span id="content"> 
			<span id="liste_commandes"> 
			
			
			
				<div id="barre_ong_command">
					<div class="item_barre_command" id="i_b_co_1">A Accepter</div>
					<div class="item_barre_command" id="i_b_co_2_s">En cours</div>
					<div class="item_barre_command" id="i_b_co_3">Historique</div>
				</div>
		
			<span id="rech_comm">
				Rechercher une commande:
				<input id="rech_comm" type="text" placeholder="Rechercher un numéro de commande">
				<button id="bouttonok">ok!</button>
			
			<span id="comm">
				
				<%@include file="../html/asso_commande_acc.html"%>
				
				<%@include file="../html/asso_commande_enc.html"%>
				
				<%@include file="../html/asso_commande_his.html"%>
					
								
					
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