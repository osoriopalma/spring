package utng.hibernate;
// Generated 19/10/2016 09:26:32 AM by Hibernate Tools 5.2.0.Beta1

/**
 * VentaDetalle generated by hbm2java
 */
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

	public VentaDetalleId getId() {
		return this.id;
	}

	public void setId(VentaDetalleId id) {
		this.id = id;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Venta getVenta() {
		return this.venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
