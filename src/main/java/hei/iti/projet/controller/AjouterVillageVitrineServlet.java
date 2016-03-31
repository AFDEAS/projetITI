package hei.iti.projet.controller;

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

@WebServlet("/ajoutervillagevitrine")
@MultipartConfig
public class AjouterVillageVitrineServlet extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String nomvillage = request.getParameter("nomvillage");
		System.out.println("Le nom est "+request.getParameter("nomvillage"));
		float longvillage = Float.parseFloat(request.getParameter("longvillage"));
		System.out.println("Le longvillage est "+request.getParameter("longvillage"));
		float latvillage = Float.parseFloat(request.getParameter("latvillage"));
		System.out.println("Le latvillage est "+request.getParameter("latvillage"));
		String descriptionvillage = request.getParameter("descriptionvillage");
		System.out.println("Le descriptionvillage est "+request.getParameter("descriptionvillage"));
		System.out.println("L'ancien nom est "+request.getParameter("anciennomvillage"));
		System.out.println("La description est  "+request.getParameter("descriptionvillage"));
		Part fichierForm = request.getPart("photovillage");
		System.out.println("Le fichier form est "+fichierForm);
		
		
		
			
		
			
		String  chemin = PhotoManager.getInstance().nomPhoto(fichierForm.getContentType());
		PhotoManager.getInstance().enregistrerPhoto(fichierForm, chemin);
		PhotoManager.getInstance().ajouterPhoto(chemin, "Le photo du village "+nomvillage, nomvillage);
		
		
	//	VillageVitrineManager.getInstance().modifierVillage("nom", anciennomvillage, nomvillage);
		VillageVitrineManager.getInstance().ajouterVillage(nomvillage, descriptionvillage, longvillage, latvillage);
		
		response.sendRedirect("modification");
		
	}
		
		
		
	
	
	
}

