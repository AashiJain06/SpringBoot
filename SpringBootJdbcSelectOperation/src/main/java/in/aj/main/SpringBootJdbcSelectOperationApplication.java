package in.aj.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.aj.main.dao.DaoLayer;
import in.aj.main.entity.User;

@SpringBootApplication
public class SpringBootJdbcSelectOperationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcSelectOperationApplication.class, args);
	}
	@Autowired
	private DaoLayer dao;

	@Override
	public void run(String... args) throws Exception {
	
		List<User> al = dao.select();
		for(User us : al )
		{
			System.out.println("Name : "+ us.getName());
			
			System.out.println("Roll No. : "+ us.getRoll());
			
			System.out.println("City : "+ us.getCity());
			System.out.println("----------------");
			
		}
	}

}
