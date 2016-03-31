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


@WebServlet("/accueilrestaurateur")
public class RestAccServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	
	public RestAccServlet() {
        super();
        // TODO Auto-generated constructor stub
    }



	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		Restaurateur restaurateur = RestaurateurManager.getInstance().RecupererRestaurateur((String) request.getSession().getAttribute("restaurateurConnecte"));
		System.out.println(restaurateur);
		System.out.println(request.getSession().getAttribute("restaurateurConnecte"));
		
		
		
		request.getSession().setAttribute("restaurateur", restaurateur);
		
		RequestDispatcher view	= request.getRequestDispatcher(	"rest_accueil.jsp");
		view.forward(request,response);
	
		
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
