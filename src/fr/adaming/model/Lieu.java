package fr.adaming.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="lieu")
public class Lieu {
	@Id
	@GeneratedValue
	private int idlieu;
private String adresse;
private String ville;

@OneToMany(mappedBy= "lieu")
List<Formation> listf;

public Lieu(int idlieu, String adresse, String ville) {
	super();
	this.idlieu = idlieu;
	this.adresse = adresse;
	this.ville = ville;
}
public Lieu() {
	super();
	// TODO Auto-generated constructor stub
}
public int getIdlieu() {
	return idlieu;
}
public void setIdlieu(int idlieu) {
	this.idlieu = idlieu;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getVille() {
	return ville;
}
public void setVille(String ville) {
	this.ville = ville;
}
@Override
public String toString() {
	return "Lieu [idlieu=" + idlieu + ", adresse=" + adresse + ", ville=" + ville + "]";
}


}
