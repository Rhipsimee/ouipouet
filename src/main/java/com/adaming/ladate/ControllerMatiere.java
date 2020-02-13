package com.adaming.ladate;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adaming.ladate.dao.DAOMatiere;
import com.adaming.ladate.entity.Matiere;

@Controller
@RequestMapping("/Matiere")
public class ControllerMatiere {
	@Autowired
	DAOMatiere daomat;
	
	String matiere;
	
	@RequestMapping(value="/ajout", method = RequestMethod.POST)
	public String ajoutMatiere(@ModelAttribute("mat") Matiere mat) {
		
		daomat.ajout(mat);
		
		
		return "redirect:affichage";
		
		
	}
	
	@RequestMapping(value="/suppression", method = RequestMethod.POST)
	public String supprMatiere(@ModelAttribute("mat") Matiere mat) {
		
		daomat.suppr(mat);
		
		
		
		return "redirect:affichage";
		
	}
	
	@RequestMapping(value="/affichage", method = RequestMethod.GET)
	public String getAllMatiere(ModelMap model) {
		
		model.addAttribute("listematiere", daomat.getAll());
		
		return "matiere";
		
		
	}
	
	@RequestMapping(value="/getid", method = {RequestMethod.GET,RequestMethod.POST})
	public String getByIdMatiere(ModelMap model,@ModelAttribute("mat") Matiere mat) {
		
		
		
		
		model.addAttribute("lamatiere", daomat.getById(mat.getIdMatiere()));
		
		return matiere;
		
		
	}
	
	@RequestMapping(value="/init", method = RequestMethod.GET)
	public String init(@ModelAttribute("mat") Matiere mat) {
		
		
		return matiere;
	}
	
	
	
	@RequestMapping(value="/accueil", method = RequestMethod.GET)
	public String accueil() {
		
		
		
		return matiere;
		
		
	}

}
