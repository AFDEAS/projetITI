package hei.iti.projet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hei.iti.projet.managers.PhotoManager;
import hei.iti.projet.managers.ProjetManager;
import hei.iti.projet.model.Photo;
import hei.iti.projet.model.Projet;


@WebServlet("/projets")
public class ProjetServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    public ProjetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Projet> listeprojet = ProjetManager.getInstance().listerProjets();
		request.getSession().setAttribute("listProjet", listeprojet);
		
		List<Photo> listephoto = PhotoManager.getInstance().recupererPhoto(listeprojet.get(0).getNom());
		request.getSession().setAttribute("listPhoto", listephoto);
		
		
		RequestDispatcher view	= request.getRequestDispatcher(	"jsp/projet.jsp");
		view.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
