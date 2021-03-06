package utng.hibernate;
// Generated 13/10/2016 02:32:09 PM by Hibernate Tools 5.2.0.Beta1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ContactoId generated by hbm2java
 */
@Embeddable
public class ContactoId implements java.io.Serializable {

	private int idCliente;
	private int idContacto;

	public ContactoId() {
	}

	public ContactoId(int idCliente, int idContacto) {
		this.idCliente = idCliente;
		this.idContacto = idContacto;
	}

	@Column(name = "id_cliente", nullable = false)
	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	@Column(name = "id_contacto", nullable = false)
	public int getIdContacto() {
		return this.idContacto;
	}

	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ContactoId))
			return false;
		ContactoId castOther = (ContactoId) other;

		return (this.getIdCliente() == castOther.getIdCliente()) && (this.getIdContacto() == castOther.getIdContacto());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCliente();
		result = 37 * result + this.getIdContacto();
		return result;
	}

}
