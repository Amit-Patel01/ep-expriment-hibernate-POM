package amitmaven01.amithibernate01;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


	public class App {
	    public static void main(String[] args) {
	     Configuration cfg = new Configuration();
	     cfg.configure();
	     
	     SessionFactory fectory = cfg.buildSessionFactory();
	     Session session = fectory.openSession();
	     Transaction tx = session.beginTransaction(); 
	     Employee e = new Employee();
	     		
	     e.setId(1);
	     e.setName("Amittt");
	     e.setSalary(2000000.34);
	  
	     session.persist(e);
	     tx.commit(); 
	     session.close();
	     fectory.close();

	        System.out.println("Employee saved successfully!");
	     
	    }
	}

