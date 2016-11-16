package utng.tienda;
// Generated 12/10/2016 02:06:42 PM by Hibernate Tools 5.2.0.Beta1

import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria implements java.io.Serializable {

	private int idCategoria;
	private String nombre;
	private Set productos = new HashSet(0);

	public Categoria() {
	}

	public Categoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Categoria(int idCategoria, String nombre, Set productos) {
		this.idCategoria = idCategoria;
		this.nombre = nombre;
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

	public Set getProductos() {
		return this.productos;
	}

	public void setProductos(Set productos) {
		this.productos = productos;
	}

}