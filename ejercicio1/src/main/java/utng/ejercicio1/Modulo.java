package utng.ejercicio1;
// Generated 11/10/2016 01:24:29 PM by Hibernate Tools 5.2.0.Beta1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Modulo generated by hbm2java
 */
@Entity
@Table(name = "modulo", schema = "public")
public class Modulo implements java.io.Serializable {

	private long idModulo;
	private String nombre;
	private String ruta;

	public Modulo() {
	}

	public Modulo(long idModulo) {
		this.idModulo = idModulo;
	}

	public Modulo(long idModulo, String nombre, String ruta) {
		this.idModulo = idModulo;
		this.nombre = nombre;
		this.ruta = ruta;
	}

	@Id

	@Column(name = "id_modulo", unique = true, nullable = false)
	public long getIdModulo() {
		return this.idModulo;
	}

	public void setIdModulo(long idModulo) {
		this.idModulo = idModulo;
	}

	@Column(name = "nombre", length = 100)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "ruta", length = 150)
	public String getRuta() {
		return this.ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

}