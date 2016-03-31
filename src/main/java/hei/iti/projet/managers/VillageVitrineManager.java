package hei.iti.projet.managers;

import java.util.List;

import hei.iti.projet.dao.VillageVitrineDao;
import hei.iti.projet.dao.impl.VillageVitrineDaoImpl;

public class VillageVitrineManager {
	
	
	
private static  VillageVitrineManager instance;
	
	private VillageVitrineDao villageVitrinedao = new VillageVitrineDaoImpl();
	
	private VillageVitrineManager(){
		
	};
	
	public static VillageVitrineManager getInstance() {
		if (instance == null) {
			instance = new VillageVitrineManager();
		}
		return instance;
	}	
	
	public List recupererVillages(){
		
		
		return villageVitrinedao.recupererVillages();
	}
	
	public void modifierVillage(String Param, String nom, String nvParam){
		
		villageVitrinedao.modifierVillage(Param, nom, nvParam);
		
		return;
	}
	
	public void modifierVillage(String Param, String nom, float nvParam){
		
		villageVitrinedao.modifierVillage(Param, nom, nvParam);
		
		return;
	}
	
	public void supprimerVillage(String nom){
		
		villageVitrinedao.supprimerVillage(nom);
		
		return;
	}
	
	
	public void ajouterVillage(String nom, String description, float coordonneex, float coordonneey){
		
		villageVitrinedao.ajouterVillage(nom, description, coordonneex, coordonneey);
		
		return;
	}
	
	
	

}
