
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
					
				
					
					var semi  = document.createElement("div");
					semi.setAttribute("class", "disp_produit");
					semi.textContent = LaRep[i].semi;
					
					var temps  = document.createElement("div");
					temps.setAttribute("class", "temps_produit");
					temps.textContent = LaRep[i].temps;
					
					var arrosage = document.createElement("div");
					arrosage.setAttribute("class", "a_produit");
					arrosage.textContent = "Arrosage: ";
					
					var br1 = document.createElement("br");
					var br2 = document.createElement("br");
					var br3 = document.createElement("br");
					var br4 = document.createElement("br");
					var br5 = document.createElement("br");
					var br6 = document.createElement("br");
					
					
					
					var typeArro  = document.createElement("div");
					typeArro.setAttribute("class", "quant_produit");
					typeArro.textContent = LaRep[i].typeArroo;
					
					divimage.appendChild(img);
					
					item.appendChild(divimage);
					item.appendChild(nom);
					item.appendChild(br1);
					item.appendChild(description);
					item.appendChild(br2);
					item.appendChild(semi);
					item.appendChild(br3);
					item.appendChild(temps);
					item.appendChild(br4);
					item.appendChild(typeArro);
					
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



function creationmenu(){
	
	var requeteGetProjet = new XMLHttpRequest();
	console.log("coucou");
	requeteGetProjet.open("GET","ws/commande/menu");
	console.log("coucou");
	requeteGetProjet.responseType = "json";
	console.log("coucou");
	
	
	requeteGetProjet.onload = function(){
		var LaRep = this.response;
		console.log("Dans les fiches prod asso");
		
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
