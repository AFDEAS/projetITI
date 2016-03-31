package hei.iti.projet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Path;

import hei.iti.projet.managers.ContactManager;
import hei.iti.projet.managers.PageManager;
import hei.iti.projet.managers.PhotoManager;
import hei.iti.projet.managers.ProjetManager;
import hei.iti.projet.managers.VillageVitrineManager;
import hei.iti.projet.model.Contact;
import hei.iti.projet.model.Photo;
import hei.iti.projet.model.Projet;
import hei.iti.projet.model.VillageVitrine;


@WebServlet("/modification")
public class ModifServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ModifServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.getSession().setAttribute("texteAccueil", PageManager.getInstance().recupererTexte("accueil"));
		request.getSession().setAttribute("textePropos", PageManager.getInstance().recupererTexte("propos"));
		List<Photo> listephoto = PhotoManager.getInstance().recupererPhoto("accueil");
		request.getSession().setAttribute("listPhoto", listephoto);
		List<Photo> listephotopropos = PhotoManager.getInstance().recupererPhoto("propos");
		List<Contact> listecontact = ContactManager.getInstance().listerContacts();
		request.getSession().setAttribute("listecontact", listecontact);
		List<Projet> listeprojet = ProjetManager.getInstance().listerProjets();
		request.getSession().setAttribute("listProjet", listeprojet);
		
		for(int i=0; i<listeprojet.size(); i++){
			
			request.getSession().setAttribute("listPhotoProjet"+i, PhotoManager.getInstance().recupererPhoto(listeprojet.get(i).getNom()));
			System.out.println(i);
		}
		
		
		List<VillageVitrine> listevillage = VillageVitrineManager.getInstance().recupererVillages();
		request.getSession().setAttribute("listVillage", listevillage);
		

		
		
		
		
		
		
		
		
		
		request.getSession().setAttribute("photoPropos", listephotopropos.get(0));
		
		
		
		
		RequestDispatcher view	= request.getRequestDispatcher(	"modcontenu.jsp");
		view.forward(request,response);
	
	
	
	}

	
}
