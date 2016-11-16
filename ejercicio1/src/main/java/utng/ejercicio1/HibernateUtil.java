package utng.ejercicio1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = 
			createSessionFactory();

	private static SessionFactory createSessionFactory() {
		
		return new Configuration()
				.configure().buildSessionFactory();	
	}
	
	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	
	public static void shutdown(){
		getSessionfactory().close();
	}
}
