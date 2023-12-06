package tn.esen.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tn.esen.entity.conducteur;
import tn.esen.repository.conducteurRepository;

@Controller
public class conducteurController {


	@Autowired
	private conducteurRepository conducteurRepo;
	
	
	@GetMapping("/registreForm")
	public String formInscription() {
		return "registre"; 
	}
	@GetMapping("/test")
	public String form() {
		return "test"; 
	}
	
	
	@PostMapping("/register")
	public String register(@ModelAttribute conducteur c) {
		System.out.println(c);
		conducteurRepo.save(c); 
		
		System.out.println("ajout avec succes");

		return "redirect:/registreForm" ;
	}
	
	@GetMapping("/loginForm")
	public String formLogin() {
		return "login"; 
	}
	
}
