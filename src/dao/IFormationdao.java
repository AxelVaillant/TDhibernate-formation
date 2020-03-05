package dao;

import java.util.List;

import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;

public interface IFormationdao {

	public int ajoutformation( Formation f);
	public List<Formation> listformation();
	public List<Formation> getformation(Lieu lieu);
	
}
