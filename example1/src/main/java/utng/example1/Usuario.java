package utng.example1;
// Generated 11/10/2016 10:59:36 AM by Hibernate Tools 5.2.0.Beta1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario", schema = "public")
public class Usuario implements java.io.Serializable {

	private long idUsuario;
	private Rol rol;
	private String contrasenia;
	private String nombreUsuario;

	public Usuario() {
	}

	public Usuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Usuario(long idUsuario, Rol rol, String contrasenia, String nombreUsuario) {
		this.idUsuario = idUsuario;
		this.rol = rol;
		this.contrasenia = contrasenia;
		this.nombreUsuario = nombreUsuario;
	}

	@Id

	@Column(name = "id_usuario", unique = true, nullable = false)
	public long getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_rol")
	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
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

}
