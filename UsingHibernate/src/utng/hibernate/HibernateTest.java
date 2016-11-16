package utng.hibernate;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HibernateTest {

	public static void main(String[] args) {
		Session session = 
			HibernateUtils.getSessionFactory().openSession();
	
		Query query = 
			 session.createQuery(
			"from Categoria WHERE nombre like :cadena");
			query.setParameter("cadena", "Lim%");
			List<Object> resultado = query.list();
		Categoria categoria = (Categoria) resultado.get(0);
		
		
		
		//categoria.setDescripcion("Limpiando el hogar");
		Producto producto = new Producto(0, categoria,
				"Labial", "No se despinta", 150.0f, null);
		
		session.beginTransaction();
		session.delete(categoria);
		//session.save(producto);
		
		session.getTransaction().commit();
		session.close();
		
		
	}
	
}
