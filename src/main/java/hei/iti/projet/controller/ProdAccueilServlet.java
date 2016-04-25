package hei.iti.projet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import hei.iti.projet.managers.ProducteurManager;
//import hei.iti.projet.model.Producteur;




@WebServlet("/accueilproducteur")
public class ProdAccueilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ProdAccueilServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
/*		Producteur producteur = ProducteurrManager.getInstance().RecupererProducteur((String) request.getSession().getAttribute("producteurConnecte"));
		System.out.println(producteur);
		System.out.println(request.getSession().getAttribute("producteurConnecte"));
		
		
		
		request.getSession().setAttribute("producteur", producteur);
*/		
		RequestDispatcher view	= request.getRequestDispatcher(	"jsp/prod_accueil.jsp");
		view.forward(request,response);
	
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
