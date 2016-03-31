package hei.iti.projet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hei.iti.projet.managers.ProduitManager;
import hei.iti.projet.model.Produit;


@WebServlet("/catalogue_restaurateur")
public class RestCatalogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RestCatalogServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<Produit> listeproduit = ProduitManager.getInstance().listerProduits();
		request.getSession().setAttribute("listeproduit", listeproduit);
		
		
		RequestDispatcher view	= request.getRequestDispatcher(	"rest_catalogue.jsp");
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
