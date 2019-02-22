package cap.capgemini.aston.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "adresses")
@Data @NoArgsConstructor @AllArgsConstructor
public class Adresse {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idAdresse")
	private Long id;
	private String codePostale;
	private String rue;
	private int numero;
	private String ville;
	private String pays;
	@OneToOne(mappedBy = "adresse")
	@JsonBackReference
	private Eleve eleve;
}
