package hei.iti.projet.dao.impl;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import hei.iti.projet.dao.RestaurateurDao;
import hei.iti.projet.model.Restaurateur;
import hei.iti.projet.utils.MotDePasseUtils;

public class RestaurateurDaoImpl implements RestaurateurDao{

	@Override
	public void ajouterRestaurateur(String email, String mdp, String nom, String prenom, String adresse, int solde) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Dans 'ajouterRestaurateur'");
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
		
		// TODO Auto-generated method stub
		System.out.println("Connexion DB ok");
		
		PreparedStatement stmt;
		
		stmt = connection.prepareStatement("INSERT INTO `eauquigerme`.`restaurateur` (`email`, `mdp`, `nom`, `prenom`, `adresse`, `solde`) VALUES (?, ?, ? ,? , ?, ?)");
		
		stmt.setString(1, email);
		
		try {
			stmt.setString(2,hei.iti.projet.utils.MotDePasseUtils.genererMotDePasse(mdp)	);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		stmt.setString(3, nom);
		stmt.setString(4, prenom);
		stmt.setString(5, adresse);
		stmt.setInt(6, solde);
		

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
		results = stmt.executeQuery("SELECT mdp FROM restaurateur WHERE email='"+email+"'");

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

	@Override
	public Restaurateur RecupererRestaurateur(String email) {
		// TODO Auto-generated method stub
		
System.out.println("Dans 'RecupererRestaurateur '");
		
		try {
			
		Connection connection = DataSourceProvider.getDataSource().getConnection();
		PreparedStatement stmt = connection.prepareStatement("SELECT * FROM `restaurateur` WHERE `restaurateur`.`email` = '"+email+"';");
		ResultSet rs = stmt.executeQuery();
		
		Restaurateur restau = null;
		
		while (rs.next()) {
			
		restau = new Restaurateur(rs.getString("email"),rs.getString("mdp"), rs.getString("nom"), rs.getString("prenom"), rs.getString("adresse"), rs.getInt("solde"));
			
		
		}
		
		return restau;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		return null;
	}

	@Override
	public void ModifierRestaurateur(String email, String Param, String NvParam) {
		// TODO Auto-generated method stub
		
		
System.out.println("Dans 'ModifierRestaurateur'");
		
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			System.out.println("Bdd ok");		
			
			PreparedStatement stmt = null;
			
			
		if(Param.equals("mdp")){	
			
		try {
			stmt = connection.prepareStatement("UPDATE `eauquigerme`.`restaurateur` SET `"+Param+"` = '"+MotDePasseUtils.genererMotDePasse(NvParam)+"' WHERE `restaurateur`.`email` = '"+email+"';");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
		else{
			
		stmt = connection.prepareStatement("UPDATE `eauquigerme`.`restaurateur` SET `"+Param+"` = '"+NvParam+"' WHERE `restaurateur`.`email` = '"+email+"';");
			
		}
		
		stmt.executeUpdate();
		
			stmt.close();
			connection.close();
			
	
			
		} catch (SQLException e) {
			e.printStackTrace();

		}
		
		
		
		
		
		
	}

	
	
	
	
}
