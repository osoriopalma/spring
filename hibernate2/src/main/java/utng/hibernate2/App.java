package utng.hibernate2;

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
       Categoria categoria = new Categoria();
       categoria.setDescripcion("Abarrotes del hogar");
       categoria.setNombre("Abarrote");
       categoria.setIdCategoria(0);
       session.beginTransaction();
       session.save(categoria);
       session.getTransaction().commit();
       
    }
}
