package tn.esen.controller;

import java.io.IOException;   
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import tn.esen.entity.annonce;
import tn.esen.repository.annonceRepository;

@Controller
public class annonceController {

	@Autowired
	private annonceRepository annonceRepo;

	
	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/formAnnonce")
	public String formAddAnnonce() {
		return "ajout_annonce";
	}

	@GetMapping("/listeAnnonce")
	public String listAnnonce(Model model) {

		List<annonce> list = annonceRepo.findAll();
		model.addAttribute("allAnnonce", list);
		return "liste_annonce";
	}

	@PostMapping("/saveAnnonce")
	public String saveAnnonce(@ModelAttribute annonce annonce, HttpSession session) {

		annonceRepo.save(annonce);
		session.setAttribute("msg", "Annonce a été ajouté avec succées");
		return "redirect:/listeAnnonce";
	}
	
	
	@GetMapping("/formUpdate/{id}")
	public String editForm(@PathVariable(value="id") long id , Model m) {
		Optional<annonce> annonce=annonceRepo.findById(id);
		annonce ann=annonce.get(); 
		m.addAttribute("annonce", ann); 
		
		return "modifierAnnonce";
	}



	@PostMapping("/updateAnnonce")
	public String updateAnnonce(@ModelAttribute annonce annonce, HttpSession session) {

		annonceRepo.save(annonce);
		session.setAttribute("msg", "Annonce a été modifié avec succées");
		System.out.println("Annonce a été modifié avec succées");
		return "redirect:/listeAnnonce";
	}
	
	
	  @GetMapping("/delete/{id}")
	  public String supprimerAnnonce(@PathVariable(value = "id") long id, HttpSession session) {

			annonceRepo.deleteById(id);
			session.setAttribute("msg", "Annonce a été supprimé avec succées");

			return "redirect:/listeAnnonce";
		}
	
	
}
