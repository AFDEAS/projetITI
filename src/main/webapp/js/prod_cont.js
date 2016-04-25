
window.onload = function(){
	
	document.getElementById("detail_item_close").onclick=function(){
		effacerdetail()
	}
	
	document.getElementById("detail_item_background").onclick=function(){
		effacerdetail()
	}
	
	

	document.getElementById("mailtoperu").onclick=function(){
		mail(1)
	}
	
	document.getElementById("mailtomorgante").onclick=function(){
		mail(1)
	}
	
	document.getElementById("mailtovandamme").onclick=function(){
		mail(3)
	}
	
}


function effacerdetail(){
	var bg = document.getElementById("detail_item_background");
	var fen = document.getElementById("detail_mail_window");
	
	bg.setAttribute("class","background_i");
	fen.setAttribute("class","w_i");
	
}



function mail(valeur){

	if( valeur == 1 ){
		
		var formul = document.getElementById("sendmail");
		formul.setAttribute("action","mailto:peru.patrice@afdeas.sn")
		
		var butto = document.getElementById("bouton_envoi");
		butto.setAttribute("value", "Envoyer un mail a Patrice PERU");
		
		var bg = document.getElementById("detail_item_background");
		var fen = document.getElementById("detail_mail_window");
		
		bg.setAttribute("class","background_v");
		fen.setAttribute("class","w_v");
		
	};

	if( valeur == 2 ){
		
		var formul = document.getElementById("sendmail");
		formul.setAttribute("action","mailto:morgante.laurent@afdeas.sn")
		
		var butto = document.getElementById("bouton_envoi");
		butto.setAttribute("value", "Envoyer un mail a Laurent MORGANTE");
		
		var bg = document.getElementById("detail_item_background");
		var fen = document.getElementById("detail_mail_window");
		
		bg.setAttribute("class","background_v");
		fen.setAttribute("class","w_v");
		
	};
	
	if( valeur == 3 ){
		
		var formul = document.getElementById("sendmail");
		formul.setAttribute("action","mailto:vandamme.patrick@reactif.fr")
		
		var butto = document.getElementById("bouton_envoi");
		butto.setAttribute("value", "Envoyer un mail a Patrick VANDAMME");
		
		var bg = document.getElementById("detail_item_background");
		var fen = document.getElementById("detail_mail_window");
		
		bg.setAttribute("class","background_v");
		fen.setAttribute("class","w_v");
		
	};
	
}