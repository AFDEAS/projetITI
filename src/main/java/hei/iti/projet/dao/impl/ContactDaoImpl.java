package hei.iti.projet.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hei.iti.projet.dao.ContactDao;
import hei.iti.projet.model.Contact;
import hei.iti.projet.model.VillageVitrine;

public class ContactDaoImpl implements ContactDao{
	
	
	

	@Override
	public void ajouterContact(String email, String nom, String prenom, String telephone, String description,
			String poste) {
		// TODO Auto-generated method stub
		System.out.println("Dans 'ajouterContact'");
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
		
		// TODO Auto-generated method stub
		System.out.println("Connexion DB ok");
		
		PreparedStatement stmt;
		
		stmt = connection.prepareStatement("INSERT INTO `eauquigerme`.`contact` (`email`, `nom`, `prenom`, `telephone`, `description`, `poste`) VALUES (?, ?, ?, ?, ?, ?)");
		
		stmt.setString(1, email);
		stmt.setString(2, nom);
		stmt.setString(3, prenom);
		stmt.setString(4, telephone);
		stmt.setString(5, description);
		stmt.setString(6, poste);
		
		
		
		stmt.executeUpdate();
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
	}

	@Override
	public void supprimerContact(String email) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Dans 'supprimerContact'");
		
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			System.out.println("Bdd ok");		
			
			
		PreparedStatement stmt = connection.prepareStatement("DELETE FROM `eauquigerme`.`contact` WHERE `contact`.`email` = '"+email+"';");
		stmt.executeUpdate();
		
			stmt.close();
			connection.close();
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
		
		
		
		
		
	}

	@Override
	public void modifierContact(String email, String Param, String nvParam) {
		// TODO Auto-generated method stub
		
		System.out.println("Dans 'modifierContact'");
		
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			System.out.println("Bdd ok");		
			
			
		PreparedStatement stmt = connection.prepareStatement("UPDATE `eauquigerme`.`contact` SET `"+Param+"` = '"+nvParam+"' WHERE `contact`.`email` = '"+email+"';");
		stmt.executeUpdate();
		
			stmt.close();
			connection.close();
			
	
			
		} catch (SQLException e) {
			e.printStackTrace();

		}
		
		
		
		
	}

	@Override
	public List<Contact> listerContacts() {
		// TODO Auto-generated method stub
		
		List<Contact> listContact = new ArrayList<Contact>();
		
		System.out.println("Dans 'listerContacts'");
		
		try {
			
		Connection connection = DataSourceProvider.getDataSource().getConnection();
		PreparedStatement stmt = connection.prepareStatement("SELECT * FROM `contact`;");
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			
		listContact.add(new Contact(rs.getString("email"), rs.getString("nom"),rs.getString("prenom"), rs.getString("telephone"), rs.getString("description"), rs.getString("poste")));
			
			
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		return listContact;
		
	}

}
