package fi.oom.office.CVGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CvGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvGeneratorApplication.class, args);
		System.out.println("hello spring world");
	}

}
