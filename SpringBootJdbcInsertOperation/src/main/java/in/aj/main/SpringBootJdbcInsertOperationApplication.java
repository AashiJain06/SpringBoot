package in.aj.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.aj.main.dao.DaoLayer;
import in.aj.main.entity.User;

@SpringBootApplication
public class SpringBootJdbcInsertOperationApplication implements CommandLineRunner  {

	@Autowired
	private DaoLayer dao;
	public static void main(String[] args) 
 {
		SpringApplication.run(SpringBootJdbcInsertOperationApplication.class, args);
       
 }
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User("Rekha",104,"Hyderabad");
		boolean status = dao.insert(user);
		if(status)
			System.out.println("User inserted Sucessfully");
		else
			System.out.println("User is not inserted succesfully");
		
	}

}
