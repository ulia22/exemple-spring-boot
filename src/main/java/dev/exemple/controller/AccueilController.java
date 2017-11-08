/**
 * 
 */
package dev.exemple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dev.exemple.repository.EntiteRepository;

/**
 * @author ETY9
 *
 */
@Controller
@RequestMapping("/accueil")
public class AccueilController {
	@Autowired private EntiteRepository exempleRepo;
	@GetMapping
	public ModelAndView afficherAccueil() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("accueil");
		mv.addObject("listeExemples", exempleRepo.findAll());
		return mv;
	}
}
