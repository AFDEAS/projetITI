package hei.iti.projet.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hei.iti.projet.dao.ProjetDao;
import hei.iti.projet.model.Projet;
import hei.iti.projet.model.VillageVitrine;

public class ProjetDaoImpl implements ProjetDao {

	@Override
	public void ajouterProjet(String nom) {
		// TODO Auto-generated method stub
	
		System.out.println("Dans 'ajouterProjet'");
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
		
		// TODO Auto-generated method stub
		System.out.println("Connexion DB ok");
		
		PreparedStatement stmt;
		
		stmt = connection.prepareStatement("INSERT INTO `eauquigerme`.`projet` (`nom_projet`) VALUES (?)");
		
		stmt.setString(1, nom);

		stmt.executeUpdate();
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		
	}

	@Override
	public List<Projet> listerProjets() {
		// TODO Auto-generated method stub
		
		List<Projet> listProjet = new ArrayList<Projet>();
		
		System.out.println("Dans 'listerProjets'");
		
		try {
			
		Connection connection = DataSourceProvider.getDataSource().getConnection();
		PreparedStatement stmt = connection.prepareStatement("SELECT * FROM `projet`;");
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			
		listProjet.add(new Projet(rs.getString("nom_projet")));
			
			
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		return listProjet;
	}

	@Override
	public void modifierProjet(String ancienNom, String nvNom) {
		// TODO Auto-generated method stub
		
		System.out.println("Dans 'modifierProjet'");
		
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			System.out.println("Bdd ok");		
			
			
		PreparedStatement stmt = connection.prepareStatement("UPDATE `eauquigerme`.`projet` SET `nom_projet` = '"+nvNom+"' WHERE `projet`.`nom_projet` =  '"+ancienNom+"';");
		stmt.executeUpdate();
		
			stmt.close();
			connection.close();
			
	
			
		} catch (SQLException e) {
			e.printStackTrace();

		}	
		
		
		
	}

	@Override
	public void supprimerProjet(String nom) {
		// TODO Auto-generated method stub
		System.out.println("Dans 'supprimerProjet'");
		
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			System.out.println("Bdd ok");		
			
			
		PreparedStatement stmt = connection.prepareStatement("DELETE FROM `eauquigerme`.`projet` WHERE `projet`.`nom_projet` = '"+nom+"';");
		stmt.executeUpdate();
		
			stmt.close();
			connection.close();
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
		
		
	}
	

}
