package cap.capgemini.aston.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cap.capgemini.aston.entities.Adresse;
import cap.capgemini.aston.services.IAdresseService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class AdresseController {

	@Autowired
	private IAdresseService adresseServiceImpl;
	
	@GetMapping("/adresses/{id}")
	public Adresse getAdresseByEleveId(@PathVariable(value = "id") Long eleveId) {
		return this.adresseServiceImpl.getAdresseByEleveId(eleveId);
	}
	
	@PostMapping("/adresses/{id}")
	public Adresse createAdresse(@PathVariable(value = "id") Long eleveId, @Valid @RequestBody Adresse adresse) {
		return this.adresseServiceImpl.createAdresse(eleveId, adresse);
	}
}
