package hei.iti.projet.dao.impl;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hei.iti.projet.dao.VillageVitrineDao;
import hei.iti.projet.model.VillageVitrine;


public class VillageVitrineDaoTest {

	private VillageVitrineDao villagevitrinedao = new VillageVitrineDaoImpl();
	
	
	@Before
	public void initBdd() throws Exception {
		Connection connection = DataSourceProvider.getDataSource().getConnection();
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("DELETE FROM `village_vitrine`");
		stmt.executeUpdate("INSERT INTO `eauquigerme`.`village_vitrine` (`description`, `nom`, `coordonneesx`, `coordonneesy`) VALUES ('description test 1', 'village test 1', '0.0000', '0.0000');");
		stmt.executeUpdate("INSERT INTO `eauquigerme`.`village_vitrine` (`description`, `nom`, `coordonneesx`, `coordonneesy`) VALUES ('description test 2', 'village test 2', '2.1111', '-20.0000');");
		stmt.executeUpdate("INSERT INTO `eauquigerme`.`village_vitrine` (`description`, `nom`, `coordonneesx`, `coordonneesy`) VALUES ('description test 3', 'village test 3', '3.33312', '-3.0000');");
		stmt.executeUpdate("INSERT INTO `eauquigerme`.`village_vitrine` (`description`, `nom`, `coordonneesx`, `coordonneesy`) VALUES ('description test 4', 'village test 4', '.0000', '4.0000');");
		stmt.close();
		connection.close();
	}
	
	
	@Test
	public void testerModifierVillage() throws Exception {
		
	List<VillageVitrine> listVillage = new ArrayList<VillageVitrine>();
	
	villagevitrinedao.ajouterVillage("villagetest5", "descriptiontest5", (float) 5.444 , (float) 5.222);

	
	
	villagevitrinedao.modifierVillage("description", "villagetest5", "Nouvelledescriptiontest");
	
	listVillage = villagevitrinedao.recupererVillages();
	
	Assert.assertEquals("Nouvelledescriptiontest", listVillage.get(4).getDescription());
	
	villagevitrinedao.modifierVillage("coordonneesx", "villagetest5", (float) 10);
	
	listVillage = villagevitrinedao.recupererVillages();
	
	Assert.assertEquals(10, listVillage.get(4).getCoordonneex(), 0);
	
	
		
	}
	
	
	
	@Test
	public void testerAjouterVillage() throws Exception {
		
	villagevitrinedao.ajouterVillage("villagetest5", "descriptiontest5", (float) 5.444 , (float) 5.222);
		
	}
	
	
	@Test
	public void testerSupprimerVillage() throws Exception {
	
	List<VillageVitrine> listVillage = new ArrayList<VillageVitrine>();
		
	villagevitrinedao.ajouterVillage("villagetest5", "descriptiontest5", (float) 5.444 , (float) 5.222);
		
	listVillage = villagevitrinedao.recupererVillages();
	
	Assert.assertEquals("descriptiontest5", listVillage.get(4).getDescription());
		
	villagevitrinedao.supprimerVillage("villagetest5");
	
	listVillage = villagevitrinedao.recupererVillages();
	
	Assert.assertNotEquals("descriptiontest5", listVillage.get(listVillage.size()-1).getDescription());
		
	}
	
	@Test
	public void testerRecupererVillages() throws Exception {
	
	List<VillageVitrine> listVillage = new ArrayList<VillageVitrine>();
	
	VillageVitrine villageexemple = new VillageVitrine("village test 4", "description test 4", (float) 5.444 , (float) 5.222);
	
	listVillage = villagevitrinedao.recupererVillages();
	
	Assert.assertEquals(villageexemple.getNom(), listVillage.get(3).getNom());
		
	}
	

	
	
}
