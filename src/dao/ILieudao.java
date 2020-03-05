package dao;

import java.util.List;


import fr.adaming.model.Lieu;

public interface ILieudao {
public int createLieu(Lieu lieu);
public List<Lieu> listlieu();
}
