package hei.iti.projet.managers;

import java.util.List;

import hei.iti.projet.dao.ProduitDao;
import hei.iti.projet.dao.impl.ProduitDaoImpl;
import hei.iti.projet.model.Produit;

public class ProduitManager {

private static  ProduitManager instance;
	
	private ProduitDao produitdao = new ProduitDaoImpl();
	
	private ProduitManager(){
		
	};
	
	public static ProduitManager getInstance() {
		if (instance == null) {
			instance = new ProduitManager();
		}
		return instance;
	}
	
	public  List<Produit> listerProduits(){
		
		return produitdao.listerProduits();
		
	}
	
	
	
	
	
	
	public  List<Produit> listerProduits(String categorie){
		
		return produitdao.listerProduits(categorie);
		
		
	}
	
	
	
	public List<String> listerCategorie(){
		
		return produitdao.listerCategorie();
	}
	
	
	public List<Produit> rechercherProduits(String rech){
		
		
		return produitdao.rechercherProduits(rech);
	}
	
	
	
	
	
	
}