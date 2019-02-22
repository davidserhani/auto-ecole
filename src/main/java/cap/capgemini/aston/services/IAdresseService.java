package cap.capgemini.aston.services;

import cap.capgemini.aston.entities.Adresse;

public interface IAdresseService {
	Adresse getAdresseByEleveId(Long eleveId);
	Adresse createAdresse(Long eleveId, Adresse adresse);
}
