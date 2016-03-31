package hei.iti.projet.model;

public class VillageVitrine {

	private float coordonneex;
	private float coordonney;
	private String nom;
	private String description;
	
	public VillageVitrine(String nom, String description, float coordonneex, float coordonneey) {
	// TODO Auto-generated constructor stub
	
	this.nom = nom;
	this.description =  description;
	this.coordonneex = coordonneex;
	this.coordonney = coordonneey;
		
	System.out.println("Le village  vitrine "+nom+"est cree");
		
}

	public float getCoordonneex() {
		return coordonneex;
	}

	public void setCoordonneex(float coordonneex) {
		this.coordonneex = coordonneex;
	}

	public float getCoordonney() {
		return coordonney;
	}

	public void setCoordonney(float coordonney) {
		this.coordonney = coordonney;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
