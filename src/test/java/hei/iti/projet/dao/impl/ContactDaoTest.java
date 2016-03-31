package hei.iti.projet.dao.impl;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hei.iti.projet.dao.ContactDao;
import hei.iti.projet.model.Contact;

public class ContactDaoTest {

	private ContactDao contactdao = new ContactDaoImpl();
	
	
	@Before
	public void initBdd() throws Exception {
		Connection connection = DataSourceProvider.getDataSource().getConnection();
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("DELETE FROM `contact`");
		stmt.executeUpdate("INSERT INTO `eauquigerme`.`contact` (`email`, `nom`, `prenom`, `telephone`, `description`, `poste`) VALUES ('emailtest', 'nomtest', 'prenomtest', 'telephonetest', 'descriptiontest', 'postetest');");
		stmt.executeUpdate("INSERT INTO `eauquigerme`.`contact` (`email`, `nom`, `prenom`, `telephone`, `description`, `poste`) VALUES ('emailtest2', 'nomtest2', 'prenomtest2', 'telephonetest2', 'descriptiontest2', 'postetest2');");
		stmt.executeUpdate("INSERT INTO `eauquigerme`.`contact` (`email`, `nom`, `prenom`, `telephone`, `description`, `poste`) VALUES ('emailtest3', 'nomtest3', 'prenomtest3', 'telephonetest3', 'descriptiontest3', 'postetest3');");
		stmt.executeUpdate("INSERT INTO `eauquigerme`.`contact` (`email`, `nom`, `prenom`, `telephone`, `description`, `poste`) VALUES ('emailtest4', 'nomtest4', 'prenomtest4', 'telephonetest4', 'descriptiontest4', 'postetest4');");
		stmt.executeUpdate("INSERT INTO `eauquigerme`.`contact` (`email`, `nom`, `prenom`, `telephone`, `description`, `poste`) VALUES ('emailtest5', 'nomtest5', 'prenomtest5', 'telephonetest5', 'descriptiontest5', 'postetest5');");
		stmt.close();
		connection.close();
	}
	
	@Test
	public void testerlisterContacts() throws Exception {

		List<Contact> listcontact = new ArrayList<Contact>();
		
		
		listcontact = contactdao.listerContacts();
		
		Assert.assertEquals("emailtest5", listcontact.get(listcontact.size()-1).getEmail());
	
	}
	
	@Test
	public void testerajouterContact() throws Exception {

		List<Contact> listcontact = new ArrayList<Contact>();
		
		contactdao.ajouterContact("emailtest6", "test", "test", "test", "test", "test");
		
		listcontact = contactdao.listerContacts();
		
		Assert.assertEquals("emailtest6", listcontact.get(listcontact.size()-1).getEmail());
	
	}
	
	
	@Test
	public void testersupprimerContact() throws Exception {

		List<Contact> listcontact = new ArrayList<Contact>();
		
		contactdao.supprimerContact("emailtest5");
		
		listcontact = contactdao.listerContacts();
		
		Assert.assertEquals("emailtest4", listcontact.get(listcontact.size()-1).getEmail());
	
	}
	
	@Test
	public void testermodifierContact() throws Exception {

		List<Contact> listcontact = new ArrayList<Contact>();
		
		contactdao.modifierContact("emailtest5", "nom", "nvnom");
		
		listcontact = contactdao.listerContacts();
		
		Assert.assertEquals("nvnom", listcontact.get(listcontact.size()-1).getNom());
	
	}
	
	
	
}
