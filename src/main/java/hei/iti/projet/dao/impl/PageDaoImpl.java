package hei.iti.projet.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import hei.iti.projet.dao.PageDao;

public class PageDaoImpl implements PageDao{

	@Override
	public boolean modifierTexte(String nom, String texte) {
		// TODO Auto-generated method stub
		
		

		System.out.println("Dans 'modifierTexte' (page)");
		
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			System.out.println("Bdd ok");		
			
			
		PreparedStatement stmt = connection.prepareStatement("UPDATE `eauquigerme`.`page` SET `texte` = '"+texte+"' WHERE `page`.`nom` =  '"+nom+"';");
		stmt.executeUpdate();
		
			stmt.close();
			connection.close();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();

		}	
		
		return false;
	}

	@Override
	public String recupererTexte(String nom) {
		// TODO Auto-generated method stub
		
		String texte = null; 
		
		System.out.println("Dans 'recupererTexte' (page)");
		
		try {
			
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM `page` WHERE `page`.`nom` =  '"+nom+"' ;");
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				
			texte = rs.getString("texte");
				
				
			}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		
		
		
		return texte;
	}

}
