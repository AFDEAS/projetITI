package hei.iti.projet.dao.impl;

import java.sql.Connection;
import java.sql.Statement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hei.iti.projet.dao.RestaurateurDao;
import hei.iti.projet.utils.MotDePasseUtils;

public class RestaurateurDaoTest {
	
	
private RestaurateurDao restaurateurdao = new RestaurateurDaoImpl();
	
private MotDePasseUtils motdepasse = new MotDePasseUtils();
		

	@Before
	public void initBdd() throws Exception {
		Connection connection = DataSourceProvider.getDataSource().getConnection();
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("DELETE FROM `restaurateur`");
		stmt.executeUpdate("INSERT INTO `eauquigerme`.`restaurateur` (`email`, `mdp`, `nom`, `prenom`, `adresse`, `solde`) VALUES ('restaurateur@test.fr', '"+MotDePasseUtils.genererMotDePasse("admin")+"', 'NomRestau', 'PrenomRestau', 'AdresseRestau', '0');");
		stmt.close();
		connection.close();
	}


	@Test
	public void testerSeConnecter() throws Exception {
		
		Assert.assertTrue(true);
		
		
	}
	
	
	
}
