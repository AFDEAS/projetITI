package hei.iti.projet.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hei.iti.projet.managers.ContactManager;
import hei.iti.projet.managers.PhotoManager;

@WebServlet("/suppcontact")
public class SupprimerContactServlet extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String nomcontact = request.getParameter("nomcontact");
		
		System.out.println("Dans supprimer contact");
		
		ContactManager.getInstance().supprimerContact(nomcontact);
	
			
			System.out.println("Changement de photo");
			
			String ancienchemin =null;
			
			if(PhotoManager.getInstance().recupererPhoto(request.getParameter("nomcontact")).size()!=0){
			ancienchemin = PhotoManager.getInstance().recupererPhoto(request.getParameter("nomcontact")).get(0).getChemin();
			}
			PhotoManager.getInstance().supprimerPhoto(ancienchemin);
			new File("C:/Users/barth_000/Documents/HEI/ITI/Projet 100h/ProjetITI/src/main/webapp/img/"+ancienchemin).delete();
		
		
		
		response.sendRedirect("modification");
		
	}
		
		
		
	
	
	
}
