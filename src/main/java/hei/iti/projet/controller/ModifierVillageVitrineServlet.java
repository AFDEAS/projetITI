package hei.iti.projet.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import hei.iti.projet.managers.PhotoManager;
import hei.iti.projet.managers.VillageVitrineManager;

@WebServlet("/modifiervillagevitrine")
@MultipartConfig
public class ModifierVillageVitrineServlet extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String nomvillage = request.getParameter("nomvillage");
		System.out.println("Le nom est "+request.getParameter("nomvillage"));
		String longvillage = request.getParameter("longvillage");
		System.out.println("Le longvillage est "+request.getParameter("longvillage"));
		String latvillage = request.getParameter("latvillage");
		System.out.println("Le latvillage est "+request.getParameter("latvillage"));
		String descriptionvillage = request.getParameter("descriptionvillage");
		System.out.println("Le descriptionvillage est "+request.getParameter("descriptionvillage"));
		String description = request.getParameter("descriptionphoto");
		String anciennomvillage = request.getParameter("anciennomvillage");
		System.out.println("L'ancien nom est "+request.getParameter("anciennomvillage"));
		System.out.println("La description est  "+request.getParameter("descriptionvillage"));
		String ancienchemin = PhotoManager.getInstance().recupererPhoto(request.getParameter("anciennomvillage")).get(0).getChemin();
		Part fichierForm = request.getPart("photovillage");
		System.out.println("Le fichier form est "+fichierForm);
		
		
		if(fichierForm.getSize()!=0){
			
			System.out.println("Changement de photo");
			
			String  chemin = PhotoManager.getInstance().nomPhoto(fichierForm.getContentType());
			PhotoManager.getInstance().enregistrerPhoto(fichierForm, chemin);
			PhotoManager.getInstance().ajouterPhoto(chemin, description, anciennomvillage);
			PhotoManager.getInstance().supprimerPhoto(ancienchemin);
			new File("C:/Users/barth_000/Documents/HEI/ITI/Projet 100h/ProjetITI/src/main/webapp/img/"+ancienchemin).delete();
		}
		
	//	VillageVitrineManager.getInstance().modifierVillage("nom", anciennomvillage, nomvillage);
		VillageVitrineManager.getInstance().modifierVillage("description", anciennomvillage, descriptionvillage);
		VillageVitrineManager.getInstance().modifierVillage("coordonneesx", anciennomvillage, latvillage);
		VillageVitrineManager.getInstance().modifierVillage("coordonneesy", anciennomvillage, longvillage);
		
		
		
		response.sendRedirect("modification");
		
	}
		
		
		
	
	
	
}
