window.onload = function(){

	document.getElementById("i_b_o_accueil_s").onclick =function(){
		changeronglet(1)
	}


	document.getElementById("i_b_o_propos").onclick =function(){
		changeronglet(2)
	}

	document.getElementById("i_b_o_projet").onclick =function(){
		changeronglet(3)
	}

	document.getElementById("i_b_o_carte").onclick =function(){
		changeronglet(4)
	}

	document.getElementById("i_b_o_contact").onclick =function(){
		changeronglet(5)
	}
	
	document.getElementById("bouton_modif_texte_accueil").onclick =function(){
		
		var texte = document.getElementById("inp_text_accueil").value;
		var page = "accueil";
		modifiertexte(texte, page);
		
	}
	
	document.getElementById("sub_desc_contact").onclick =function(){
		
		var texte = document.getElementById("inp_desc_contact").value;
		var page = "propos";
		modifiertexte(texte, page);
		
	}


	
}


function changeronglet(valeur){

	
// ACCUEIL	
	
if (valeur == 1) {

var tabong = document.getElementsByClassName("item_barre_onglet");
var ong1 = tabong[0];
var ong2 = tabong[1];
var ong3 = tabong[2];
var ong4 = tabong[3];
var ong5 = tabong[4];

ong1.setAttribute("id","i_b_o_accueil_s");
ong2.setAttribute("id","i_b_o_propos");
ong3.setAttribute("id","i_b_o_projet");
ong4.setAttribute("id","i_b_o_carte");
ong5.setAttribute("id","i_b_o_contact");

var affichage = document.getElementsByClassName("modif");
var mod1 = affichage[0];
var mod2 = affichage[1];
var mod3 = affichage[2];
var mod4 = affichage[3];
var mod5 = affichage[4];

mod1.setAttribute("id","modif_accueil_v");
mod2.setAttribute("id","modif_propos");
mod3.setAttribute("id","modif_projet");
mod4.setAttribute("id","modif_carte");
mod5.setAttribute("id","modif_contact");


};




// PROPOS

if (valeur == 2) {

	var tabong = document.getElementsByClassName("item_barre_onglet");
	var ong1 = tabong[0];
	var ong2 = tabong[1];
	var ong3 = tabong[2];
	var ong4 = tabong[3];
	var ong5 = tabong[4];

	ong1.setAttribute("id","i_b_o_accueil");
	ong2.setAttribute("id","i_b_o_propos_s");
	ong3.setAttribute("id","i_b_o_projet");
	ong4.setAttribute("id","i_b_o_carte");
	ong5.setAttribute("id","i_b_o_contact");

	var affichage = document.getElementsByClassName("modif");
	var mod1 = affichage[0];
	var mod2 = affichage[1];
	var mod3 = affichage[2];
	var mod4 = affichage[3];
	var mod5 = affichage[4];

	mod1.setAttribute("id","modif_accueil");
	mod2.setAttribute("id","modif_propos_v");
	mod3.setAttribute("id","modif_projet");
	mod4.setAttribute("id","modif_carte");
	mod5.setAttribute("id","modif_contact");


};


// PROJETS

if (valeur == 3) {

	var tabong = document.getElementsByClassName("item_barre_onglet");
	var ong1 = tabong[0];
	var ong2 = tabong[1];
	var ong3 = tabong[2];
	var ong4 = tabong[3];
	var ong5 = tabong[4];

	ong1.setAttribute("id","i_b_o_accueil");
	ong2.setAttribute("id","i_b_o_propos");
	ong3.setAttribute("id","i_b_o_projet_s");
	ong4.setAttribute("id","i_b_o_carte");
	ong5.setAttribute("id","i_b_o_contact");

	var affichage = document.getElementsByClassName("modif");
	var mod1 = affichage[0];
	var mod2 = affichage[1];
	var mod3 = affichage[2];
	var mod4 = affichage[3];
	var mod5 = affichage[4];

	mod1.setAttribute("id","modif_accueil");
	mod2.setAttribute("id","modif_propos");
	mod3.setAttribute("id","modif_projet_v");
	mod4.setAttribute("id","modif_carte");
	mod5.setAttribute("id","modif_contact");


// Coller un onclick des différents onglets et une nouvelle fonction qui appelle les nouveaux items


	document.getElementById("i_b_p_1_s").onclick =function(){
		changerprojet(1)
	}

	document.getElementById("i_b_p_2").onclick =function(){
		changerprojet(2)
	}

	document.getElementById("i_b_p_3").onclick =function(){
		changerprojet(3)
	}

	document.getElementById("i_b_p_4").onclick =function(){
		changerprojet(4)
	}

	
	
};


// CARTE

if (valeur == 4) {

	var tabong = document.getElementsByClassName("item_barre_onglet");
	var ong1 = tabong[0];
	var ong2 = tabong[1];
	var ong3 = tabong[2];
	var ong4 = tabong[3];
	var ong5 = tabong[4];

	ong1.setAttribute("id","i_b_o_accueil");
	ong2.setAttribute("id","i_b_o_propos");
	ong3.setAttribute("id","i_b_o_projet");
	ong4.setAttribute("id","i_b_o_carte_s");
	ong5.setAttribute("id","i_b_o_contact");

	var affichage = document.getElementsByClassName("modif");
	var mod1 = affichage[0];
	var mod2 = affichage[1];
	var mod3 = affichage[2];
	var mod4 = affichage[3];
	var mod5 = affichage[4];

	mod1.setAttribute("id","modif_accueil");
	mod2.setAttribute("id","modif_propos");
	mod3.setAttribute("id","modif_projet");
	mod4.setAttribute("id","modif_carte_v");
	mod5.setAttribute("id","modif_contact");


	document.getElementById("i_b_ca_1_s").onclick =function(){
		changervillage(1)
	}

	document.getElementById("i_b_ca_2").onclick =function(){
		changervillage(2)
	}

	document.getElementById("i_b_ca_3").onclick =function(){
		changervillage(3)
	}

	document.getElementById("i_b_ca_4").onclick =function(){
		changervillage(4)
	}
};


// CONTACT

if (valeur == 5) {

var tabong = document.getElementsByClassName("item_barre_onglet");
var ong1 = tabong[0];
var ong2 = tabong[1];
var ong3 = tabong[2];
var ong4 = tabong[3];
var ong5 = tabong[4];

ong1.setAttribute("id","i_b_o_accueil");
ong2.setAttribute("id","i_b_o_propos");
ong3.setAttribute("id","i_b_o_projet");
ong4.setAttribute("id","i_b_o_carte");
ong5.setAttribute("id","i_b_o_contact_s");

var tabaff = document.getElementsByClassName("modif");
var mod1 = tabaff[0];
var mod2 = tabaff[1];
var mod3 = tabaff[2];
var mod4 = tabaff[3];
var mod5 = tabaff[4];

mod1.setAttribute("id","modif_accueil");
mod2.setAttribute("id","modif_propos");
mod3.setAttribute("id","modif_projet");
mod4.setAttribute("id","modif_carte");
mod5.setAttribute("id","modif_contact_v");



document.getElementById("i_b_c_1_s").onclick =function(){
	changercontact(1)
}

document.getElementById("i_b_c_2").onclick =function(){
	changercontact(2)
}

document.getElementById("i_b_c_3").onclick =function(){
	changercontact(3)
}

document.getElementById("i_b_c_4").onclick =function(){
	changercontact(4)
}

};

}





function changerprojet(valeur){
	
	
	if (valeur == 1) {

		var tabpong = document.getElementsByClassName("item_barre_projet");
		var pong1 = tabpong[0];
		var pong2 = tabpong[1];
		var pong3 = tabpong[2];
		var pong4 = tabpong[3];

		pong1.setAttribute("id","i_b_p_1_s");
		pong2.setAttribute("id","i_b_p_2");
		pong3.setAttribute("id","i_b_p_3");
		pong4.setAttribute("id","i_b_p_4");
		
		var textp1 = document.getElementById("get_text_photo_1");
		textp1.setAttribute("value","Zebre");
		var textp2 = document.getElementById("get_text_photo_2");
		textp2.setAttribute("value","Antilope");
		var textp3 = document.getElementById("get_text_photo_3");
		textp3.setAttribute("value","Giraffe");
		var textpa = document.getElementById("get_text_photo_add");
		textpa.setAttribute("value","");

	};
	
	if (valeur == 2) {

		var tabpong = document.getElementsByClassName("item_barre_projet");
		var pong1 = tabpong[0];
		var pong2 = tabpong[1];
		var pong3 = tabpong[2];
		var pong4 = tabpong[3];

		pong1.setAttribute("id","i_b_p_1");
		pong2.setAttribute("id","i_b_p_2_s");
		pong3.setAttribute("id","i_b_p_3");
		pong4.setAttribute("id","i_b_p_4");
				
		var textp1 = document.getElementById("get_text_photo_1");
		textp1.setAttribute("value","Enfants au sable");
		var textp2 = document.getElementById("get_text_photo_2");
		textp2.setAttribute("value","Rassemblement");
		var textp3 = document.getElementById("get_text_photo_3");
		textp3.setAttribute("value","charette");
		var textpa = document.getElementById("get_text_photo_add");
		textpa.setAttribute("value","");


	};

	if (valeur == 3) {

		var tabpong = document.getElementsByClassName("item_barre_projet");
		var pong1 = tabpong[0];
		var pong2 = tabpong[1];
		var pong3 = tabpong[2];
		var pong4 = tabpong[3];

		pong1.setAttribute("id","i_b_p_1");
		pong2.setAttribute("id","i_b_p_2");
		pong3.setAttribute("id","i_b_p_3_s");
		pong4.setAttribute("id","i_b_p_4");
				
		var textp1 = document.getElementById("get_text_photo_1");
		textp1.setAttribute("value","leitmotiv");
		var textp2 = document.getElementById("get_text_photo_2");
		textp2.setAttribute("value","Nénufar");
		var textp3 = document.getElementById("get_text_photo_3");
		textp3.setAttribute("value","Equipe de travail");
		var textpa = document.getElementById("get_text_photo_add");
		textpa.setAttribute("value","");



	};
	
	if (valeur == 4) {

		var tabpong = document.getElementsByClassName("item_barre_projet");
		var pong1 = tabpong[0];
		var pong2 = tabpong[1];
		var pong3 = tabpong[2];
		var pong4 = tabpong[3];

		pong1.setAttribute("id","i_b_p_1");
		pong2.setAttribute("id","i_b_p_2");
		pong3.setAttribute("id","i_b_p_3");
		pong4.setAttribute("id","i_b_p_4_s");
				
		var textp1 = document.getElementById("get_text_photo_1");
		textp1.setAttribute("value","");
		var textp2 = document.getElementById("get_text_photo_2");
		textp2.setAttribute("value","");
		var textp3 = document.getElementById("get_text_photo_3");
		textp3.setAttribute("value","");
		var textpa = document.getElementById("get_text_photo_add");
		textpa.setAttribute("value","");

		
		var supp = document.getElementById("supp_projet_v");
		supp.setAttribute("id","supp_projet");
		var add = document.getElementById("add_projet");
		add.setAttribute("id","add_projet_v");
		
		

	};


}



function changervillage(valeur){
	
	
	if (valeur == 1) {

		var tabvong = document.getElementsByClassName("item_barre_carte");
		var vong1 = tabvong[0];
		var vong2 = tabvong[1];
		var vong3 = tabvong[2];
		var vong4 = tabvong[3];

		vong1.setAttribute("id","i_b_ca_1_s");
		vong2.setAttribute("id","i_b_ca_2");
		vong3.setAttribute("id","i_b_ca_3");
		vong4.setAttribute("id","i_b_ca_4");
		
		var nom = document.getElementById("get_nom_vill");
		nom.setAttribute("value","Village 1");
		var lon = document.getElementById("get_lon_vill");
		lon.setAttribute("value","000000012");
		var lat = document.getElementById("get_lat_vill");
		lat.setAttribute("value","444444444");
		var photo = document.getElementById("get_photo_vill");
		photo.setAttribute("value","Contact 1");
		var desc = document.getElementById("get_desc_vill");
		desc.setAttribute("value","CECI Est la description du village 1");



	};
	
	if (valeur == 2) {

		var tabvong = document.getElementsByClassName("item_barre_carte");
		var vong1 = tabvong[0];
		var vong2 = tabvong[1];
		var vong3 = tabvong[2];
		var vong4 = tabvong[3];

		vong1.setAttribute("id","i_b_ca_1");
		vong2.setAttribute("id","i_b_ca_2_s");
		vong3.setAttribute("id","i_b_ca_3");
		vong4.setAttribute("id","i_b_ca_4");
		
		var nom = document.getElementById("get_nom_vill");
		nom.setAttribute("value","Village 2");
		var lon = document.getElementById("get_lon_vill");
		lon.setAttribute("value","000002212");
		var lat = document.getElementById("get_lat_vill");
		lat.setAttribute("value","444432244");
		var photov = document.getElementById("get_photo_vill");
		photov.setAttribute("value","Village2");
		var descv = document.getElementById("get_desc_vill");
		descv.setAttribute("value","CECI Est la description du village 2");


	};

	if (valeur == 3) {
		var tabvong = document.getElementsByClassName("item_barre_carte");
		var vong1 = tabvong[0];
		var vong2 = tabvong[1];
		var vong3 = tabvong[2];
		var vong4 = tabvong[3];

		vong1.setAttribute("id","i_b_ca_1");
		vong2.setAttribute("id","i_b_ca_2");
		vong3.setAttribute("id","i_b_ca_3_s");
		vong4.setAttribute("id","i_b_ca_4");
		
		var nomv = document.getElementById("get_nom_vill");
		nomv.setAttribute("value","Village 3");
		var lon = document.getElementById("get_lon_vill");
		lon.setAttribute("value","000003312");
		var lat = document.getElementById("get_lat_vill");
		lat.setAttribute("value","444434444");
		var photov = document.getElementById("get_photo_vill");
		photov.setAttribute("value","Village3");
		var descv = document.getElementById("get_desc_vill");
		descv.setAttribute("value","CECI Est la description du village 3");



	};
	
	if (valeur == 4) {

		var tabvong = document.getElementsByClassName("item_barre_carte");
		var vong1 = tabvong[0];
		var vong2 = tabvong[1];
		var vong3 = tabvong[2];
		var vong4 = tabvong[3];

		vong1.setAttribute("id","i_b_ca_1");
		vong2.setAttribute("id","i_b_ca_2");
		vong3.setAttribute("id","i_b_ca_3");
		vong4.setAttribute("id","i_b_ca_4_s");
		
		var nomv = document.getElementById("get_nom_vill");
		nomv.setAttribute("value","");
		var lon = document.getElementById("get_lon_vill");
		lon.setAttribute("value","");
		var lat= document.getElementById("get_lat_vill");
		lat.setAttribute("value","");
		var photov = document.getElementById("get_photo_vill");
		photov.setAttribute("value","");
		var descv = document.getElementById("get_desc_vill");
		descv.setAttribute("value","");



		var supp = document.getElementById("supp_village_v");
		supp.setAttribute("id","supp_village");
		var add = document.getElementById("add_village");
		add.setAttribute("id","add_village_v");
		
		

	};


}







function changercontact(valeur){
	
	
	if (valeur == 1) {

		var tabcong = document.getElementsByClassName("item_barre_contact");
		var cong1 = tabcong[0];
		var cong2 = tabcong[1];
		var cong3 = tabcong[2];
		var cong4 = tabcong[3];

		cong1.setAttribute("id","i_b_c_1_s");
		cong2.setAttribute("id","i_b_c_2");
		cong3.setAttribute("id","i_b_c_3");
		cong4.setAttribute("id","i_b_c_4");
		
		var nom = document.getElementById("get_nom_contact");
		nom.setAttribute("value","Contact 1");
		var tel = document.getElementById("get_tel_contact");
		tel.setAttribute("value","000000012");
		var mail = document.getElementById("get_mail_contact");
		mail.setAttribute("value","1jacques@afdeas.sn");
		var photo = document.getElementById("get_photo_contact");
		photo.setAttribute("value","Contact 1");
		var desc = document.getElementById("get_desc_contact");
		desc.setAttribute("value","CECI Est la description du contact 1");



	};
	
	if (valeur == 2) {

		var tabcong = document.getElementsByClassName("item_barre_contact");
		var cong1 = tabcong[0];
		var cong2 = tabcong[1];
		var cong3 = tabcong[2];
		var cong4 = tabcong[3];

		cong1.setAttribute("id","i_b_c_1");
		cong2.setAttribute("id","i_b_c_2_s");
		cong3.setAttribute("id","i_b_c_3");
		cong4.setAttribute("id","i_b_c_4");

		var nom = document.getElementById("get_nom_contact");
		nom.setAttribute("value","Contact 2");
		var tel = document.getElementById("get_tel_contact");
		tel.setAttribute("value","000000422");
		var mail = document.getElementById("get_mail_contact");
		mail.setAttribute("value","2martial@afdeas.sn");
		var photo = document.getElementById("get_photo_contact");
		photo.setAttribute("value","Contact 2");
		var desc = document.getElementById("get_desc_contact");
		desc.setAttribute("value","CECI Est la description du contact 2");


	};

	if (valeur == 3) {

		var tabcong = document.getElementsByClassName("item_barre_contact");
		var cong1 = tabcong[0];
		var cong2 = tabcong[1];
		var cong3 = tabcong[2];
		var cong4 = tabcong[3];

		cong1.setAttribute("id","i_b_c_1");
		cong2.setAttribute("id","i_b_c_2");
		cong3.setAttribute("id","i_b_c_3_s");
		cong4.setAttribute("id","i_b_c_4");

		var nom = document.getElementById("get_nom_contact");
		nom.setAttribute("value","Contact 3");
		var tel = document.getElementById("get_tel_contact");
		tel.setAttribute("value","000000072");
		var mail = document.getElementById("get_mail_contact");
		mail.setAttribute("value","3barthelemy@afdeas.sn");
		var photo = document.getElementById("get_photo_contact");
		photo.setAttribute("value","Contact 3");
		var desc = document.getElementById("get_desc_contact");
		desc.setAttribute("value","CECI Est la description du contact 3");


	};
	
	if (valeur == 4) {

		var tabcong = document.getElementsByClassName("item_barre_contact");
		var cong1 = tabcong[0];
		var cong2 = tabcong[1];
		var cong3 = tabcong[2];
		var cong4 = tabcong[3];

		cong1.setAttribute("id","i_b_c_1");
		cong2.setAttribute("id","i_b_c_2");
		cong3.setAttribute("id","i_b_c_3");
		cong4.setAttribute("id","i_b_c_4_s");
		
		var nom = document.getElementById("get_nom_contact");
		nom.setAttribute("value","");
		var tel = document.getElementById("get_tel_contact");
		tel.setAttribute("value","");
		var mail = document.getElementById("get_mail_contact");
		mail.setAttribute("value","");
		var photo = document.getElementById("get_photo_contact");
		photo.setAttribute("value","");
		var desc = document.getElementById("get_desc_contact");
		desc.setAttribute("value","");

		

		var supp = document.getElementById("supp_contact_v");
		supp.setAttribute("id","supp_contact");
		var add = document.getElementById("add_contact");
		add.setAttribute("id","add_contact_v");
		

	};

	


}
function modifiertexte(texte, page){
	
	var requetePostsupp = new XMLHttpRequest();

	requetePostsupp.open("POST","ws/modifier/"+page);
	requetePostsupp.responseType = "text";

	var postData ="nvtexte="+texte;


	
	requetePostsupp.onload = function(){
	
		console.log("Coucou");
		
		};	




requetePostsupp.error = function(){
console.error("Erreur de requete AJAX de reponse a la question : "+error);
}

requetePostsupp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
requetePostsupp.send(postData);
	
};


