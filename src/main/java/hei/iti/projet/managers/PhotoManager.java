package hei.iti.projet.managers;

import java.util.List;

import javax.servlet.http.Part;

import hei.iti.projet.dao.PhotoDao;
import hei.iti.projet.dao.impl.PhotoDaoImpl;
import hei.iti.projet.model.Photo;

public class PhotoManager {

private static PhotoManager instance;
	
	private PhotoDao photodao = new PhotoDaoImpl();
	
	private PhotoManager(){
		
	};
	
	public static PhotoManager getInstance() {
		if (instance == null) {
			instance = new PhotoManager();
		}
		return instance;
	}	
	
		
	public List<Photo> recupererPhoto(String titre){
		
		
		return photodao.recupererPhotos(titre);
	}
	
	public String nomPhoto(String content){
		
		
		return photodao.nomPhoto(content);
	}
	
public boolean enregistrerPhoto(Part photo,String chemin){
		
		
		return photodao.enregistrerPhoto(photo, chemin);
	}
	

public void ajouterPhoto(String chemin, String description, String titre){
	
	
	photodao.ajouterPhoto(chemin, description, titre);
	
	
	return;
}

public void supprimerPhoto(String chemin){
	
	photodao.supprimerPhoto(chemin);
	
	return;
}


}
