package in.aj.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.aj.entity.User;

public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg = new Configuration();
       cfg.configure("/in/aj/config/hibernate.cfg.xml");
       SessionFactory sessionFactory = cfg.buildSessionFactory();
       Session session = sessionFactory.openSession();
       Transaction transaction = session.beginTransaction();
       User user = new User();
       user.setName("Riya");
       user.setCity("Indore");
       user.setGender("Female");
       try {
       session.save(user);
       transaction.commit();
       }
       catch(Exception e)
       {
    	   transaction.rollback();
    	   e.printStackTrace();
    	   System.out.println("Errror Ocuured :"+e.getMessage());
       }
       }
}
