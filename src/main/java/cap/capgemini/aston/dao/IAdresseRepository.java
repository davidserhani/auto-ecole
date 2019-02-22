package cap.capgemini.aston.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cap.capgemini.aston.entities.Adresse;

@Repository
public interface IAdresseRepository extends JpaRepository<Adresse, Long>{

	Adresse findByEleveId(Long eleveId);

}
