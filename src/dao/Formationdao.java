package dao;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;

public class Formationdao implements IFormationdao{

	@Override
	public int ajoutformation(Formation f) {
		try {
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session= factory.openSession();
			session.beginTransaction();
			session.save(f);
			session.getTransaction().commit();
			return 1;
		} catch (HibernateException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<Formation> listformation() {
		List<Formation> list= new ArrayList<Formation>();
		try {
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session= factory.openSession();
			session.beginTransaction();
			
			String hql = "select * from formation";
			SQLQuery query=session.createSQLQuery(hql);
			query.addEntity(Formation.class);
			list=query.list();
			return list;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Formation> getformation(Lieu lieu) {
		try {
			List<Formation> list= new ArrayList<Formation>();
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
			Session s=sessionfactory.openSession();
			s.beginTransaction();
			Query query =s.createQuery("from Formation where lieu.idlieu = :idlieu");
			
//			SQLQuery query=s.createSQLQuery("select*from formation where lieu.idlieu= :idlieu");
			query.setParameter("idlieu",lieu.getIdlieu());
			list=query.list();
			System.out.println("dao"+list);
			return list;
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Erreur");
			return null;
		}


	}

}
