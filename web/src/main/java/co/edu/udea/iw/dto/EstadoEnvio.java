package co.edu.udea.iw.dto;

public class EstadoEnvio implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer idEstadoEnvio;
	private String descripcion;

	public EstadoEnvio() {
	}

	public EstadoEnvio(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getIdEstadoEnvio() {
		return this.idEstadoEnvio;
	}

	public void setIdEstadoEnvio(Integer idEstadoEnvio) {
		this.idEstadoEnvio = idEstadoEnvio;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
