package in.aj.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.aj.main.enitiy.Student;
import in.aj.main.service.StudentService;
import in.aj.main.service.StudentServiceImpl;

@SpringBootApplication
public class SpringBootWithJpaSelectOperationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootWithJpaSelectOperationApplication.class, args);
		StudentService stdService = context.getBean(StudentServiceImpl.class);
//	    List<Student> std = stdService.getStudent();
//	    (std != null)
//	    {
//	    	for(Student st : std)
//	    	{
//	    		System.out.println("Name :"+st.getName());
//	    		System.out.println("City :"+st.getCity());
//	    		System.out.println("Gender :"+st.getGender());
//	    		System.out.println("----------------------------");
//	    	}
//	    }
//	    else
//	    	System.out.println("User is not selected");
		Student st = stdService.getStudentById(1L);
		if (st != null) {

			System.out.println("Name :" + st.getName());
			System.out.println("City :" + st.getCity());
			System.out.println("Gender :" + st.getGender());
			System.out.println("----------------------------");
		} else
			System.out.println("User is not selected");
	}
}
