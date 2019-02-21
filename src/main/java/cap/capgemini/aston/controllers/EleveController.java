package cap.capgemini.aston.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cap.capgemini.aston.entities.Eleve;
import cap.capgemini.aston.services.IEleveService;

/**
 * @author davidserhani
 *
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class EleveController {
	
	@Autowired
	private IEleveService eleveService;
	
	@GetMapping("/eleves")
	public List<Eleve> listeEleves() {
		return this.eleveService.getAllEleves();
	}
	
	@GetMapping("/eleves/{id}")
	public Eleve getEleve(@PathVariable(value = "id") Long eleveId) {
		return this.eleveService.getEleveById(eleveId);
	}
	
	@PostMapping("/eleves")
	public Eleve ajouterEleve(@Valid @RequestBody Eleve newEleve) {
		return this.eleveService.addEleve(newEleve);
	}
	
	@PutMapping("/eleves/{id}")
	public Eleve modifierEleve(@PathVariable(value = "id") Long eleveId, @Valid @RequestBody Eleve eleveModifie) {
		return this.eleveService.addEleve(eleveModifie);
	}
	
	@DeleteMapping("/eleves/{id}")
	public ResponseEntity<String> supprimerEleve(@PathVariable(value = "id") Long eleveId) {
		return this.eleveService.deleteEleve(eleveId);
	}
}
