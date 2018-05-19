package co.edu.udea.iw.dto;

public class Usuario implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer idUsuario;
	private Terceros terceros;
	private String login;
	private String password;
	private Integer estado;

	public Usuario() {
	}

	public Usuario(Terceros terceros, String login, String password, Integer estado) {
		this.terceros = terceros;
		this.login = login;
		this.password = password;
		this.estado = estado;
	}

	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Terceros getTerceros() {
		return this.terceros;
	}

	public void setTerceros(Terceros terceros) {
		this.terceros = terceros;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}
}
