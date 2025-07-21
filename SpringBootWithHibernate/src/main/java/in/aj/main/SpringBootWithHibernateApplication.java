package in.aj.main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.aj.main.entity.User;

@SpringBootApplication
public class SpringBootWithHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithHibernateApplication.class, args);
	    Configuration cfg = new Configuration();
		cfg.configure("/in/aj/main/config/hibernate.cfg.xml");
	     SessionFactory sessionFactory = cfg.buildSessionFactory();
	     Session session = sessionFactory.openSession();
	     User user =session.get(User.class, 1);
	     System.out.println("Name:"+user.getName());
	     System.out.println("City:"+user.getCity());
	     System.out.println("Gender:"+user.getGender());
	    
	}

}
