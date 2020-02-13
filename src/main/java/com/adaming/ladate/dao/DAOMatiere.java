package com.adaming.ladate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adaming.ladate.entity.Matiere;
@Repository
public class DAOMatiere {
	


	@Autowired
	private SessionFactory sf;
	
	
	public void ajout(Matiere mat) {
		
		Session sess = sf.openSession();
		sess.beginTransaction();
		sess.save(mat);
		sess.getTransaction().commit();
		sess.close();
		
	
	}
	
	public void suppr(Matiere mat) {
		Session sess = sf.openSession();
		sess.beginTransaction();
		sess.delete(mat);
		sess.getTransaction().commit();
		sess.close();
		
	}
	
	
	public Matiere getById(long id) {
		final Session sess = sf.openSession();
		return (Matiere) sess.get(Matiere.class, id);
		
	}

	
	
	public List<Matiere> getAll() {
		final Session sess = sf.openSession();
		final Criteria crit = sess.createCriteria(Matiere.class);
		return crit.list();
		
	}


}
