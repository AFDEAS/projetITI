package hei.iti.projet.dao;

import java.util.List;

public interface ProjetDao {

public void ajouterProjet(String nom);

public List listerProjets();

public void modifierProjet(String ancienNom, String nvNom);

public void supprimerProjet(String nom);
	
	
}
