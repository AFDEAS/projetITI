package hei.iti.projet.dao;

import java.util.List;

public interface ContactDao {

	
	
public void ajouterContact(String email, String nom, String prenom, String telephone, String description, String poste);

public void supprimerContact(String email);

public void modifierContact(String email, String Param, String nvParam);

public List listerContacts();	
	
}
