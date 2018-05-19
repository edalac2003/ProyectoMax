package co.edu.udea.iw.dto;

public class Envios implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer idEnvio;
	private Encomienda encomienda;
	private EstadoEnvio estadoEnvio;
	private Ruta ruta;
	private String fechaEnvio;
	private String fechaEntrega;
	private String observaciones;

	public Envios() {
	}

	public Envios(Encomienda encomienda, EstadoEnvio estadoEnvio, Ruta ruta, String fechaEnvio, String fechaEntrega,
			String observaciones) {
		this.encomienda = encomienda;
		this.estadoEnvio = estadoEnvio;
		this.ruta = ruta;
		this.fechaEnvio = fechaEnvio;
		this.fechaEntrega = fechaEntrega;
		this.observaciones = observaciones;
	}

	public Integer getIdEnvio() {
		return this.idEnvio;
	}

	public void setIdEnvio(Integer idEnvio) {
		this.idEnvio = idEnvio;
	}

	public Encomienda getEncomienda() {
		return this.encomienda;
	}

	public void setEncomienda(Encomienda encomienda) {
		this.encomienda = encomienda;
	}

	public EstadoEnvio getEstadoEnvio() {
		return this.estadoEnvio;
	}

	public void setEstadoEnvio(EstadoEnvio estadoEnvio) {
		this.estadoEnvio = estadoEnvio;
	}

	public Ruta getRuta() {
		return this.ruta;
	}

	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

	public String getFechaEnvio() {
		return this.fechaEnvio;
	}

	public void setFechaEnvio(String fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	public String getFechaEntrega() {
		return this.fechaEntrega;
	}

	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}
