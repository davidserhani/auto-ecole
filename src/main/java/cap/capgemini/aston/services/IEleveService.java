package cap.capgemini.aston.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import cap.capgemini.aston.entities.Eleve;

/**
 * @author davidserhani
 *
 */
public interface IEleveService {
	
	/**
	 * @return
	 */
	List<Eleve> getAllEleves();
	
	/**
	 * @param eleve
	 * @return
	 */
	Eleve addEleve(Eleve eleve);
	
	/**
	 * @param eleveId
	 * @return
	 */
	Eleve getEleveById(Long eleveId);
	
	/**
	 * @param eleveId
	 * @param eleveModifie
	 * @return
	 */
	Eleve updateEleve(Long eleveId, Eleve eleveModifie);
	
	/**
	 * @param eleveId
	 * @return
	 */
	ResponseEntity<String> deleteEleve(Long eleveId);
}
