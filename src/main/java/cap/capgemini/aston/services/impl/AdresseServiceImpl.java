package cap.capgemini.aston.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cap.capgemini.aston.dao.IAdresseRepository;
import cap.capgemini.aston.dao.IEleveRepository;
import cap.capgemini.aston.entities.Adresse;
import cap.capgemini.aston.exceptions.RessourceNotFoundException;
import cap.capgemini.aston.services.IAdresseService;

@Service
public class AdresseServiceImpl implements IAdresseService {

	@Autowired
	private IEleveRepository eleveRepository;
	
	@Autowired
	private IAdresseRepository adresseRepository;
	
	
	@Override
	public Adresse getAdresseByEleveId(Long eleveId) {
		return this.adresseRepository.findByEleveId(eleveId);
	}

	@Override
	public Adresse createAdresse(Long eleveId, Adresse adresse) {
		return this.eleveRepository.findById(eleveId).map(eleve -> {
				eleve.setAdresse(adresse);
				return this.adresseRepository.save(adresse);
		}).orElseThrow(() -> new RessourceNotFoundException("eleve", "id", eleveId));
	}

}
