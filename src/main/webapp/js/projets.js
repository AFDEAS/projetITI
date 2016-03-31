


var changerprojet = function(valeur){
	console.log("coucou");
	var requeteGetProjet = new XMLHttpRequest();
	console.log("coucou");
	requeteGetProjet.open("GET","ws/projet/titre");
	console.log("coucou");
	requeteGetProjet.responseType = "json";
	console.log("coucou");
	
	requeteGetProjet.onload = function(){
	var LaRep = this.response;
	console.log("Dans le truc");

	console.log(LaRep[0]);
	}
	
	requeteGetProjet.send();
	
	var requeteGetImage = new XMLHttpRequest();
	console.log("coucou");
	requeteGetImage.open("GET","ws/projet/image");
	console.log("coucou");
	requeteGetImage.responseType = "json";
	console.log("coucou");
	
	requeteGetImage.onload = function(){
	var LesImg = this.response;
	console.log("Dans le truc des images");
	console.log("PLEASE"+LesImg[0][0].chemin)
	var carrousel = document.getElementsByClassName("owl-wrapper");
	
	for(i=0; i<carrousel.length; i++){
	while (carrousel[0].firstChild) {
		carrousel[0].removeChild(carrousel[0].firstChild);
	
	}
	}
	
	for(i=0; i<LesImg[valeur].length; i++){
		
		var divcarr = document.createElement("div");
		divcarr.setAttribute("class","owl-item");
		divcarr.setAttribute("style","width: 600px;");
		var divimage = document.createElement("div");
		divimage.setAttribute("class","item");
		var image = document.createElement("img");
		image.setAttribute("class","imgprojet");
		image.setAttribute("src","img/"+LesImg[valeur][i].chemin);
		var divdesc = document.createElement("div");
		divdesc.setAttribute("class","contientdesc");
		divdesc.textContent = LesImg[valeur][i].description;
		
		divimage.appendChild(image);
		divimage.appendChild(divdesc);
		divcarr.appendChild(divimage);
		carrousel[0].appendChild(divcarr);
		
		
		
		
		console.log("Le chemin est "+LesImg[valeur][i].chemin)
	}
	
	}
	
	requeteGetImage.send();


}


function creerprojet(id, element){
	
	element.onclick = function() {
		  changerprojet(id);
	  };
	
	
}


window.onload = function(){


var i =0;


var ele = document.getElementsByClassName("projet");

for(i=0; i<ele.length; i++){
	
	creerprojet(i, ele[i]);
}

document.getElementById("proj11").onclick = function(){
		i = i-1;
		changerprojet(i);
		console.log("coucou");
}
	
	document.getElementById("proj12").onclick = function(){
		i = i+1;
		changerprojet(i);
		console.log(i);

}

console.log(i);
}


