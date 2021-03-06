package utng.hbernate3;
// Generated 19/10/2016 11:33:55 AM by Hibernate Tools 5.2.0.Beta1

import java.util.HashSet;
import java.util.Set;

/**
 * TipoContacto generated by hbm2java
 */
public class TipoContacto implements java.io.Serializable {

	private int idTipoContacto;
	private String nombre;
	private Set contactos = new HashSet(0);

	public TipoContacto() {
	}

	public TipoContacto(int idTipoContacto) {
		this.idTipoContacto = idTipoContacto;
	}

	public TipoContacto(int idTipoContacto, String nombre, Set contactos) {
		this.idTipoContacto = idTipoContacto;
		this.nombre = nombre;
		this.contactos = contactos;
	}

	public int getIdTipoContacto() {
		return this.idTipoContacto;
	}

	public void setIdTipoContacto(int idTipoContacto) {
		this.idTipoContacto = idTipoContacto;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set getContactos() {
		return this.contactos;
	}

	public void setContactos(Set contactos) {
		this.contactos = contactos;
	}

}
