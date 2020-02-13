package com.adaming.ladate;

import static org.junit.Assert.assertEquals;

import javax.servlet.ServletContext;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.adaming.ladate.dao.DAOEtudiant;
import com.adaming.ladate.entity.Etudiant;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src//test//resources//root-context.xml"})
public class TestDAOEtudiant {
	
	
	
	@Autowired
	private DAOEtudiant daoetu;
	
	Etudiant etd;
	
	@Before
	public void setup() {
		
		etd = new Etudiant();
		
		etd.setIdEtudiant(3L);
		etd.setNomEtudiant("Paul");
		etd.setPrenomEtudiant("Pierre");
		
	}
	
	@Test
	public void AjoutEtudiant() {
		
		daoetu.ajout(this.etd);
		Etudiant etu = daoetu.getById(3L);
		assertEquals(etu, etd);
		
		
		
	}

	public DAOEtudiant getDaoetu() {
		return daoetu;
	}

	public void setDaoetu(DAOEtudiant daoetu) {
		this.daoetu = daoetu;
	}

	

	
	
	
	
	
	

}
