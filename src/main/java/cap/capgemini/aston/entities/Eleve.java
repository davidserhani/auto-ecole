package cap.capgemini.aston.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "eleves")
@Data @NoArgsConstructor @AllArgsConstructor
public class Eleve {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idClient")
	private Long id;
	private String nom;
	private String prenom;
	private String DateDeNaissance;
}
