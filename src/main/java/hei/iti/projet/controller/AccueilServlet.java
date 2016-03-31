package hei.iti.projet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hei.iti.projet.managers.PageManager;
import hei.iti.projet.managers.PhotoManager;
import hei.iti.projet.managers.RestaurateurManager;
import hei.iti.projet.managers.WebmasterManager;
import hei.iti.projet.model.Photo;

/**
 * Servlet implementation class AccueilServlet
 */
@WebServlet("/accueil")
public class AccueilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	

    public AccueilServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String messageErreur = (String) request.getSession().getAttribute("messageErreur");
		String utilisateurCo = (String) request.getSession().getAttribute("utilisateurConnecte");
		System.out.println(utilisateurCo);
		System.out.println(messageErreur);
		
		request.getSession().setAttribute("texteAccueil", PageManager.getInstance().recupererTexte("accueil"));
		List<Photo> listephoto = PhotoManager.getInstance().recupererPhoto("accueil");
		request.getSession().setAttribute("listPhoto", listephoto);
		System.out.println(listephoto);
		
		
		
		if (messageErreur != null && !"".equals(messageErreur)) {
			request.setAttribute("messageErreur", messageErreur);
			request.getSession().removeAttribute("messageErreur");
			System.out.println("Coucou");
		}

		RequestDispatcher view	= request.getRequestDispatcher("accueil.jsp");
		view.forward(request,response);
	}

	
	
	
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Stockage de l'utilisateur en session.");
		String identifiant = request.getParameter("login");
		System.out.println(identifiant);
		String mdp = request.getParameter("password");
		System.out.println(mdp);
		
		System.out.println("Debut de tentative.");
		
		if(WebmasterManager.getInstance().seConnecter(identifiant,mdp)){
			
			
			request.getSession().setAttribute("utilisateurConnecte", identifiant);
			System.out.println("ok");
			response.sendRedirect("accueil");}
		else{
		
			if(RestaurateurManager.getInstance().seConnecter(identifiant,mdp)){
				
				
				request.getSession().setAttribute("restaurateurConnecte", identifiant);
				System.out.println("ok");
				response.sendRedirect("accueilrestaurateur");}
			
			else{
			
			request.getSession().setAttribute("messageErreur", "erreur");
			response.sendRedirect("accueil");}
		
		}
		
	
	
		
		
	
		
	}

}
