package in.aj.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.aj.main.entity.Student;
import in.aj.main.service.StudentService;
import in.aj.main.service.StudentServiceImpl;

@SpringBootApplication
public class SpringBootWithJpaApplication {

	public static void main(String[] args) {
		
	ApplicationContext context = SpringApplication.run(SpringBootWithJpaApplication.class, args);
	StudentService stdService = context.getBean(StudentServiceImpl.class);
	Student std = new Student();
	std.setName("Aashi");
	std.setCity("Indore");
	std.setEmail("Aaashijain@gmail.com");
    boolean status = stdService.insertStudent(std);
    if(status)
    {
    	System.out.println("user inserted successfully");
    }
    else
    {
    	System.out.println("user is not inserted");
    }
	}

}
