package utng.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	private static final SessionFactory 
	SESSION_FACTORY = createSessionFactory();

	private static SessionFactory createSessionFactory() {
		return new Configuration()
				.configure().buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
	
	public static void shutdown(){
		getSessionFactory().close();
	}

}
