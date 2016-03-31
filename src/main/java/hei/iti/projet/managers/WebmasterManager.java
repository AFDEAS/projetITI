package hei.iti.projet.managers;

import hei.iti.projet.dao.WebmasterDao;
import hei.iti.projet.dao.impl.WebmasterDaoImpl;

public class WebmasterManager {

private static  WebmasterManager instance;
	
	private WebmasterDao webmasterdao = new WebmasterDaoImpl();
	
	private WebmasterManager(){
		
	};
	
	public static WebmasterManager getInstance() {
		if (instance == null) {
			instance = new WebmasterManager();
		}
		return instance;
	}
	
	

	public boolean seConnecter(String email, String motdepasse){
		System.out.println("Dans methode: seConnecter");
		
		
		return webmasterdao.seConnecter(email, motdepasse);
		
	}
	
	
}
