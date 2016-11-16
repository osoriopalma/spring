package utng.ejercicio1;
// Generated 11/10/2016 01:24:29 PM by Hibernate Tools 5.2.0.Beta1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario", schema = "public")
public class Usuario implements java.io.Serializable {

	private long idUsuario;
	private String contrasenia;
	private String nombreUsuario;
	private Long idRol;

	public Usuario() {
	}

	public Usuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Usuario(long idUsuario, String contrasenia, String nombreUsuario, Long idRol) {
		this.idUsuario = idUsuario;
		this.contrasenia = contrasenia;
		this.nombreUsuario = nombreUsuario;
		this.idRol = idRol;
	}

	@Id

	@Column(name = "id_usuario", unique = true, nullable = false)
	public long getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Column(name = "contrasenia", length = 40)
	public String getContrasenia() {
		return this.contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	@Column(name = "nombre_usuario", length = 10)
	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	@Column(name = "id_rol")
	public Long getIdRol() {
		return this.idRol;
	}

	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}

}
