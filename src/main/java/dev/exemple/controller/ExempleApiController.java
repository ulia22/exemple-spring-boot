/**
 * 
 */
package dev.exemple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.exemple.Entite;
import dev.exemple.repository.EntiteRepository;

/**
 * @author ETY9
 *
 */
@RestController
@RequestMapping("/exemples")
public class ExempleApiController {
	@Autowired private EntiteRepository entiteRepo;
	
	@GetMapping
	public List<Entite> listerexemples() {
		return this.entiteRepo.findAll();
	}
}
