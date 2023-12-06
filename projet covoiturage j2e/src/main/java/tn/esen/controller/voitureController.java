package tn.esen.controller;

import java.util.List; 
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import tn.esen.entity.annonce;
import tn.esen.entity.conducteur;
import tn.esen.entity.voiture;
import tn.esen.repository.conducteurRepository;
import tn.esen.repository.voitureRepository;
 
@Controller
public class voitureController {

	
	@Autowired
	private  voitureRepository voitureRepo;
	
	
	@GetMapping("/listeVoiture")
	public String listVoiture(Model model) {
		
		List<voiture> list=voitureRepo.findAll();
		model.addAttribute("allVoiture", list);
		return "liste_voiture";
	}
	
	
	
	@GetMapping("/voitureForm")
	public String formAjoutVoiture() {
		return "ajout_voiture"; 
	}
	
	
	
	@PostMapping("/addVoiture")
	public String addVoiture(@ModelAttribute voiture v, HttpSession session) {
		System.out.println(v);
	

		voitureRepo.save(v);
		session.setAttribute("msg", "Voiture a été ajouté avec succées");
		System.out.println("ajout avec succes");
		

		return "redirect:/listeVoiture" ;
	}
	
	
	@GetMapping("/deleteVoiture/{id}")
	public String supprimerVoiture( @PathVariable(value="id") long id, HttpSession session) {
		
		voitureRepo.deleteById(id); 
		session.setAttribute("msg", "Voiture a été supprimé avec succées");

		
		return "redirect:/listeVoiture"; 
	}
	
	
	@GetMapping("/formEditVoiture/{id}")
	public String formEditVoiture( @PathVariable(value="id") long id, Model m) {
		Optional<voiture> voiture=voitureRepo.findById(id);
		voiture voi=voiture.get(); 
		m.addAttribute("voiture", voi);
		
		return "modifierVoiture"; 
	}
	

	
	
	  @PostMapping("/updateVoiture")
	  public String updateAnnonce(@ModelAttribute voiture voiture , HttpSession session ) {
	  
	  voitureRepo.save(voiture); 
	  
	 session.setAttribute("msg", "Voiture a été modifié avec succées");
	  
	  System.out.println("modification avec succes");
	  return "redirect:/listeVoiture"; }
	 
	
}
