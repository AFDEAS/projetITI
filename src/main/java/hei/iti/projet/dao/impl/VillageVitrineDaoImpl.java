package hei.iti.projet.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hei.iti.projet.dao.VillageVitrineDao;
import hei.iti.projet.model.VillageVitrine;

public class VillageVitrineDaoImpl implements VillageVitrineDao{

	@Override
	public void ajouterVillage(String nom, String description, float coordonneex, float coordonneey) {
		// TODO Auto-generated method stub
		
		System.out.println("Dans 'ajouterVillage (Vitrine)'");
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
		
		// TODO Auto-generated method stub
		System.out.println("Connexion DB ok");
		
		PreparedStatement stmt;
		
		stmt = connection.prepareStatement("INSERT INTO `eauquigerme`.`village_vitrine` (`description`, `nom`, `coordonneesx`, `coordonneesy`) VALUES (?, ?, ?, ?)");
		
		stmt.setString(1, description);
		stmt.setString(2, nom);
		stmt.setFloat(3, coordonneex);
		stmt.setFloat(4, coordonneey);
		

		stmt.executeUpdate();
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
	}

	@Override
	public List<VillageVitrine> recupererVillages() {
		// TODO Auto-generated method stub
		
		List<VillageVitrine> listvillage = new ArrayList<VillageVitrine>();
		
		System.out.println("Dans 'recupererVillages (Vitrine)'");
		
		try {
			
		Connection connection = DataSourceProvider.getDataSource().getConnection();
		PreparedStatement stmt = connection.prepareStatement("SELECT * FROM `village_vitrine`;");
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			
		listvillage.add(new VillageVitrine(rs.getString("nom"), rs.getString("description"), rs.getFloat("coordonneesx"), rs.getFloat("coordonneesy")));
			
			
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		return listvillage;
	}

	@Override
	public void modifierVillage(String Param, String nom, String nvParam) {
		// TODO Auto-generated method stub
		System.out.println("Dans 'modifierVillage (Vitrine)'");
		
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			System.out.println("Bdd ok");		
			
			
		PreparedStatement stmt = connection.prepareStatement("UPDATE `eauquigerme`.`village_vitrine` SET `"+Param+"` = '"+nvParam+"' WHERE `village_vitrine`.`nom` = '"+nom+"';");
		stmt.executeUpdate();
		
			stmt.close();
			connection.close();
			
	
			
		} catch (SQLException e) {
			e.printStackTrace();

		}
		
		
		
	}

	@Override
	public void modifierVillage(String Param, String nom, float nvParam) {
		// TODO Auto-generated method stub
	System.out.println("Dans 'modifierVillage (Vitrine)'");
		
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			System.out.println("Bdd ok");		
			
			
		PreparedStatement stmt = connection.prepareStatement("UPDATE `eauquigerme`.`village_vitrine` SET `"+Param+"` = '"+nvParam+"' WHERE `village_vitrine`.`nom` = '"+nom+"';");
		stmt.executeUpdate();
		
			stmt.close();
			connection.close();
			
	
			
		} catch (SQLException e) {
			e.printStackTrace();

		}	
		
		
		
		
	}

	@Override
	public void supprimerVillage(String nom) {
		// TODO Auto-generated method stub
		
		System.out.println("Dans 'supprimerVillage (vitrine)'");
		
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			System.out.println("Bdd ok");		
			
			
		PreparedStatement stmt = connection.prepareStatement("DELETE FROM `eauquigerme`.`village_vitrine` WHERE `village_vitrine`.`nom` = '"+nom+"';");
		stmt.executeUpdate();
		
			stmt.close();
			connection.close();
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
		
		
		
		
	}

}
