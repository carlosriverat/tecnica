package gov.cgr.holamundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"gov.cgr.holamundo"})
public class AplicacionHolaMundo {

	public static void main(String[] args) {
		SpringApplication.run(AplicacionHolaMundo.class, args);
	}

}
