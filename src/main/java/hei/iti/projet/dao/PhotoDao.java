package hei.iti.projet.dao;

import java.util.List;

import javax.servlet.http.Part;

public interface PhotoDao {

public void ajouterPhoto(String chemin, String description, String titre);

public void supprimerPhoto(String chemin);

public void modifierTitrePhoto(String titre, String nvtitre);

public void modifierPhoto(String chemin, String Param, String NvParam);

public List recupererPhotos(String titre);	
	
public boolean enregistrerPhoto(Part photo, String chemin);

public String nomPhoto(String type);

}
