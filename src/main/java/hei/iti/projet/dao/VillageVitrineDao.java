package hei.iti.projet.dao;

import java.util.List;

public interface VillageVitrineDao {
	
	
	public void ajouterVillage(String nom, String description, float coordonneex, float coordonneey);
	
	public List recupererVillages();

	public void modifierVillage(String Param, String nom, String nvParam);
	
	public void modifierVillage(String Param, String nom, float nvParam);
	
	public void supprimerVillage(String nom);
}
