package dao;

import java.util.List;

import fr.adaming.model.Formation;

public interface IFormationdao {

	public int ajoutformation( Formation f);
	public List<Formation> listformation();
	
}
