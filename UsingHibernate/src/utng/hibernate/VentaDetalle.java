package utng.hibernate;
// Generated 13/10/2016 02:32:09 PM by Hibernate Tools 5.2.0.Beta1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * VentaDetalle generated by hbm2java
 */
@Entity
@Table(name = "venta_detalle", schema = "public")
public class VentaDetalle implements java.io.Serializable {

	private VentaDetalleId id;
	private Producto producto;
	private Venta venta;
	private Integer cantidad;

	public VentaDetalle() {
	}

	public VentaDetalle(VentaDetalleId id, Producto producto, Venta venta) {
		this.id = id;
		this.producto = producto;
		this.venta = venta;
	}

	public VentaDetalle(VentaDetalleId id, Producto producto, Venta venta, Integer cantidad) {
		this.id = id;
		this.producto = producto;
		this.venta = venta;
		this.cantidad = cantidad;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idProducto", column = @Column(name = "id_producto", nullable = false)),
			@AttributeOverride(name = "idVenta", column = @Column(name = "id_venta", nullable = false)) })
	public VentaDetalleId getId() {
		return this.id;
	}

	public void setId(VentaDetalleId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_producto", nullable = false, insertable = false, updatable = false)
	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_venta", nullable = false, insertable = false, updatable = false)
	public Venta getVenta() {
		return this.venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	@Column(name = "cantidad")
	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}