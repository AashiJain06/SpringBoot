package in.aj.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import in.aj.main.beans.Student;

@SpringBootApplication
public class BeanProgram2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BeanProgram2Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	
		student().display();
		
	}
	@Bean
	public Student student()
	{
		return new Student("Aashi",1010,90.2f);
	}

}
