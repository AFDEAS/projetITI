package hei.iti.projet.managers;

import hei.iti.projet.dao.PageDao;
import hei.iti.projet.dao.impl.PageDaoImpl;

public class PageManager {

private static  PageManager instance;
	
	private PageDao pagedao = new PageDaoImpl();
	
	private PageManager(){
		
	};
	
	public static PageManager getInstance() {
		if (instance == null) {
			instance = new PageManager();
		}
		return instance;
	}	
	
	
	
	public String recupererTexte(String nom){
		
		
		
		return pagedao.recupererTexte(nom);
	}
	
	public boolean modifierTexte(String nom, String nvtexte){
		
		
		return pagedao.modifierTexte(nom, nvtexte);
	}
	
}
