package utng.hibernate;

import org.hibernate.Session;

public class TestHibernate {
	
	public static void main(String[] args) {
		Session session = HibernateUtils
				.getSessionFactory()
				.openSession();
		
		/*Issue issue = new Issue();
		issue.setDescription("Le duele la rodilla.");
		issue.setType("Fisico");
		issue.setAffiliate(new Affiliate());
		issue.setId(0);*/
		
		MedicalCenter medicalCenter = 
				new MedicalCenter(2, "Siempreviva 33",
						"Aqui se mueren todos", null, 
						null);
		
		session.beginTransaction();
		session.save(medicalCenter);
		session.getTransaction().commit();
		session.close();
	}
}
