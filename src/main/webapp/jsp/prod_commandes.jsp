<!DOCTYPE html>
<html>
<head>
<title>Producteur | L'Eau qui germe</title>
<meta charset="UTF-8" />
<link type="text/css" rel="stylesheet" href="css/prod.css" />
<link rel="icon" href="img/eau.ico" />
<script src="js/prod_comm.js" type="application/javascript"></script>

</head>



<body>



	<!--   NAVIGATION   -->
	<header>

		<%@include file="prod_nav.jsp"%>

	</header>



	<span id="globalcontent"> 
		<span id="content"> 
			<span id="liste_commandes"> 
			
			
			
				<div id="barre_ong_command">
					<div class="item_barre_command" id="i_b_co_1_s">En cours</div>
					<div class="item_barre_command" id="i_b_co_2">Historique</div>
				</div>
		
			
			
			<span id="comm">
				
				<%@include file="../html/prod_comm_popup_his.html" %>
			
				<%@include file="../html/prod_comm_popup_enc.html" %>
						
				<%@include file="../html/prod_comm_popup_enc.html" %>
			
					
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