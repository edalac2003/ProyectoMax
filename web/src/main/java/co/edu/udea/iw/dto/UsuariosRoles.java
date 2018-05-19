package co.edu.udea.iw.dto;

public class UsuariosRoles implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer idusuariosRoles;
	private Rol rol;
	private Usuario usuario;
	private Integer estado;

	public UsuariosRoles() {
	}

	public UsuariosRoles(Rol rol, Usuario usuario, Integer estado) {
		this.rol = rol;
		this.usuario = usuario;
		this.estado = estado;
	}

	public Integer getIdusuariosRoles() {
		return this.idusuariosRoles;
	}

	public void setIdusuariosRoles(Integer idusuariosRoles) {
		this.idusuariosRoles = idusuariosRoles;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

}
