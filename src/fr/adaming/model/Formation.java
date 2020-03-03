package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="formation")
public class Formation {
	@Id
	private int id;
	private String theme;
	public Formation(int id, String theme) {
		super();
		this.id = id;
		this.theme = theme;
	}
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	@Override
	public String toString() {
		return "Formation [id=" + id + ", theme=" + theme + "]";
	}
	
}
