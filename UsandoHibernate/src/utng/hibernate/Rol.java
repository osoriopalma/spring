package utng.hibernate;
// Generated 18/10/2016 01:39:10 PM by Hibernate Tools 5.2.0.Beta1

/**
 * Rol generated by hbm2java
 */
public class Rol implements java.io.Serializable {

	private long idRol;
	private String nombre;

	public Rol() {
	}

	public Rol(long idRol) {
		this.idRol = idRol;
	}

	public Rol(long idRol, String nombre) {
		this.idRol = idRol;
		this.nombre = nombre;
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

}
