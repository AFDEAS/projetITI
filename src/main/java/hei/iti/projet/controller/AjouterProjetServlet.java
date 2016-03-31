package hei.iti.projet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hei.iti.projet.managers.ProjetManager;

@WebServlet("/ajouterprojet")
public class AjouterProjetServlet extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String nomprojet = request.getParameter("nomprojet");
		
		ProjetManager.getInstance().ajouterProjet(nomprojet);
		
		
		
		response.sendRedirect("modification");
		
	}
		
		
		
	
	
	
}
