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



@WebServlet("/ajouterphoto")
@MultipartConfig
public class AjouterPhotoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		System.out.println("Dans le post ajouter photo");
		
		Part fichierForm = request.getPart("photoaajouter");
		
		String description = request.getParameter("descriptionphoto");
		
		String ancienchemin = request.getParameter("cheminphoto");
		
		String titre = request.getParameter("titrephoto");
		
		
		
		if(fichierForm!=null&&ancienchemin!=null){
			
			String  chemin = PhotoManager.getInstance().nomPhoto(fichierForm.getContentType());
			PhotoManager.getInstance().enregistrerPhoto(fichierForm, chemin);
			PhotoManager.getInstance().ajouterPhoto(chemin, description, titre);
			PhotoManager.getInstance().supprimerPhoto(ancienchemin);
			new File("C:/Users/barth_000/Documents/HEI/ITI/Projet 100h/ProjetITI/src/main/webapp/img/"+ancienchemin).delete();
			
		}
		
		if(fichierForm==null&&ancienchemin!=null){
			
		
		PhotoManager.getInstance().supprimerPhoto(ancienchemin);
		new File("C:/Users/barth_000/Documents/HEI/ITI/Projet 100h/ProjetITI/src/main/webapp/img/"+ancienchemin).delete();	
			
		}
		
		if(fichierForm!=null&&ancienchemin==null){
			
			String  chemin = PhotoManager.getInstance().nomPhoto(fichierForm.getContentType());
			PhotoManager.getInstance().enregistrerPhoto(fichierForm, chemin);
			PhotoManager.getInstance().ajouterPhoto(chemin, description, titre);
			
			}
	
		
		
		
		
		
		
		
		
		
		
		response.sendRedirect("modification");
		
		
	}

}
