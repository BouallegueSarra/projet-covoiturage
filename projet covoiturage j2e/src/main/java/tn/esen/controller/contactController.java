package tn.esen.controller;

import javax.servlet.http.HttpSession; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tn.esen.entity.conducteur;
import tn.esen.entity.contact;
import tn.esen.repository.conducteurRepository;
import tn.esen.repository.contactRepository;

@Controller
public class contactController {

	
	
	@Autowired
	private contactRepository contactRepo;
	
	
	@GetMapping("/contact")
	public String formContact() {
		return "contact"; 
	}
	
	@PostMapping("/saveContact")
	public String saveContact(@ModelAttribute contact c, HttpSession session) {
		System.out.println(c);
		contactRepo.save(c); 
		 session.setAttribute("msg", "Contact a été envoyé avec succées");

		System.out.println("ajout avec succes");

		return "redirect:/contact" ;
	}
	
	
	
	
	
	
	
}
