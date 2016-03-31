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

import hei.iti.projet.managers.ContactManager;
import hei.iti.projet.managers.PhotoManager;
import hei.iti.projet.managers.VillageVitrineManager;

@WebServlet("/ajoutercontact")
@MultipartConfig
public class AjouterContactServlet extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String nomcontact = request.getParameter("nomcontact");
		System.out.println("Le nom est "+request.getParameter("nomcontact"));
		String prenomcontact = request.getParameter("prenomcontact");
		System.out.println("Le prenomcontact est "+request.getParameter("prenomcontact"));
		String telephonecontact = request.getParameter("telephonecontact");
		System.out.println("Le telephonecontact est "+request.getParameter("telephonecontact"));
		String descriptioncontact = request.getParameter("descriptioncontact");
		System.out.println("Le descriptioncontact est "+request.getParameter("descriptioncontact"));
		String ancienemailcontact = request.getParameter("ancienemailcontact");
		System.out.println("L'ancienemailcontact est "+request.getParameter("ancienemailcontact"));
		String emailcontact = request.getParameter("emailcontact");
		System.out.println("Le emailcontact est "+request.getParameter("emailcontact"));
		

		Part fichierForm = request.getPart("photocontact");
		System.out.println("Le fichier form est "+fichierForm);
		
		String  chemin = PhotoManager.getInstance().nomPhoto(fichierForm.getContentType());
		PhotoManager.getInstance().enregistrerPhoto(fichierForm, chemin);
		PhotoManager.getInstance().ajouterPhoto(chemin, "Faire la description", nomcontact);
		ContactManager.getInstance().modifierContact(ancienemailcontact, "nom", nomcontact);
		ContactManager.getInstance().modifierContact(ancienemailcontact, "prenom", prenomcontact);
		ContactManager.getInstance().modifierContact(ancienemailcontact, "email", emailcontact);
		ContactManager.getInstance().modifierContact(ancienemailcontact, "description", descriptioncontact);
		ContactManager.getInstance().ajouterContact(emailcontact, nomcontact, prenomcontact, telephonecontact, descriptioncontact, "En attente");

		
		response.sendRedirect("modification");
		
	}
		
		
		
	
	
	
}

