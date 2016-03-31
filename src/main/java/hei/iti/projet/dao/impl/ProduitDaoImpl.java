package hei.iti.projet.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hei.iti.projet.dao.ProduitDao;
import hei.iti.projet.model.Photo;
import hei.iti.projet.model.Produit;

public class ProduitDaoImpl implements ProduitDao{

	@Override
	public List<Produit> listerProduits() {
		// TODO Auto-generated method stub
		
		List<Produit> listproduit = new ArrayList<Produit>();
		
		System.out.println("Dans 'listerProduits '");
		
		try {
			
		Connection connection = DataSourceProvider.getDataSource().getConnection();
		PreparedStatement stmt = connection.prepareStatement("SELECT * FROM `produit`");
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			
		listproduit.add(new Produit(rs.getInt("id"), rs.getString("nom"),  rs.getString("description"), rs.getString("periode_de_semis"),  rs.getInt("duree_maturation"), rs.getString("arrosage"), rs.getString("rendement"),  rs.getInt("prix"),  rs.getInt("quantite_dispo"), rs.getString("categorie"), rs.getString("saison")));
			
			
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		return listproduit;
	}

	
	
	
	
	
	
	@Override
	public List<Produit> listerProduits(String categorie) {
		// TODO Auto-generated method stub
		List<Produit> listproduit = new ArrayList<Produit>();
		
		System.out.println("Dans 'listerProduits avec categorie '");
		
		try {
			
		Connection connection = DataSourceProvider.getDataSource().getConnection();
		PreparedStatement stmt = connection.prepareStatement("SELECT * FROM `produit` WHERE `produit`.`categorie`='"+categorie+"'");
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			
		listproduit.add(new Produit(rs.getInt("id"), rs.getString("nom"),  rs.getString("description"), rs.getString("periode_de_semis"),  rs.getInt("duree_maturation"), rs.getString("arrosage"), rs.getString("rendement"),  rs.getInt("prix"),  rs.getInt("quantite_dispo"), rs.getString("categorie"), rs.getString("saison")));
			
			
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		return listproduit;
	}







	@Override
	public List<String> listerCategorie() {
		// TODO Auto-generated method stub
		
		List<String> listcategorie = new ArrayList<String>();
		boolean unique = true;
		
		System.out.println("Dans 'listerCategorie '");
		
		try {
			
		Connection connection = DataSourceProvider.getDataSource().getConnection();
		PreparedStatement stmt = connection.prepareStatement("SELECT categorie FROM `produit`");
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			
			unique = true;
			
			for(int i=0; i<listcategorie.size(); i++){
				
				if(rs.getString("categorie").equals(listcategorie.get(i))){
					
					unique =false;
					
				}
				
			}
			
			if(unique){
			listcategorie.add(rs.getString("categorie"));
			
			}
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		return listcategorie;
	}







	@Override
	public List<Produit> rechercherProduits(String rech) {
		
		
		List<Produit> listproduit = new ArrayList<Produit>();
		
		System.out.println("Dans 'rechercherProduits'");
		
		try {
			
		Connection connection = DataSourceProvider.getDataSource().getConnection();
		PreparedStatement stmt = connection.prepareStatement("SELECT * FROM `produit` WHERE `nom` LIKE '%"+rech+"%'");
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			
		listproduit.add(new Produit(rs.getInt("id"), rs.getString("nom"),  rs.getString("description"), rs.getString("periode_de_semis"),  rs.getInt("duree_maturation"), rs.getString("arrosage"), rs.getString("rendement"),  rs.getInt("prix"),  rs.getInt("quantite_dispo"), rs.getString("categorie"), rs.getString("saison")));
			
			
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		return listproduit;
	}


}
