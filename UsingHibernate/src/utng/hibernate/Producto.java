package utng.hibernate;
// Generated 13/10/2016 02:32:09 PM by Hibernate Tools 5.2.0.Beta1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Producto generated by hbm2java
 */
@Entity
@Table(name = "producto", schema = "public")
public class Producto implements java.io.Serializable {

	private int idProducto;
	private Categoria categoria;
	private String nombre;
	private String descripcion;
	private Float precio;
	private Set<VentaDetalle> ventaDetalles = new HashSet<VentaDetalle>(0);

	public Producto() {
	}

	public Producto(int idProducto) {
		this.idProducto = idProducto;
	}

	public Producto(int idProducto, Categoria categoria, String nombre, String descripcion, Float precio,
			Set<VentaDetalle> ventaDetalles) {
		this.idProducto = idProducto;
		this.categoria = categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.ventaDetalles = ventaDetalles;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_producto", unique = true, nullable = false)
	public int getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_categoria")
	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Column(name = "nombre", length = 20)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion", length = 200)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "precio", precision = 8, scale = 8)
	public Float getPrecio() {
		return this.precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
	public Set<VentaDetalle> getVentaDetalles() {
		return this.ventaDetalles;
	}

	public void setVentaDetalles(Set<VentaDetalle> ventaDetalles) {
		this.ventaDetalles = ventaDetalles;
	}

}
