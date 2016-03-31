package hei.iti.projet.dao.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Part;

import hei.iti.projet.dao.PhotoDao;
import hei.iti.projet.model.Photo;

public class PhotoDaoImpl  implements PhotoDao {

	@Override
	public void ajouterPhoto(String chemin, String description, String titre) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Dans 'ajouterPhoto'");
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
		
		// TODO Auto-generated method stub
		System.out.println("Connexion DB ok");
		
		PreparedStatement stmt;
		
		stmt = connection.prepareStatement("INSERT INTO `eauquigerme`.`photo` (`chemin`, `description`, `titre_fk`) VALUES (?, ?, ?)");
		
		stmt.setString(1, chemin);
		stmt.setString(2, description);
		stmt.setString(3, titre);
		

		stmt.executeUpdate();
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
			
		
		
		
	}

	@Override
	public void supprimerPhoto(String chemin) {
		// TODO Auto-generated method stub
		System.out.println("Dans 'supprimerPhoto'");
		
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			System.out.println("Bdd ok");		
			
			
		PreparedStatement stmt = connection.prepareStatement("DELETE FROM `eauquigerme`.`photo` WHERE `photo`.`chemin` = '"+chemin+"';");
		stmt.executeUpdate();
		
			stmt.close();
			connection.close();
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
		
		
	}

	@Override
	public void modifierTitrePhoto(String titre, String nvtitre) {
		// TODO Auto-generated method stub
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			System.out.println("Bdd ok");		
			
			
		PreparedStatement stmt = connection.prepareStatement("UPDATE `eauquigerme`.`photo` SET `titre_fk` = '"+nvtitre+"' WHERE `photo`.`titre_fk` = '"+titre+"';");
		stmt.executeUpdate();
		
			stmt.close();
			connection.close();
			
	
			
		} catch (SQLException e) {
			e.printStackTrace();

		}
		
		
		
	}

	@Override
	public void modifierPhoto(String chemin, String Param, String NvParam) {
		// TODO Auto-generated method stub
		
		System.out.println("Dans 'modifierPhoto'");
		
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			System.out.println("Bdd ok");		
			
			
		PreparedStatement stmt = connection.prepareStatement("UPDATE `eauquigerme`.`photo` SET `"+Param+"` = '"+NvParam+"' WHERE `photo`.`chemin` = '"+chemin+"';");
		stmt.executeUpdate();
		
			stmt.close();
			connection.close();
			
	
			
		} catch (SQLException e) {
			e.printStackTrace();

		}
		
		
		
		
		
		
		
	}

	@Override
	public List recupererPhotos(String titre) {
		// TODO Auto-generated method stub
		
		List<Photo> listPhoto = new ArrayList<Photo>();
		
		System.out.println("Dans 'recupererPhoto '");
		
		try {
			
		Connection connection = DataSourceProvider.getDataSource().getConnection();
		PreparedStatement stmt = connection.prepareStatement("SELECT * FROM `photo` WHERE `photo`.`titre_fk` = '"+titre+"';");
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			
		listPhoto.add(new Photo(rs.getString("chemin"), rs.getString("description"), titre));
			
			
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		return listPhoto;
	}

	@Override
	public boolean enregistrerPhoto(Part photo, String chemin) {
		// TODO Auto-generated method stub
		
		

		try {
			photo.write("/C:/Users/Mathusalem/Downloads/Cours/Projet ITI/ProjetITI2/src/main/webapp/img/"+chemin);
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public String nomPhoto(String type) {
		// TODO Auto-generated method stub
		//Cree un nom a chaque photo uploadee dans le projet
		
		if(type.equals("image/jpeg")){
			int nmbalea = (int)(Math.random()*(1000000000));
			return nmbalea+".jpg";
		}
		
		if(type.equals("image/png")){
			int nmbalea = (int)(Math.random()*(1000000000));
			return nmbalea+".png";
		}
		
		
		return null;
	}

}
