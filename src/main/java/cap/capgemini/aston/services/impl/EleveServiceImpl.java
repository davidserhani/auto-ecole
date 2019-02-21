package cap.capgemini.aston.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import cap.capgemini.aston.dao.IEleveRepository;
import cap.capgemini.aston.entities.Eleve;
import cap.capgemini.aston.exceptions.RessourceNotFoundException;
import cap.capgemini.aston.services.IEleveService;

/**
 * @author davidserhani
 *
 */
@Service
public class EleveServiceImpl implements IEleveService {
	
	@Autowired
	private IEleveRepository eleveRepository;

	@Override
	public List<Eleve> getAllEleves() {
		return this.eleveRepository.findAll();
	}

	@Override
	public Eleve addEleve(Eleve eleve) {
		return this.eleveRepository.save(eleve);
	}

	@Override
	public Eleve getEleveById(Long eleveId) {
		return this.eleveRepository.findById(eleveId).orElseThrow(() -> new RessourceNotFoundException("Eleve", "id", eleveId));
	}

	@Override
	public Eleve updateEleve(Long eleveId, Eleve eleveModifie) {
		final Eleve eleve = this.getEleveById(eleveId);
		eleve.setNom(eleveModifie.getNom());
		eleve.setPrenom(eleveModifie.getPrenom());
		eleve.setDateDeNaissance(eleveModifie.getDateDeNaissance());
		return this.eleveRepository.save(eleve);
	}

	@Override
	public ResponseEntity<String> deleteEleve(Long eleveId) {
		final Eleve eleve = this.getEleveById(eleveId);
		this.eleveRepository.delete(eleve);
		return ResponseEntity.ok().build();
	}

	
}
