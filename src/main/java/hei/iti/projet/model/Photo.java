package hei.iti.projet.model;

public class Photo {

	private String chemin;
	private String description;
	private String titre;
	
	
public Photo(String chemin, String description, String titre) {
	// TODO Auto-generated constructor stub
	
	
	this.chemin = chemin;
	this.description = description;
	this.titre = titre;
	
	System.out.println("Photo "+chemin+" est cree");
}


public String getChemin() {
	return chemin;
}


public void setChemin(String chemin) {
	this.chemin = chemin;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public String getTitre() {
	return titre;
}


public void setTitre(String titre) {
	this.titre = titre;
}
	
	
}
