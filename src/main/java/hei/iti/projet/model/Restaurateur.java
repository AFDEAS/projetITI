package hei.iti.projet.model;

public class Restaurateur {
	
private String email;
private String mdp;
private String nom;
private String prenom;
private String adresse;
private int solde;

public Restaurateur(String email, String mdp, String nom, String prenom, String adresse, int solde) {
	// TODO Auto-generated constructor stub
	
	this.email = email;
	this.mdp = mdp;
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	this.solde = solde;
	
	

}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMdp() {
	return mdp;
}

public void setMdp(String mdp) {
	this.mdp = mdp;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public int getSolde() {
	return solde;
}

public void setSolde(int solde) {
	this.solde = solde;
}

}
