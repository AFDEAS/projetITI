var map;
function initMap() {


  map = new google.maps.Map(document.getElementById('map'), {
    center: {lat: 14.654345, lng: -15.263202},
    zoom: 7,
    scrollwheel:  false,
  });

  var requeteGetProjet = new XMLHttpRequest();
	console.log("coucou");
	requeteGetProjet.open("GET","ws/carte/point");
	console.log("coucou");
	requeteGetProjet.responseType = "json";
	console.log("coucou");
	
	requeteGetProjet.onload = function(){
	var LaRep = this.response;
	console.log("Dans le truc");
	
	for(i=0; i<LaRep.length; i+=1){
		
		
		console.log(LaRep[i].coordonneex);
		console.log(LaRep[i].coordonney);
		creermarker(i, LaRep[i].coordonneex, LaRep[i].coordonney)
		
		
		};

	console.log(LaRep[0]);
	}
	
	requeteGetProjet.send();
	

  


	
		
	

	function creermarker(id, lat, lng){
		
		 new google.maps.Marker({
			    map: map,
			    place: {
			      location: {lat: lat, lng: lng},
			      query: 'Google, Sydney, Australia'

			    },
			    
			  }).addListener('click', function() {
				  ouvrir(id);
			  });
	}	

 





  var fermerclass= document.getElementsByClassName("fermer")
  



  function ouvrir(numero){
  var tabinfo = document.getElementsByClassName("information");
  var info = tabinfo[numero];
  info.setAttribute("class","informationon");
  }


  function fermer(){
  var tabinfo = document.getElementsByClassName("informationon");
  console.log("CoUcOu");
  for(i=0; i<tabinfo.length; i++){
  var info = tabinfo[i];
  info.setAttribute("class","information");}
  }
  
  for(i=0; i<fermerclass.length; i++){
	  
	  fermerclass[i].onclick =function(){
		  console.log("Dans onClick");
		  
	fermer();}}


}



