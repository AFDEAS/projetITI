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
import hei.iti.projet.model.Photo;


@WebServlet("/apropos")
public class ProposServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    public ProposServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.getSession().setAttribute("textePropos", PageManager.getInstance().recupererTexte("propos"));
		List<Photo> listephoto = PhotoManager.getInstance().recupererPhoto("propos");
		
		request.getSession().setAttribute("photoPropos", listephoto.get(0));
		
		RequestDispatcher view	= request.getRequestDispatcher("propos.jsp");
		view.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
