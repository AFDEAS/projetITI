package hei.iti.projet.dao;

import hei.iti.projet.model.Restaurateur;

public interface RestaurateurDao {

	public void ajouterRestaurateur(String email, String mdp, String nom, String prenom, String adresse, int solde);
	
	public boolean seConnecter(String email, String mdp);
	
	public Restaurateur RecupererRestaurateur(String email);
	
	public void ModifierRestaurateur(String email, String Param, String NvParam);
	
	
}
