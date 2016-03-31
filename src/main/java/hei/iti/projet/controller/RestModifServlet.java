package hei.iti.projet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hei.iti.projet.managers.RestaurateurManager;
import hei.iti.projet.model.Restaurateur;

@WebServlet("/modificationrestaurateur")
public class RestModifServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		Restaurateur restaurateur = RestaurateurManager.getInstance().RecupererRestaurateur((String) request.getSession().getAttribute("restaurateurConnecte"));
		System.out.println(restaurateur);
		System.out.println(request.getSession().getAttribute("restaurateurConnecte"));
		
		
		
		request.getSession().setAttribute("restaurateur", restaurateur);
		RequestDispatcher view	= request.getRequestDispatcher(	"rest_modif.jsp");
		view.forward(request,response);
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String emailrestaurateur = (String) request.getSession().getAttribute("restaurateurConnecte");
		String nomrestaurateur = request.getParameter("nomrestaurateur");
		System.out.println("Le nomrestaurateur est "+request.getParameter("nomrestaurateur"));
		String prenomrestaurateur = request.getParameter("prenomrestaurateur");
		System.out.println("Le prenomrestaurateur est "+request.getParameter("prenomrestaurateur"));
		String adresserestaurateur = request.getParameter("adresserestaurateur");
		System.out.println("Le adresserestaurateur est "+request.getParameter("adresserestaurateur"));
		String mdprestaurateur = request.getParameter("mdprestaurateur");
		System.out.println("Le mdprestaurateur est "+request.getParameter("mdprestaurateur"));
		
		
		RestaurateurManager.getInstance().ModifierRestaurateur(emailrestaurateur, "nom", nomrestaurateur);
		RestaurateurManager.getInstance().ModifierRestaurateur(emailrestaurateur, "prenom", prenomrestaurateur);
		RestaurateurManager.getInstance().ModifierRestaurateur(emailrestaurateur, "adresse", adresserestaurateur);
		
		if(mdprestaurateur!=null){
			
		
		RestaurateurManager.getInstance().ModifierRestaurateur(emailrestaurateur, "mdp", mdprestaurateur);
		}
		
		
		
		
		response.sendRedirect("accueilrestaurateur");
	}

}
