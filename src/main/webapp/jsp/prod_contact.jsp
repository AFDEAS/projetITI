<!DOCTYPE html>
<html>
<head>
<title>Producteur | L'Eau qui germe</title>
<meta charset="UTF-8" />
<link type="text/css" rel="stylesheet" href="css/prod.css" />
<link rel="icon" href="img/eau.ico" />
<script src="js/prod_cont.js" type="application/javascript"></script>

</head>



<body>



	<!--   NAVIGATION   -->
	<header>

		<%@include file="prod_nav.jsp"%>

	</header>



	<span id="globalcontent"> 
		<span id="content"> 
			<span id="liste_contact"> 
			
			
				<span class="contour_contact">
					<div class="item_contact">
						<div class="image_contact"><img src="http://lorempixel.com/200/150/" ></div>
						<div class="text_contact">
							<div class="nom_contact">PERU</div> <br/>
							<div class="prenom_contact">Patrice</div> <br/>
							<div class="role_contact">President</div> <br/> <br/>
							<div class="desc_contact">Donc avec une petite description qui va devoir etre un peu longue puisque sinon on verra pas la dynamisation du site, donc faut la faire durer un peu, comme le soleil, sans lequel, on risque de canner très vite, et très douloureusement.</div>
						</div>
													
							<!--  BOUTON DE TYPE MAIL TO... VOIR AVEC LA BALISE A (fonction mailto) -->
							
							
							<div id="mailtoperu" class="mailtot">Envoyer un mail</div> 
						
					</div>

				</span>
			
				
							
				<span class="contour_contact">
					<div class="item_contact">
						<div class="image_contact"><img src="http://lorempixel.com/200/150/" ></div>
						<div class="text_contact">
							<div class="nom_contact">MORGANTE</div> <br/>
							<div class="prenom_contact">Laurent</div> <br/>
							<div class="role_contact">Secretaire</div> <br/> <br/>
							<div class="desc_contact">Donc avec une petite description qui va devoir etre un peu longue puisque sinon on verra pas la dynamisation du site, donc faut la faire durer un peu, comme le soleil, sans lequel, on risque de canner très vite, et très douloureusement.</div>
						</div>
													
								<!--  BOUTON DE TYPE MAIL TO... VOIR AVEC LA BALISE A (fonction mailto) -->
							
							
							<div id="mailtomorgante" class="mailtot">Envoyer un mail</div> 
						
						
					</div>

				</span>
			
						
				<span class="contour_contact">
					<div class="item_contact">
						<div class="image_contact"><img src="http://lorempixel.com/200/150/" ></div>
						<div class="text_contact">
							<div class="nom_contact">VANDMME</div> <br/>
							<div class="prenom_contact">Patrick</div> <br/>
							<div class="role_contact">Founder</div> <br/> <br/>
							<div class="desc_contact">Donc avec le soleil, sans lequel, on risque de canner très vite, et très douloureusement.</div>
						</div>
												
							<!--  BOUTON DE TYPE MAIL TO... VOIR AVEC LA BALISE A (fonction mailto) -->
							
							
							<div id="mailtovandamne" class="mailtot"> Envoyer un mail</div> 
						
					</div>

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