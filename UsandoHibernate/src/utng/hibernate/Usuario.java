package utng.hibernate;
// Generated 18/10/2016 01:39:10 PM by Hibernate Tools 5.2.0.Beta1

/**
 * Usuario generated by hbm2java
 */
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

	public long getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getContrasenia() {
		return this.contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Long getIdRol() {
		return this.idRol;
	}

	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}

}
