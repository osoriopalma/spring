package utng.hbernate3;
// Generated 19/10/2016 11:33:55 AM by Hibernate Tools 5.2.0.Beta1

import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria implements java.io.Serializable {

	private int idCategoria;
	private String nombre;
	private String descripcion;
	private Set<Producto> productos = new HashSet(0);

	public Categoria() {
	}

	public Categoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Categoria(int idCategoria, String nombre, String descripcion, Set productos) {
		this.idCategoria = idCategoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.productos = productos;
	}

	public int getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
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

	public Set getProductos() {
		return this.productos;
	}

	public void setProductos(Set productos) {
		this.productos = productos;
	}

}