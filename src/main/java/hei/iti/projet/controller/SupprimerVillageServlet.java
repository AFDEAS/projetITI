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

@WebServlet("/supprimervillagevitrine")
public class SupprimerVillageServlet extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		String anciennomvillage = request.getParameter("anciennomvillage");
		System.out.println("L'ancien nom est "+request.getParameter("anciennomvillage"));;
		String ancienchemin = PhotoManager.getInstance().recupererPhoto(request.getParameter("anciennomvillage")).get(0).getChemin();

		
	    VillageVitrineManager.getInstance().supprimerVillage(anciennomvillage);
		PhotoManager.getInstance().supprimerPhoto(ancienchemin);
		new File("C:/Users/barth_000/Documents/HEI/ITI/Projet 100h/ProjetITI/src/main/webapp/img/"+ancienchemin).delete();
	
		
		
		response.sendRedirect("modification");
		
	}
		
		
		
	
	
	
}
