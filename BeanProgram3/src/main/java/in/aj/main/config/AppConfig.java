package in.aj.main.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.aj.main.beans.Student;

@Configuration
public class AppConfig {
	
@Bean
public CommandLineRunner cmdLineRunner()
    {
	  return new CommandLineRunner() {
		
		@Override
		public void run(String... args) throws Exception {
			
			student1().display();
			System.out.println("-------------------------");
			student2().display();
		}
	};
	}
@Bean
public Student student1()
{
	return new Student("Aashi",101,90.2f);
}
@Bean
public Student student2()
{
	return new Student("Riya",103,90.2f);
}
}
