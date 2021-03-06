package utng.tienda;
// Generated 12/10/2016 02:06:42 PM by Hibernate Tools 5.2.0.Beta1

/**
 * Producto generated by hbm2java
 */
public class Producto implements java.io.Serializable {

	private int idProducto;
	private Categoria categoria;

	public Producto() {
	}

	public Producto(int idProducto) {
		this.idProducto = idProducto;
	}

	public Producto(int idProducto, Categoria categoria) {
		this.idProducto = idProducto;
		this.categoria = categoria;
	}

	public int getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
