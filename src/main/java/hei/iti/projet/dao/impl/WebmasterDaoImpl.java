package hei.iti.projet.dao.impl;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import hei.iti.projet.dao.WebmasterDao;


public class WebmasterDaoImpl implements WebmasterDao {

	@Override
	public void ajouterWebmaster(String email, String mdp) {
		// TODO Auto-generated method stub
	
		System.out.println("Dans 'ajouterWebmaster'");
	
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
		
		// TODO Auto-generated method stub
		System.out.println("Connexion DB ok");
		
		PreparedStatement stmt;
		
		stmt = connection.prepareStatement("INSERT INTO `eauquigerme`.`webmaster` (`email`, `mdp`) VALUES (?, ?)");
		
		stmt.setString(1, email);	
		
		try {
			stmt.setString(3,hei.iti.projet.utils.MotDePasseUtils.genererMotDePasse(mdp)	);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		stmt.executeUpdate();
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
			
		
	}

	
	
	
	
	
	
	
	
	
	@Override
	public boolean seConnecter(String email, String motdepasse) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Dans 'seConnecter'");
		String mdp = "";
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
		
		
		// TODO Auto-generated method stub
		Statement stmt = connection.createStatement();
		System.out.println("Connexion DB ok");
		
		ResultSet results;
		results = stmt.executeQuery("SELECT mdp FROM webmaster WHERE email='"+email+"'");

			while (results.next()) {
			mdp = results.getString("mdp");
			}	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(mdp!=""){	
		try {
			if(hei.iti.projet.utils.MotDePasseUtils.validerMotDePasse(motdepasse, mdp)){
				
				System.out.println("Connexion accepte");
				return true;
			}
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		System.out.println("Connexion refuse");
		return false;
		
	}

	
	
	
}
