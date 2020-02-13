package com.adaming.ladate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adaming.ladate.entity.Etudiant;
import com.adaming.ladate.entity.Matiere;

@Repository
public class DAOEtudiant {
	

	@Autowired
	private SessionFactory sf;
	
	
	public void ajout(Etudiant etu) {
		
		Session sess = sf.openSession();
		sess.beginTransaction();
		sess.save(etu);
		sess.getTransaction().commit();
		sess.close();
		
	
	}
	
	public void suppr(Etudiant etu) {
		Session sess = sf.openSession();
		sess.beginTransaction();
		sess.delete(etu);
		sess.getTransaction().commit();
		sess.close();
		
	}
	
	public Etudiant getById(long id) {
		final Session sess = sf.openSession();
		return (Etudiant) sess.get(Etudiant.class, id);
		
	}

	
	
	public List<Etudiant> getAll() {
		final Session sess = sf.openSession();
		final Criteria crit = sess.createCriteria(Etudiant.class);
		return crit.list();
		
	}

	

}
