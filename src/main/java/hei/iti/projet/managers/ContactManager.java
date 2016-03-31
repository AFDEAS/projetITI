package hei.iti.projet.managers;

import java.util.List;

import hei.iti.projet.dao.ContactDao;
import hei.iti.projet.dao.impl.ContactDaoImpl;

public class ContactManager {

private static  ContactManager instance;
	
	private ContactDao contactdao = new ContactDaoImpl();
	
	private ContactManager(){
		
	};
	
	public static ContactManager getInstance() {
		if (instance == null) {
			instance = new ContactManager();
		}
		return instance;
	}	
	
public List listerContacts(){
		
	return contactdao.listerContacts();
		
	}

public void modifierContact(String email, String Param, String nvParam){
	
	contactdao.modifierContact(email, Param, nvParam);
	
	
	return;
}
	


public void supprimerContact(String email){
	
	
	contactdao.supprimerContact(email);
	
}


public void ajouterContact(String email, String nom, String prenom, String telephone, String description, String poste){
	
	contactdao.ajouterContact(email, nom, prenom, telephone, description, poste);
}
	
}
