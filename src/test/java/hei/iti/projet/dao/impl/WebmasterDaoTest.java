package hei.iti.projet.dao.impl;

import java.sql.Connection;
import java.sql.Statement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hei.iti.projet.dao.WebmasterDao;
import hei.iti.projet.utils.MotDePasseUtils;


public class WebmasterDaoTest {

	private WebmasterDao webmasterdao = new WebmasterDaoImpl();
	private MotDePasseUtils motdepasse = new MotDePasseUtils();
	
	
	@Before
	public void initBdd() throws Exception {
		Connection connection = DataSourceProvider.getDataSource().getConnection();
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("DELETE FROM `webmaster`");
		stmt.executeUpdate("INSERT INTO `eauquigerme`.`webmaster` (`email`, `mdp` ) VALUES ('webmaster@test.fr','"+MotDePasseUtils.genererMotDePasse("admin")+"');");
		stmt.executeUpdate("INSERT INTO `eauquigerme`.`webmaster` (`email`, `mdp` ) VALUES ('webmaster2@test.fr','"+MotDePasseUtils.genererMotDePasse("admin2")+"');");
		stmt.executeUpdate("INSERT INTO `eauquigerme`.`webmaster` (`email`, `mdp` ) VALUES ('webmaster3@test.fr','"+MotDePasseUtils.genererMotDePasse("admin3")+"');");
		stmt.close();
		connection.close();
	}
	

	
	@Test
	public void testerSeConnecter() throws Exception {
		
		//Mdp ok, email ok
		Assert.assertTrue(webmasterdao.seConnecter("webmaster@test.fr", "admin"));
		
		//Mdp existe, email autre
		Assert.assertFalse(webmasterdao.seConnecter("webmaster2@test.fr", "admin"));
		
		//Mdp existe, email inexistant
		Assert.assertFalse(webmasterdao.seConnecter("webmaster4@test.fr", "admin"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
