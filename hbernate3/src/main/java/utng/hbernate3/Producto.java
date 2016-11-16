package utng.hbernate3;
// Generated 19/10/2016 11:33:55 AM by Hibernate Tools 5.2.0.Beta1

import java.util.HashSet;
import java.util.Set;

/**
 * Producto generated by hbm2java
 */
public class Producto implements java.io.Serializable {

	private int idProducto;
	private Categoria categoria;
	private String nombre;
	private String descripcion;
	private Float precio;
	private Set ventaDetalles = new HashSet(0);

	public Producto() {
	}

	public Producto(int idProducto) {
		this.idProducto = idProducto;
	}

	public Producto(int idProducto, Categoria categoria, String nombre, String descripcion, Float precio,
			Set ventaDetalles) {
		this.idProducto = idProducto;
		this.categoria = categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.ventaDetalles = ventaDetalles;
	}

	public int getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Float getPrecio() {
		return this.precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Set getVentaDetalles() {
		return this.ventaDetalles;
	}

	public void setVentaDetalles(Set ventaDetalles) {
		this.ventaDetalles = ventaDetalles;
	}

}
