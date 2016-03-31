package hei.iti.projet.dao;

import java.util.List;

import hei.iti.projet.model.Produit;

public interface ProduitDao {

	public  List<Produit> listerProduits();
	
	public  List<Produit> listerProduits(String categorie);
	
	public List<String> listerCategorie();
	
	public List<Produit> rechercherProduits(String rech);
	
}
