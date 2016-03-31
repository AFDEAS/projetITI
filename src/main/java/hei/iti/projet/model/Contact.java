package hei.iti.projet.model;

public class Contact {
	
private String email;
private String nom;
private String prenom;
private String telephone;
private String description;
private String poste;

public Contact(String email, String nom, String prenom, String telephone, String description, String poste) {
	// TODO Auto-generated constructor stub
	
	this.email = email;
	this.nom = nom;
	this.prenom = prenom;
	this.telephone = telephone;
	this.description = description;
	this.poste = poste;
	
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
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

public String getTelephone() {
	return telephone;
}

public void setTelephone(String telephone) {
	this.telephone = telephone;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getPoste() {
	return poste;
}

public void setPoste(String poste) {
	this.poste = poste;
}

}
