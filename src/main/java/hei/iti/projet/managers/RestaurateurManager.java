package hei.iti.projet.managers;

import hei.iti.projet.dao.RestaurateurDao;
import hei.iti.projet.dao.impl.RestaurateurDaoImpl;
import hei.iti.projet.model.Restaurateur;

public class RestaurateurManager {

private static  RestaurateurManager instance;
	
	private RestaurateurDao restaurateurdao = new RestaurateurDaoImpl();
	
	private RestaurateurManager(){
		
	};
	
	public static RestaurateurManager getInstance() {
		if (instance == null) {
			instance = new RestaurateurManager();
		}
		return instance;
	}
	
	public boolean seConnecter(String email, String mdp){
		
		
		
		return restaurateurdao.seConnecter(email, mdp);
	}
	
	
	public Restaurateur RecupererRestaurateur(String email){
		
		return restaurateurdao.RecupererRestaurateur(email);
	}
	
	
	public void ModifierRestaurateur(String email, String Param, String NvParam){
		
		restaurateurdao.ModifierRestaurateur(email, Param, NvParam);
		
		
	}
	
	
	
}
