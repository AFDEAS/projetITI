package hei.iti.projet.managers;

import java.util.List;

import hei.iti.projet.dao.ProjetDao;
import hei.iti.projet.dao.impl.ProjetDaoImpl;
import hei.iti.projet.model.Projet;

public class ProjetManager {

private static ProjetManager instance;
	
	private ProjetDao projetdao = new ProjetDaoImpl();
	
	private ProjetManager(){
		
	};
	
	public static ProjetManager getInstance() {
		if (instance == null) {
			instance = new ProjetManager();
		}
		return instance;
	}	
	
	public List<Projet> listerProjets(){
		
	return projetdao.listerProjets();	
		
	}
	
	
	public void supprimerProjet(String nom){
		
	projetdao.supprimerProjet(nom);	
		
	return; 	
	}
	
	
	public void ajouterProjet(String nom){
		
	projetdao.ajouterProjet(nom);	
		
	return;	
	}
	
	
	
}

