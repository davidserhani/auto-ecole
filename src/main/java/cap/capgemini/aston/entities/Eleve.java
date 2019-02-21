package cap.capgemini.aston.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author davidserhani
 *
 */
@Entity(name = "eleves")
@Data @NoArgsConstructor @AllArgsConstructor
public class Eleve extends AuditModel {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEleve")
	private Long id;
	@NotNull
	@Size(max = 100)
	private String nom;
	@NotNull
	@Size(max = 100)
	private String prenom;
	private Date DateDeNaissance;
}
