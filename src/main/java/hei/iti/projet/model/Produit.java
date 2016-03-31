package hei.iti.projet.model;

public class Produit {

	private int id;
	private String nom;
	private String description;
	private String periodeDeSemis;
	private int dureeMaturation;
	private String arrosage;
	private String rendement;
	private int prix;
	private int quantiteDispo;
	private String categorie;
	private String saison;
	
public Produit(int id, String nom,String description,String periodeDeSemis, int dureeMaturation, String arrosage, String rendement, int prix , int quantiteDispo, String categorie, String saison ) {
	// TODO Auto-generated constructor stub
	
	this.id = id;
	this.nom = nom;
	this.description = description;
	this.periodeDeSemis = periodeDeSemis;
	this.dureeMaturation = dureeMaturation;
	this.arrosage = arrosage;
	this.rendement = rendement;
	this.prix = prix;
	this.quantiteDispo = quantiteDispo;
	this.categorie = categorie;
	this.saison = saison;
	
}

public String getSaison() {
	return saison;
}

public void setSaison(String saison) {
	this.saison = saison;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
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

public String getPeriodeDeSemis() {
	return periodeDeSemis;
}

public void setPeriodeDeSemis(String periodeDeSemis) {
	this.periodeDeSemis = periodeDeSemis;
}

public int getDureeMaturation() {
	return dureeMaturation;
}

public void setDureeMaturation(int dureeMaturation) {
	this.dureeMaturation = dureeMaturation;
}

public String getArrosage() {
	return arrosage;
}

public void setArrosage(String arrosage) {
	this.arrosage = arrosage;
}

public String getRendement() {
	return rendement;
}

public void setRendement(String rendement) {
	this.rendement = rendement;
}

public int getPrix() {
	return prix;
}

public void setPrix(int prix) {
	this.prix = prix;
}

public int getQuantiteDispo() {
	return quantiteDispo;
}

public void setQuantiteDispo(int quantiteDispo) {
	this.quantiteDispo = quantiteDispo;
}

public String getCategorie() {
	return categorie;
}

public void setCategorie(String categorie) {
	this.categorie = categorie;
}
	
	
	
}
