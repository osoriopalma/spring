package utng.hibernate;
// Generated 19/10/2016 09:26:32 AM by Hibernate Tools 5.2.0.Beta1

/**
 * Facturacion generated by hbm2java
 */
public class Facturacion implements java.io.Serializable {

	private int idCliente;
	private Cliente cliente;
	private String rfc;
	private String domicilio;

	public Facturacion() {
	}

	public Facturacion(Cliente cliente) {
		this.cliente = cliente;
	}

	public Facturacion(Cliente cliente, String rfc, String domicilio) {
		this.cliente = cliente;
		this.rfc = rfc;
		this.domicilio = domicilio;
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

}
