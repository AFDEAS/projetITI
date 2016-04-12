package hei.iti.projet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hei.iti.projet.managers.ContactManager;
import hei.iti.projet.model.Contact;


@WebServlet("/contact")
public class ContactServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    public ContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view	= request.getRequestDispatcher(	"jsp/contact.jsp");
		
		List<Contact> listecontact = ContactManager.getInstance().listerContacts();
		request.getSession().setAttribute("listecontact", listecontact);
		
		
		view.forward(request,response);
	}




}
