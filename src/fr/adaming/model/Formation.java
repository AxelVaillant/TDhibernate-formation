package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="formation")
public class Formation {
	@Id
	private int idformation;
	private String theme;
	@JoinColumn(name="idlieu")
	@ManyToOne
	private Lieu lieu;
	public Lieu getLieu() {
		return lieu;
	}
	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}
	public Formation(int id, String theme) {
		super();
		this.idformation = id;
		this.theme = theme;
	}
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return idformation;
	}
	public void setId(int id) {
		this.idformation = id;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	@Override
	public String toString() {
		return "Formation [id=" + idformation + ", theme=" + theme + "]";
	}
	
}
