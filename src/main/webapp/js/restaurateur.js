
window.onload = function(){

	
	
	
	creationmenu();
	
	changercategorie("Tout");
	
	
	document.getElementById("bouttonok").onclick=function(){
		
		
		
		var requetePostimg = new XMLHttpRequest();
		var id = document.getElementById("rech_catalogue").value;
		requetePostimg.open("POST","ws/commande/imgrech/"+id);
		requetePostimg.responseType = "json";

		var postData =null;
		var rep = null;
		requetePostimg.onload = function(){
			
			var LesImg = this.response;
			
			console.log("les img = " + LesImg[0].chemin);
			
			
			
			
			
			
			
			var requetePostsupp = new XMLHttpRequest();
			var id = document.getElementById("rech_catalogue").value;
			requetePostsupp.open("POST","ws/commande/rech/"+id);
			requetePostsupp.responseType = "json";

			var postData =null;
			
			requetePostsupp.onload = function(){
				
				var LaRep = this.response;
				
				
				var conteneur = document.getElementById("cat");
				
				
					while (conteneur.firstChild) {
						conteneur.removeChild(conteneur.firstChild);
					
						
						
					}
				
				for(i=0; i<LaRep.length; i+=1){
					
					
					console.log("le Produit = " + LaRep[i].nom);
					
					var conteneur = document.getElementById("cat");
					
					
					var carre = document.createElement("span");
					carre.setAttribute("class","item_cat viande");
					
					var item = document.createElement("div");
					item.setAttribute("class", "inner_item");
					
					var divimage = document.createElement("div");
					divimage.setAttribute("class", "image_produit");
					
					var img = document.createElement("img");
					img.setAttribute("src", "img/"+LesImg[0].chemin);
					
					var nom  = document.createElement("div");
					nom.setAttribute("class", "nom_produit");
					nom.textContent = LaRep[i].nom;
					
					var description  = document.createElement("div");
					description.setAttribute("class", "desc_produit");
					description.textContent = LaRep[i].description;
					
				
					
					var saison  = document.createElement("div");
					saison.setAttribute("class", "disp_produit");
					saison.textContent = LaRep[i].saison;
					
					var quantiteDispoTexte  = document.createElement("div");
					quantiteDispoTexte.setAttribute("class", "q_produit");
					quantiteDispoTexte.textContent = "Quantité Maximale";
					
					var br1 = document.createElement("br");
					var br2 = document.createElement("br");
					var br3 = document.createElement("br");
					var br4 = document.createElement("br");
					var br5 = document.createElement("br");
					
					
					
					var quantiteDispo  = document.createElement("div");
					quantiteDispo.setAttribute("class", "quant_produit");
					quantiteDispo.textContent = LaRep[i].quantiteDispo;
					
					divimage.appendChild(img);
					
					item.appendChild(divimage);
					item.appendChild(nom);
					item.appendChild(br1);
					item.appendChild(description);
					item.appendChild(br2);
					item.appendChild(saison);
					item.appendChild(br3);
					item.appendChild(quantiteDispoTexte);
					item.appendChild(br4);
					item.appendChild(quantiteDispo);
					
					carre.appendChild(item);
					
					conteneur.appendChild(carre);
					
					
					};
				
				};	

				requetePostsupp.error = function(){
					console.error("Erreur de requete AJAX de reponse a la question : "+error);
					}

					requetePostsupp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
					requetePostsupp.send(postData);
			
			
			
			
			
			
			
			
			
			
			
	}

		requetePostimg.error = function(){
		console.error("Erreur de requete AJAX de reponse a la question : "+error);
		}

		requetePostimg.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
		requetePostimg.send(postData);


		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	var items = document.getElementsByClassName("inner_item");
	var is = items.length;
	var k=0;
	for (k=0;k<is;k++)
	items[k].onclick =function(){
		afficherdetail(k)
	};
	
	
	
	document.getElementById("detail_item_close").onclick=function(){
		effacerdetail()
	}
	
	document.getElementById("detail_item_background").onclick=function(){
		effacerdetail()
	}
	
	
	
	
	
	
	var mails = document.getElementsByClassName("mailtot");
	var ms = mails.length;
	var z =0;
	for(z=0;z<ms;z++){
		
		mails[z].onclick=function(){
			mail(z)
		};
	
	}
}


function changeronglet(valeur){

	
// Legumes	
	
if (valeur == 1) {

var tabong = document.getElementsByClassName("item_barre_catalogue");
var ong1 = tabong[0];
var ong2 = tabong[1];
var ong3 = tabong[2];
var ong4 = tabong[3];
var ong5 = tabong[4];
var ong6 = tabong[5];

ong1.setAttribute("id","i_b_ca_1_s");
ong2.setAttribute("id","i_b_ca_2");
ong3.setAttribute("id","i_b_ca_3");
ong4.setAttribute("id","i_b_ca_4");
ong5.setAttribute("id","i_b_ca_5");
ong6.setAttribute("id","i_b_ca_6");

var i=0;

var leg = document.getElementsByClassName("legume");
var ls = leg.length;
for(i=0;i<ls;i++){
	leg[i].setAttribute("class","item_cat legume")
};



var fru = document.getElementsByClassName("fruit");
var fs = fru.length;
for(i=0;i<fs;i++){
	fru[i].setAttribute("class","item_cat_i fruit")
};

var via = document.getElementsByClassName("viande");
var vs = via.length;
for(i=0;i<vs;i++){
	via[i].setAttribute("class","item_cat_i viande")
};

var poi = document.getElementsByClassName("poisson");
var ps = poi.length;
for(i=0;i<ps;i++){
	poi[i].setAttribute("class","item_cat_i poisson")
};

var aut = document.getElementsByClassName("autre");
var as = aut.length;
for(i=0;i<as;i++){
	aut[i].setAttribute("class","item_cat_i autre")
};

/*var mod1 = affichage[0];
var mod2 = affichage[1];
var mod3 = affichage[2];
var mod4 = affichage[3];
var mod5 = affichage[4];
*/


};

//Fruits

if (valeur == 2) {

var tabong = document.getElementsByClassName("item_barre_catalogue");
var ong1 = tabong[0];
var ong2 = tabong[1];
var ong3 = tabong[2];
var ong4 = tabong[3];
var ong5 = tabong[4];
var ong6 = tabong[5];

ong1.setAttribute("id","i_b_ca_1");
ong2.setAttribute("id","i_b_ca_2_s");
ong3.setAttribute("id","i_b_ca_3");
ong4.setAttribute("id","i_b_ca_4");
ong5.setAttribute("id","i_b_ca_5");
ong6.setAttribute("id","i_b_ca_6");

var i=0;

var leg = document.getElementsByClassName("legume");
var ls = leg.length;
for(i=0;i<ls;i++){
	leg[i].setAttribute("class","item_cat_i legume")
};

var fru = document.getElementsByClassName("fruit");
var fs = fru.length;
for(i=0;i<fs;i++){
	fru[i].setAttribute("class","item_cat fruit")
};

var via = document.getElementsByClassName("viande");
var vs = via.length;
for(i=0;i<vs;i++){
	via[i].setAttribute("class","item_cat_i viande")
};

var poi = document.getElementsByClassName("poisson");
var ps = poi.length;
for(i=0;i<ps;i++){
	poi[i].setAttribute("class","item_cat_i poisson")
};

var aut = document.getElementsByClassName("autre");
var as = aut.length;
for(i=0;i<as;i++){
	aut[i].setAttribute("class","item_cat_i autre")
};

};

//Viandes

if (valeur == 3) {

var tabong = document.getElementsByClassName("item_barre_catalogue");
var ong1 = tabong[0];
var ong2 = tabong[1];
var ong3 = tabong[2];
var ong4 = tabong[3];
var ong5 = tabong[4];
var ong6 = tabong[5];

ong1.setAttribute("id","i_b_ca_1");
ong2.setAttribute("id","i_b_ca_2");
ong3.setAttribute("id","i_b_ca_3_s");
ong4.setAttribute("id","i_b_ca_4");
ong5.setAttribute("id","i_b_ca_5");
ong6.setAttribute("id","i_b_ca_6");

var i=0;

var leg = document.getElementsByClassName("legume");
var ls = leg.length;
for(i=0;i<ls;i++){
	leg[i].setAttribute("class","item_cat_i legume")
};

var fru = document.getElementsByClassName("fruit");
var fs = fru.length;
for(i=0;i<fs;i++){
	fru[i].setAttribute("class","item_cat_i fruit")
};

var via = document.getElementsByClassName("viande");
var vs = via.length;
for(i=0;i<vs;i++){
	via[i].setAttribute("class","item_cat viande")
};

var poi = document.getElementsByClassName("poisson");
var ps = poi.length;
for(i=0;i<ps;i++){
	poi[i].setAttribute("class","item_cat_i poisson")
};

var aut = document.getElementsByClassName("autre");
var as = aut.length;
for(i=0;i<as;i++){
	aut[i].setAttribute("class","item_cat_i autre")
};


};

//Poissons

if (valeur == 4) {

var tabong = document.getElementsByClassName("item_barre_catalogue");
var ong1 = tabong[0];
var ong2 = tabong[1];
var ong3 = tabong[2];
var ong4 = tabong[3];
var ong5 = tabong[4];
var ong6 = tabong[5];

ong1.setAttribute("id","i_b_ca_1");
ong2.setAttribute("id","i_b_ca_2");
ong3.setAttribute("id","i_b_ca_3");
ong4.setAttribute("id","i_b_ca_4_s");
ong5.setAttribute("id","i_b_ca_5");
ong6.setAttribute("id","i_b_ca_6");

var i=0;

var leg = document.getElementsByClassName("legume");
var ls = leg.length;
for(i=0;i<ls;i++){
	leg[i].setAttribute("class","item_cat_i legume")
};

var fru = document.getElementsByClassName("fruit");
var fs = fru.length;
for(i=0;i<fs;i++){
	fru[i].setAttribute("class","item_cat_i fruit")
};

var via = document.getElementsByClassName("viande");
var vs = via.length;
for(i=0;i<vs;i++){
	via[i].setAttribute("class","item_cat_i viande")
};

var poi = document.getElementsByClassName("poisson");
var ps = poi.length;
for(i=0;i<ps;i++){
	poi[i].setAttribute("class","item_cat poisson")
};

var aut = document.getElementsByClassName("autre");
var as = aut.length;
for(i=0;i<as;i++){
	aut[i].setAttribute("class","item_cat_i autre")
};


};

//Autre

if (valeur == 5) {

var tabong = document.getElementsByClassName("item_barre_catalogue");
var ong1 = tabong[0];
var ong2 = tabong[1];
var ong3 = tabong[2];
var ong4 = tabong[3];
var ong5 = tabong[4];
var ong6 = tabong[5];

ong1.setAttribute("id","i_b_ca_1");
ong2.setAttribute("id","i_b_ca_2");
ong3.setAttribute("id","i_b_ca_3");
ong4.setAttribute("id","i_b_ca_4");
ong5.setAttribute("id","i_b_ca_5_s");
ong6.setAttribute("id","i_b_ca_6");

var i=0;

var leg = document.getElementsByClassName("legume");
var ls = leg.length;
for(i=0;i<ls;i++){
	leg[i].setAttribute("class","item_cat_i legume")
};

var fru = document.getElementsByClassName("fruit");
var fs = fru.length;
for(i=0;i<fs;i++){
	fru[i].setAttribute("class","item_cat_i fruit")
};

var via = document.getElementsByClassName("viande");
var vs = via.length;
for(i=0;i<vs;i++){
	via[i].setAttribute("class","item_cat_i viande")
};

var poi = document.getElementsByClassName("poisson");
var ps = poi.length;
for(i=0;i<ps;i++){
	poi[i].setAttribute("class","item_cat_i poisson")
};

var aut = document.getElementsByClassName("autre");
var as = aut.length;
for(i=0;i<as;i++){
	aut[i].setAttribute("class","item_cat autre")
};


};

//Tout

if (valeur == 6) {

var tabong = document.getElementsByClassName("item_barre_catalogue");
var ong1 = tabong[0];
var ong2 = tabong[1];
var ong3 = tabong[2];
var ong4 = tabong[3];
var ong5 = tabong[4];
var ong6 = tabong[5];

ong1.setAttribute("id","i_b_ca_1");
ong2.setAttribute("id","i_b_ca_2");
ong3.setAttribute("id","i_b_ca_3");
ong4.setAttribute("id","i_b_ca_4");
ong5.setAttribute("id","i_b_ca_5");
ong6.setAttribute("id","i_b_ca_6_s");

var i=0;

var leg = document.getElementsByClassName("legume");
var ls = leg.length;
for(i=0;i<ls;i++){
	leg[i].setAttribute("class","item_cat legume")
};

var fru = document.getElementsByClassName("fruit");
var fs = fru.length;
for(i=0;i<fs;i++){
	fru[i].setAttribute("class","item_cat fruit")
};

var via = document.getElementsByClassName("viande");
var vs = via.length;
for(i=0;i<vs;i++){
	via[i].setAttribute("class","item_cat viande")
};

var poi = document.getElementsByClassName("poisson");
var ps = poi.length;
for(i=0;i<ps;i++){
	poi[i].setAttribute("class","item_cat poisson")
};

var aut = document.getElementsByClassName("autre");
var as = aut.length;
for(i=0;i<as;i++){
	aut[i].setAttribute("class","item_cat autre")
};


};


}

function afficherdetail( k ){
	
if (k>=0){

/*	
	var j=k;
	var objets = document.getElementsByClassName("inner_items");
	var os = objets.length;
		
	
	
	var nom = objets[j].getElementsbyClassName("nom_produit");
	var imgp = objets[j].getElementsbyClassName("image_produit");
	var dispop = objets[j].getElementsbyClassName("disp_produit");
	var quantp = objets[j].getElementsbyClassName("quant_produit");
	
*/

	var titre = document.getElementById("detail_item_titre");
	var imgd = document.getElementById("detail_item_image");
	var quantd = document.getElementById("detail_item_quant");

	
	
//	imgd.setAttribute("value",imgp);
//	quantd.setAttribute("value",quantp);

	
	var bg = document.getElementById("detail_item_background");
	var fen = document.getElementById("detail_item_window");
	
	bg.setAttribute("class","background_v");
	fen.setAttribute("class","w_v");
};	
	
	
}

function effacerdetail(){
	var bg = document.getElementById("detail_item_background");
	var fen = document.getElementById("detail_item_window");
	
	bg.setAttribute("class","background_i");
	fen.setAttribute("class","w_i");
	
}



function mail(valeur){

	if( valeur == 1 ){
		
		var formul = document.getElementById("sendmail");
		formul.setAttribute("action","mailto:peru.patrice@afdeas.sn")
		
		var bg = document.getElementById("detail_item_background");
		var fen = document.getElementById("detail_item_window");
		
		bg.setAttribute("class","background_v");
		fen.setAttribute("class","w_v");
		
	};

	if( valeur == 2 ){
		
		var formul = document.getElementById("sendmail");
		formul.setAttribute("action","mailto:morgante.laurent@afdeas.sn")
		
		var bg = document.getElementById("detail_item_background");
		var fen = document.getElementById("detail_item_window");
		
		bg.setAttribute("class","background_v");
		fen.setAttribute("class","w_v");
		
	};
	
	if( valeur == 3 ){
		
		var formul = document.getElementById("sendmail");
		formul.setAttribute("action","mailto:vandamme.patrick@reactif.fr")
		
		var bg = document.getElementById("detail_item_background");
		var fen = document.getElementById("detail_item_window");
		
		bg.setAttribute("class","background_v");
		fen.setAttribute("class","w_v");
		
	};
	
}


function creationmenu(){
	
	var requeteGetProjet = new XMLHttpRequest();
	console.log("coucou");
	requeteGetProjet.open("GET","ws/commande/menu");
	console.log("coucou");
	requeteGetProjet.responseType = "json";
	console.log("coucou");
	
	
	requeteGetProjet.onload = function(){
		var LaRep = this.response;
		console.log("Dans le truc");
		
		for(i=0; i<LaRep.length; i+=1){
			
			
			console.log("la catégorie = " + LaRep[i]);
			creationonglet(LaRep[i]);
			
			
			};
			
			creationonglet("Tout");
		}
		
		requeteGetProjet.send();
		
	
	
}


function creationonglet(id){
	
var barre = document.getElementById("barre_ong_catalogue");

var onglet = document.createElement("div");
onglet.setAttribute("class", "item_barre_catalogue");
onglet.textContent = id;

onglet.onclick = function() {
	  changercategorie(id);
};
	

barre.appendChild(onglet);
	
	
	
	
}

function changercategorie(id){
	
	var requetePostimg = new XMLHttpRequest();

	requetePostimg.open("POST","ws/commande/img/"+id);
	requetePostimg.responseType = "json";

	var postData =null;
	var rep = null;
	requetePostimg.onload = function(){
		
		var LesImg = this.response;
		
		console.log("les img = " + LesImg[0].chemin);
		
		
		
		
		
		
		
		var requetePostsupp = new XMLHttpRequest();

		requetePostsupp.open("POST","ws/commande/"+id);
		requetePostsupp.responseType = "json";

		var postData =null;
		
		requetePostsupp.onload = function(){
			
			var LaRep = this.response;
			
			
			var conteneur = document.getElementById("cat");
			
			
				while (conteneur.firstChild) {
					conteneur.removeChild(conteneur.firstChild);
				
					
					
				}
			
			for(i=0; i<LaRep.length; i+=1){
				
				
				console.log("le Produit = " + LaRep[i].nom);
				
				var conteneur = document.getElementById("cat");
				
				
				var carre = document.createElement("span");
				carre.setAttribute("class","item_cat viande");
				
				var item = document.createElement("div");
				item.setAttribute("class", "inner_item");
				
				var divimage = document.createElement("div");
				divimage.setAttribute("class", "image_produit");
				
				var img = document.createElement("img");
				img.setAttribute("src", "img/"+LesImg[0].chemin);
				
				var nom  = document.createElement("div");
				nom.setAttribute("class", "nom_produit");
				nom.textContent = LaRep[i].nom;
				
				var description  = document.createElement("div");
				description.setAttribute("class", "desc_produit");
				description.textContent = LaRep[i].description;
				
			
				
				var saison  = document.createElement("div");
				saison.setAttribute("class", "disp_produit");
				saison.textContent = LaRep[i].saison;
				
				var quantiteDispoTexte  = document.createElement("div");
				quantiteDispoTexte.setAttribute("class", "q_produit");
				quantiteDispoTexte.textContent = "Quantité Maximale";
				
				var br1 = document.createElement("br");
				var br2 = document.createElement("br");
				var br3 = document.createElement("br");
				var br4 = document.createElement("br");
				var br5 = document.createElement("br");
				
				
				
				var quantiteDispo  = document.createElement("div");
				quantiteDispo.setAttribute("class", "quant_produit");
				quantiteDispo.textContent = LaRep[i].quantiteDispo;
				
				divimage.appendChild(img);
				
				item.appendChild(divimage);
				item.appendChild(nom);
				item.appendChild(br1);
				item.appendChild(description);
				item.appendChild(br2);
				item.appendChild(saison);
				item.appendChild(br3);
				item.appendChild(quantiteDispoTexte);
				item.appendChild(br4);
				item.appendChild(quantiteDispo);
				
				carre.appendChild(item);
				
				conteneur.appendChild(carre);
				
				
				};
			
			};	

			requetePostsupp.error = function(){
				console.error("Erreur de requete AJAX de reponse a la question : "+error);
				}

				requetePostsupp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
				requetePostsupp.send(postData);
		
		
		
		
		
		
		
		
		
		
		
}

	requetePostimg.error = function(){
	console.error("Erreur de requete AJAX de reponse a la question : "+error);
	}

	requetePostimg.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	requetePostimg.send(postData);


	
	
	
	
}
