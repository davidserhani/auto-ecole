package cap.capgemini.aston.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "seances")
@Data @NoArgsConstructor @AllArgsConstructor
public class Seance {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSeance")
	private Long id;
	private String date;
}
