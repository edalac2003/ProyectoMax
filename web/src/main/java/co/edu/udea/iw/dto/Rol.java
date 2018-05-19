package co.edu.udea.iw.dto;

public class Rol implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer idRol;
	private String nombreRol;
	private Integer estado;

	public Rol() {
	}

	public Rol(String nombreRol, Integer estado) {
		this.nombreRol = nombreRol;
		this.estado = estado;
	}

	public Integer getIdRol() {
		return this.idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getNombreRol() {
		return this.nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}
}
