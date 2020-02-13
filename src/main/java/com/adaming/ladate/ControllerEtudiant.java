package com.adaming.ladate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adaming.ladate.dao.DAOEtudiant;
import com.adaming.ladate.entity.Etudiant;

@Controller
@RequestMapping("/Etudiant")
public class ControllerEtudiant {
	
	@Autowired
	DAOEtudiant daoetu;
	
	@RequestMapping(value="/ajout", method = RequestMethod.POST)
	public String ajoutMatiere(@ModelAttribute("etu") Etudiant etu) {
		
		daoetu.ajout(etu);
		
		return "redirect:affichage";
		
		
	}
	
	@RequestMapping(value="/suppression", method = RequestMethod.GET)
	public String supprMatiere(@ModelAttribute("etu") Etudiant etu) {
		
		daoetu.suppr(etu);
		
		return "redirect:affichage";
		
		
	}
	
	@RequestMapping(value="/affichage", method = RequestMethod.GET)
	public String getAllMatiere(ModelMap model) {
		
		model.addAttribute("listeetudiant", daoetu.getAll());
		
		return "etudiant";
		
		
	}

}
