package utng.hibernate;
// Generated 10/10/2016 02:58:52 PM by Hibernate Tools 5.2.0.Beta1

import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol implements java.io.Serializable {

	private long idRol;
	private String nombre;
	private Set usuarios = new HashSet(0);

	public Rol() {
	}

	public Rol(long idRol) {
		this.idRol = idRol;
	}

	public Rol(long idRol, String nombre, Set usuarios) {
		this.idRol = idRol;
		this.nombre = nombre;
		this.usuarios = usuarios;
	}

	public long getIdRol() {
		return this.idRol;
	}

	public void setIdRol(long idRol) {
		this.idRol = idRol;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set usuarios) {
		this.usuarios = usuarios;
	}

}