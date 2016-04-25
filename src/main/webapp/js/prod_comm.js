
window.onload = function(){
	
	document.getElementById("detail_item_close").onclick=function(){
		effacerdetail()
	}
	
	document.getElementById("detail_item_background").onclick=function(){
		effacerdetail()
	}
	
	document.getElementById("i_b_co_1_s").onclick =function(){
		changeronglet(1)
	}

	document.getElementById("i_b_co_2").onclick =function(){
		changeronglet(2)
	}
	
}


function changeronglet(valeur){



	//En COURS

	if (valeur == 1) {

	var tabong = document.getElementsByClassName("item_barre_command");
	var ong1 = tabong[0];
	var ong2 = tabong[1];

	ong2.setAttribute("id","i_b_co_1_s");
	ong3.setAttribute("id","i_b_co_2");

	var i=0;


	var enc = document.getElementsByClassName("encours");
	var es = enc.length;
	for(i=0;i<es;i++){
		enc[i].setAttribute("class","item_comm encours")
	};

	var his = document.getElementsByClassName("historique");
	var hs = his.length;
	for(i=0;i<hs;i++){
		his[i].setAttribute("class","item_comm_i historique")
	};


	};

	//HISTORIQUE

	if (valeur == 2) {

	var tabong = document.getElementsByClassName("item_barre_command");
	var ong1 = tabong[0];
	var ong2 = tabong[1];
	
	ong1.setAttribute("id","i_b_co_1");
	ong2.setAttribute("id","i_b_co_2_s");
	
	var i=0;
	

	var enc = document.getElementsByClassName("encours");
	var es = enc.length;
	for(i=0;i<es;i++){
		enc[i].setAttribute("class","item_comm_i encours")
	};

	var his = document.getElementsByClassName("historique");
	var hs = his.length;
	for(i=0;i<hs;i++){
		his[i].setAttribute("class","item_comm historique")
	};

	
	};


	};



function effacerdetail(){
	var bg = document.getElementById("detail_item_background");
	var fen = document.getElementById("detail_mail_window");
	
	bg.setAttribute("class","background_i");
	fen.setAttribute("class","w_i");
	
}