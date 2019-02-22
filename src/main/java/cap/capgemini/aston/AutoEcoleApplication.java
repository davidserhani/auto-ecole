package cap.capgemini.aston;

import java.time.Instant;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import cap.capgemini.aston.dao.IEleveRepository;
import cap.capgemini.aston.entities.Eleve;

@SpringBootApplication
@EnableJpaAuditing
public class AutoEcoleApplication implements CommandLineRunner {

	@Autowired
	private IEleveRepository eleveRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AutoEcoleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		eleveRepository.save(new Eleve(null, "bob", "square-sponge", Date.from(Instant.parse("1985-02-04T00:00:00.000Z")), null));
		eleveRepository.save(new Eleve(null, "bruce", "wayne", Date.from(Instant.parse("1985-02-04T00:00:00.000Z")) , null));
		eleveRepository.save(new Eleve(null, "naruto", "uzumaki",Date.from(Instant.parse("1985-02-04T00:00:00.000Z")), null));
	}

}
