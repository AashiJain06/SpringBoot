package in.aj.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StandAloneApplication {

	public static void main(String[] args) {
		System.out.println("Application Started");
		SpringApplication.run(StandAloneApplication.class, args);
		System.out.println("Hello Spring boot");
	}

}
