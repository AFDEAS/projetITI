package hei.iti.projet.dao;

public interface WebmasterDao {

public void ajouterWebmaster(String email, String mdp);

public boolean seConnecter(String email, String mdp);
	
}
