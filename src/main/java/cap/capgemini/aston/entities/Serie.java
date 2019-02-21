package cap.capgemini.aston.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "series")
public class Serie {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
}
