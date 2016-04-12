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
import hei.iti.projet.managers.VillageVitrineManager;
import hei.iti.projet.model.VillageVitrine;


@WebServlet("/carte")
public class CarteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    public CarteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view	= request.getRequestDispatcher(	"jsp/map.jsp");
	
		
		List<VillageVitrine> listevillage = VillageVitrineManager.getInstance().recupererVillages();
		request.getSession().setAttribute("listVillage", listevillage);
		
for(int i=0; i<listevillage.size(); i++){
	
			request.getSession().setAttribute("PhotoMap"+i, PhotoManager.getInstance().recupererPhoto(listevillage.get(i).getNom()).get(0));
			System.out.println(i);
		}
		
		
		
		view.forward(request,response);
	}


}
