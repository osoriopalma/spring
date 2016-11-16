package utng.hbernate3;

import org.hibernate.Query;
import org.hibernate.Session;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Session session = HibernateUtils
    		   .getSessionFactory()
    		   .openSession();
       Query query =
    		   session.createQuery(
    		   "from Categoria c WHERE c.nombre like :nombre");
       	query.setParameter("nombre", "Carn%");
       Categoria categoria = (Categoria) 
    		   query.getSingleResult();
       Producto producto = new Producto(0, categoria,
    		   "Jamon de pierna", "Marca Fud",
    		   10.0F, null);
       session.beginTransaction();
       session.save(producto);
       session.getTransaction().commit();
       
    }
}
