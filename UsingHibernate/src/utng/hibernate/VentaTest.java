package utng.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class VentaTest {

	public static void main(String[] args) {
		Session session = 
			HibernateUtils.getSessionFactory().openSession();
		
		Cliente cliente = new Cliente(0,
				"Juan", "Perez", "Sanchez",
				null, null, null);
		
		Venta venta = new Venta(0,
				cliente, new Date(),
				null);
		Query query = 
				session.createQuery(
				   "from Categoria where id=:idBusqueda");
		query.setParameter("idBusqueda", 1);
		List<Categoria> resultado = query.list();
		Categoria categoria =  resultado.get(0);
		Producto producto1 = new Producto(0, categoria,
				"Jamon",
				"Jamon de pierna",
				80.0f, null);
		Producto producto2 = new Producto(0, categoria,
				"Queso de puerco",
				"Capistrano",
				90.0f, null);
		Producto producto3 = new Producto(0, categoria,
				"Salchicha",
				"Aroos",
				45.0f, null);
		
		session.beginTransaction();
		session.save(cliente);
		session.save(venta);
		session.save(producto1);
		session.save(producto2);
		session.save(producto3);
		VentaDetalle detalle1 = 
				new VentaDetalle(new VentaDetalleId(
						producto1.getIdProducto(),
						venta.getIdVenta()),
						producto1, venta, 1);
		VentaDetalle detalle2 = 
				new VentaDetalle(new VentaDetalleId(
						producto2.getIdProducto(),
						venta.getIdVenta()),
						producto2, venta,2);
		VentaDetalle detalle3 = 
				new VentaDetalle(new VentaDetalleId(
						producto3.getIdProducto(),
						venta.getIdVenta()),
						producto3, venta,3);

		session.save(detalle1);
		session.save(detalle2);
		session.save(detalle3);
		session.getTransaction().commit();
		session.close();
	}

}
