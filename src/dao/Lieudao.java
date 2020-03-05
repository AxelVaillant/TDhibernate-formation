package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;

public class Lieudao implements ILieudao {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	@Override
	public int createLieu(Lieu lieu) {
		try {
			Session session= factory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(lieu);
			session.getTransaction().commit();
			return 1;
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("erreur");
			return 0;
	}

}
	@Override
	public List<Lieu> listlieu() {
		List<Lieu> list= new ArrayList<Lieu>();
		try {
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session= factory.openSession();
			session.beginTransaction();
			
			String hql = "select * from lieu";
			SQLQuery query=session.createSQLQuery(hql);
			query.addEntity(Lieu.class);
			list=query.list();
			return list;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
}}