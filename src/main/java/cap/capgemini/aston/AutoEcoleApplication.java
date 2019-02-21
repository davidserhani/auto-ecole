package cap.capgemini.aston;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AutoEcoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoEcoleApplication.class, args);
	}

}
