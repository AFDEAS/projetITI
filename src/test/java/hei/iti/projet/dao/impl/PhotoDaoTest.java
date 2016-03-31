package hei.iti.projet.dao.impl;

import java.sql.Connection;
import java.sql.Statement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hei.iti.projet.dao.PhotoDao;
import hei.iti.projet.utils.MotDePasseUtils;

public class PhotoDaoTest {

	private PhotoDao photodao = new PhotoDaoImpl();
	
	
	@Before
	public void initBdd() throws Exception {
		Connection connection = DataSourceProvider.getDataSource().getConnection();
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("DELETE FROM `photo`");
		stmt.executeUpdate("INSERT INTO `eauquigerme`.`photo` (`chemin`, `description`, `titre_fk`) VALUES ('chemintest1', 'descriptiotest1', 'titretest1');");
		stmt.executeUpdate("INSERT INTO `eauquigerme`.`photo` (`chemin`, `description`, `titre_fk`) VALUES ('chemintest2', '', 'titretest2');");
		stmt.executeUpdate("INSERT INTO `eauquigerme`.`photo` (`chemin`, `description`, `titre_fk`) VALUES ('chemintest3', 'descriptiotest3', 'titretest3');");
		stmt.executeUpdate("INSERT INTO `eauquigerme`.`photo` (`chemin`, `description`, `titre_fk`) VALUES ('chemintest4', 'descriptiotest4', 'titretest4');");
		stmt.executeUpdate("INSERT INTO `eauquigerme`.`photo` (`chemin`, `description`, `titre_fk`) VALUES ('chemintest6', 'descriptiotest4', 'titretest5');");
		stmt.executeUpdate("INSERT INTO `eauquigerme`.`photo` (`chemin`, `description`, `titre_fk`) VALUES ('chemintest7', 'descriptiotest4', 'titretest5');");
		stmt.close();
		connection.close();
	}
	
	

	@Test
	public void testerAjouterPhoto() throws Exception {

		photodao.ajouterPhoto("chemintest5", "descriptiotest5", "titretest5");
		photodao.supprimerPhoto("chemintest2");
		photodao.modifierTitrePhoto("titretest5", "nvtitre");
	}
	
	@Test
	public void testerSupprimerPhoto() throws Exception {

		photodao.supprimerPhoto("chemintest2");
		
	}
	
	
}
