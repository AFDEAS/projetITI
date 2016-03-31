<%@ page pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Projets | L'Eau qui germe</title>
<meta charset="UTF-8" />
<link type="text/css" rel="stylesheet" href="css/css.css" />
<link rel="icon" href="img/eau.ico" />
<link rel="stylesheet" href="owl-carousel/owl.carousel.css">
<link rel="stylesheet" href="owl-carousel/owl.transitions.css">
<link rel="stylesheet" href="owl-carousel/owl.theme.css">
<script src="js/moderateur.js" type="application/javascript"></script>
</head>

<body>





	<!-- NAVIGATION -->

	<header>
		<%@include file="nav_mod.jsp"%>
	</header>














	<span id="globalcontent"> <span id="modcontent"> 
		
		
		<!--  EXPLICATIONS  -->

			<h1>Vous pouvez ici modifier les pages:</h1>
			
			
			 <!-- BARRE D'ONGLETS -->

			<div id="barre_onglets">
				<div class="barre_onglet">

					<div class="item_barre_onglet" id="i_b_o_accueil_s">Accueil</div>
					<div class="item_barre_onglet" id="i_b_o_propos">A Propos</div>
					<div class="item_barre_onglet" id="i_b_o_projet">Projets</div>
					<div class="item_barre_onglet" id="i_b_o_carte">Carte</div>
					<div class="item_barre_onglet" id="i_b_o_contact">Contacts</div>

				</div>
			</div>
			
			
			 <!--    MODIFICATION DE L'ACCUEIL   -->

			<div id="modif_accueil_v" class="modif">

				
					<div class="blocl" id="text_accueil">Texte de présentation</div>

					<textarea class="bloc" id="inp_text_accueil" type="text">${texteAccueil} </textarea>
					<button id="bouton_modif_texte_accueil" class="bloc" name="modif_accueil_text" type="submit"
						value="sub_text_accueil">Editer</button>
					<br />
					<br />
					
					<% int i = 0; %>
						<c:forEach var="photo" items="${listPhoto}"> 
					
					<form class="gestion-accueil" method="POST"
					action="ajouterphoto" enctype="multipart/form-data" >
					<% i++; %>
					<div id="photo_accueil" class="blocl">${photo.description}</div>
					
					<input name="cheminphoto" type="hidden" value="${photo.chemin}">
					<input name="descriptionphoto" type="hidden" value="${photo.description}">
					<input name="titrephoto" type="hidden" value="accueil">
					
					
					
					<input class="fileupload" type="file" size="25"
						name="photoaajouter">
						
					<button name="modif_accueil_photo_1" type="submit"
						value="sub_photo_accueil">Remplacer</button>
					</form>
					<form class="gestion-accueil" method="POST"
					action="ajouterphoto" enctype="multipart/form-data" >
					<input name="cheminphoto" type="hidden" value="${photo.chemin}">
					<button name="suppr_accueil_photo_1" type="submit"
						value="del_photo_accueil_1" class="bloc">Supprimer</button>
					<br />
					<br />
					</form>

						</c:forEach>
						
				<form class="gestion-accueil" method="POST"
					action="ajouterphoto" enctype="multipart/form-data" >		
				
				<%		
				i++;
				out.println( "<input name=\"descriptionphoto\" type=\"hidden\" value=\"photo d'accueil "+i+"\">"	);	
				 %>	
				 
				 <input name="titrephoto" type="hidden" value="accueil">
						
				<div id="add_photo_accueil" class="blocl">Ajouter une photo:
					</div>
					<input class="fileupload" type="file" size="25"
						name="photoaajouter">
					<button name="modif_accueil_photo_add" type="submit"
						value="sub_photo_accueil_add">Ajouter</button>
					<br />
					<br />
					
				</form>


			


			</div>
			
			
			 <!--    MODIFICATION DE L'A PROPOS   -->

			<div id="modif_propos" class="modif">

					<div id="desc_contact" class="blocl">Description:</div>
					<textarea id="inp_desc_contact"> ${textePropos}</textarea>
					<button name="modif-cont-desc" type="submit"
						id="sub_desc_contact">Editer</button>
					<br />
					<br />


				
						<form class="gestion-accueil" method="POST"
					action="ajouterphoto" enctype="multipart/form-data" >
					<div id="photo_propos" class="blocl">Photo:</div>	
					<input name="cheminphoto" type="hidden" value="${photoPropos.chemin}">
					<input name="descriptionphoto" type="hidden" value="${photoPropos.description}">
					<input name="titrephoto" type="hidden" value="propos">
					<input class="fileupload" type="file" size="25" name="photoaajouter">
					<button name="modif_propos_photo" type="submit"
						value="sub_photo_propos">Remplacer</button>
					<br />
					<br />
					</form>
			

			</div>
			
			
			 <!-- MODIFICATION DE PROJET -->

			<div id="modif_projet" class="modif">

			<% int j = 0;
				int z = 0;%>
			
				<div id="barre_ong_projet">
				
				
				<c:forEach var="projet" items="${listProjet}"> 
				
					<div class="item_barre_projet" id="i_b_p_1_s">${projet.nom}</div>

				<div id="item_projet">


			
				

						<!--  créer un c:forEach pour chaque photo   -->
						
						
		
				
				
				 <% 
		
		request.setAttribute("photosprojets", request.getSession().getAttribute("listPhotoProjet"+j));
				System.out.println("j="+j);
				System.out.println("nom=listPhotoProjet"+j);
				System.out.println("photosprojets="+request.getSession().getAttribute("listPhotoProjet"+j));
				 j++;
				 z=0;%>
				 
				 
		<c:forEach var="photoprojet" items="${photosprojets}" >   
		
				<% z++;
				%>		
						
						<br />
						<% out.println("<div id=\"photo_projet\" class=\"blocl\">Photo "+z+":</div>"); %>
						
						
					<form class="gestion-accueil" method="POST"
					action="ajouterphoto" enctype="multipart/form-data" >
					
					
						<input class="fileupload" type="file" size="25"
							name="photoaajouter"><br />
							
					<input name="cheminphoto" type="hidden" value="${photoprojet.chemin}">
					
					<input name="titrephoto" type="hidden" value="${projet.nom}">	
							
							
							
						<div class="blocl" id="text_photo_projet_1">Description:</div>
						<input class="bloc" name="descriptionphoto" type="text"
							value="${photoprojet.description}" id="get_text_photo_1">

						<button name="modif_projet_photo_1" type="submit"
							value="sub_photo_projet_1">Editer</button>
							
						</form>
						
						<form class="gestion-accueil" method="POST"
					action="ajouterphoto" enctype="multipart/form-data" >
						
						<input name="cheminphoto" type="hidden" value="${photoprojet.chemin}">
						
							
						<button name="suppr_projet_photo_1" type="submit"
							value="del_photo_projet_1">Supprimer</button>
							
							
						</form>
						<br />
						<br />


			</c:forEach>
			
			
			<form class="gestion-accueil" method="POST"
					action="ajouterphoto" enctype="multipart/form-data" >

						<div id="add_photo_projet" class="blocl">Ajouter une photo:
						</div>
						<input name="titrephoto" type="hidden" value="${projet.nom}">	
						<input class="fileupload" type="file" size="25"
							name="photoaajouter"><br />
						<div class="blocl" id="text_photo_projet_3">Description:</div>
						<input class="bloc" name="descriptionphoto" type="text"
							id="get_text_photo_add">
							
							
							
						<button name="modif_projet_photo_add" type="submit"
							value="sub_photo_projet_add">Ajouter</button>
							
							
								</form>
						<br />
						<br />

						</div>
						<div id="supp_projet_v" class="AS_p">
						
						<form class="gestion-accueil" method="POST"
					action="suppprojet" >
						
						<input name="titreprojet" type="hidden" value="${projet.nom}">
						
							<div id="sup_projet" class="blocl">Supprimer le projet:</div>
							<button name="suppr-proj" type="submit" value="sub_sup_proj">
								Supprimer <img class="icon_del_contact"
									src="img/delete-icon.png">
									
									
							</button>
					</form>
			
						</div>
				
					
					</c:forEach>  
					
					
				
					
					<div class="item_barre_projet" id="i_b_p_4">Ajouter un projet</div>

			
						
						
							<div id="add_proj" class="blocl">Ajouter le projet:</div>
							
							<form class="gestion-accueil" method="POST"
					action="ajouterprojet" >
							
							<input class="bloc" name="nomprojet" type="text"
							id="get_text_photo_1">
							
							<button name="ajout-proj" type="submit" value="sub_ajout_proj">
								Ajouter <img class="icon_add_contact" src="img/add-icon.png">
							</button>
							
							</form>
						

			

				</div>

		</div>
		 
		 
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			 <!-- MODIFICATION CARTE -->
			<div id="modif_carte" class="modif">


			<% j =0; %>
				<!-- implémenter un C forEach -->
				
				<c:forEach var="village" items="${listVillage}"> 

			<% j++; %>
				<div id="barre_ong_carte">
		
					<div class="item_barre_carte" id="i_b_ca_1_s">${village.nom}</div>
					
					
				</div>
				

					
				


				<div class="item-contact">
				
				<form class="gestion-accueil" method="POST"
					action="modifiervillagevitrine" enctype="multipart/form-data" >
					
					<input name="descriptionphoto" type="hidden" value="Photo du village ${village.nom}">
					<input name="anciennomvillage" type="hidden" value="${village.nom}">
					
					
	
						<br />
						
						
						<br />
						<br />

						<div class="blocl" id="lon_vill">Longitude:</div>
						<input class="bloc" name="longvillage" type="text"
							value="${village.coordonney}" id="get_lon_vill">
					
						<br />
						<br />

						<div id="lat_vill" class="blocl">Latitude:</div>
						<input name="latvillage" type="text" value="${village.coordonneex}"
							id="get_lat_vill">
						
						<br />
						<br />


						

						<div id="desc_village" class="blocl">Description:</div>
						<input class="large" type="text" name="descriptionvillage"
							id="get_desc_vill" value="${village.description}">
							
							<br />
						<br />
							<div id="photo_vill" class="blocl">Photo:</div>
						<input class="fileupload" type="file" size="25" name="photovillage"
							id="get_photo_vill">
						
						<br />
						<br />
						<button name="modif-cont-vill" type="submit" value="sub_desc_vill">
							Editer le Village</button>
						<br />
						<br />
						
						
				</form>

						<div id="supp_village_v" class="AS_v">
						
						
					<form class="gestion-accueil" method="POST"
					action="supprimervillagevitrine"  >	
						
						
						<input name="anciennomvillage" type="hidden" value="${village.nom}">
						
							<div id="sup_vill" class="blocl">Supprimer le projet:</div>
							<button name="suppr-vill" type="submit" value="sub_sup_vill">
								Supprimer <img class="icon_del_contact"
									src="img/delete-icon.png">
							</button>
							
							
							<br />
						<br />
					</form>
						</div>
					

		
				</div>

	
						
						
					
						
							
							
							
							
							
							
							
					
			
				</c:forEach>
				
				
				
						<div class="item_barre_carte" id="i_b_ca_4">Ajouter un
						village</div>
						<br />
						<br />
						
						<form class="gestion-accueil" method="POST"
					action="ajoutervillagevitrine" enctype="multipart/form-data" >
					
					<input name="descriptionphoto" type="hidden" value="Photo du village ${village.nom}">
					
					<div class="blocl" id="lon_vill">Nom : </div>
					<input name="nomvillage" value="">
					
					
	
						<br />
						
						
						<br />
						<br />

						<div class="blocl" id="lon_vill">Longitude:</div>
						<input class="bloc" name="longvillage" type="text"
							value="" id="get_lon_vill">
					
						<br />
						<br />

						<div id="lat_vill" class="blocl">Latitude:</div>
						<input name="latvillage" type="text" value=""
							id="get_lat_vill">
						
						<br />
						<br />


						

						<div id="desc_village" class="blocl">Description:</div>
						<input class="large" type="text" name="descriptionvillage"
							id="get_desc_vill" value="">
							
							<br />
						<br />
							<div id="photo_vill" class="blocl">Photo:</div>
						<input class="fileupload" type="file" size="25" name="photovillage"
							id="get_photo_vill">
						
						<br />
						<br />
						
						
						
						<button name="ajout-vill" type="submit" value="sub_ajout_vill">
								Ajouter <img class="icon_add_contact" src="img/add-icon.png">
							</button>
							
							
						</form>
							
							

			</div>
			
			
			
			 <!--  MODIFICATION DE CONTACTS  -->

			<div id="modif_contact" class="modif">

				<!-- implémenter un C forEach -->
				
				<% j=0; %>
				
				<c:forEach var="Contact" items="${listecontact}">

				<div id="barre_ong_contact">
				<% 
				j++;
				out.println("<div class=\"item_barre_contact\" id=\"i_b_c_1_s\">Contact "+j+"</div>"); %>
					
					

					

				</div>

	
				<form class="gestion-accueil" method="POST"
					action="modifiercontact" enctype="multipart/form-data" >

				<input name="ancienemailcontact" type="hidden" value="${Contact.email}">
					

				<div class="item-contact">

						<br />
						<div class="blocl" id="nom_contact">Nom:</div>
						<input class="bloc" name="nomcontact" type="text"
							value="${Contact.nom}" id="get_nom_contact">
						
						<br />
						<br />
						
						<div class="blocl">Prenom:</div>
						<input class="bloc" name="prenomcontact" type="text"
							value="${Contact.prenom}" >
						
						<br />
						<br />

						<div id="tel_contact" class="blocl">Numero de téléphone:</div>
						<input name="telephonecontact" type="text" value="${Contact.telephone}"
							id="get_tel_contact">
						
						<br />
						<br />

						<div id="mail_contact" class="blocl">Email:</div>
						<input name="emailcontact" type="text"
							value="${Contact.email}" id="get_mail_contact">
						
						
						<br />
						<br />

						<div id="photo_contact" class="blocl">Photo:</div>
						<input class="fileupload" type="file" size="25" name="photocontact"
							id="get_photo_contact">
						
						<br />
						<br />

						<div id="desc_contact" class="blocl">Description:</div>
						<input class="large" type="text" name="descriptioncontact"
							id="get_desc_contact"
							value="${Contact.description}">
							
							
						<button name="modif-cont-desc" type="submit"
							value="sub_desc_contact">Editer le Contact</button>
						<br />
						<br />
						
						
				</form>
				
				<form class="gestion-accueil" method="POST"
					action="suppcontact" >

				<input name="nomcontact" type="hidden" value="${Contact.email}">
				

						<div id="supp_contact_v" class="AS_c">
							<div id="sup_contact" class="blocl">Supprimer le contact:</div>
							<button name="suppr-cont" type="submit" value="sub_sup_cont">
								Supprimer <img class="icon_del_contact"
									src="img/delete-icon.png">
							</button>
						</div>
						
				</form>
						<br />
						<br />
						
						
						</c:forEach>
						
						
						
						
						
						
						
						
					
						
						<div class="item_barre_contact" id="i_b_c_4">Ajouter un
						contact</div>
						<form class="gestion-accueil" method="POST"
					action="ajoutercontact" enctype="multipart/form-data" >

			

				<div class="item-contact">

						<br />
						<div class="blocl" id="nom_contact">Nom:</div>
						<input class="bloc" name="nomcontact" type="text"
							value="" id="get_nom_contact">
						
						<br />
						<br />
						
						<div class="blocl">Prenom:</div>
						<input class="bloc" name="prenomcontact" type="text"
							value="" >
						
						<br />
						<br />

						<div id="tel_contact" class="blocl">Numero de téléphone:</div>
						<input name="telephonecontact" type="text" value=""
							id="get_tel_contact">
						
						<br />
						<br />

						<div id="mail_contact" class="blocl">Email:</div>
						<input name="emailcontact" type="text"
							value="" id="get_mail_contact">
						
						
						<br />
						<br />

						<div id="photo_contact" class="blocl">Photo:</div>
						<input class="fileupload" type="file" size="25" name="photocontact"
							id="get_photo_contact">
						
						<br />
						<br />

						<div id="desc_contact" class="blocl">Description:</div>
						<input class="large" type="text" name="descriptioncontact"
							id="get_desc_contact"
							value="">
							
							
						<button name="modif-cont-desc" type="submit"
							value="sub_desc_contact">Ajouter un contact</button>
						<br />
						<br />
						
						
				</form>


				
				</div>

			</div>










	</span> 
	
	

		
	 <script src="js/jquery-1.11.3.min.js"></script> <!-- Include js plugin -->
		<script src="owl-carousel/owl.carousel.js"
			type="application/javascript"></script> <script>
				$(document).ready(function() {
					$("#owl-demo").owlCarousel({

						autoPlay : 3000,
						navigation : true,
						slideSpeed : 300,
						paginationSpeed : 400,
						singleItem : true

					// "singleItem:true" is a shortcut for:
					// items : 1, 
					// itemsDesktop : false,
					// itemsDesktopSmall : false,
					// itemsTablet: false,
					// itemsMobile : false

					});
				});
			</script>
</body>

</html>