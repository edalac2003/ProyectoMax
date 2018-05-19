package co.edu.udea.iw.dto;

public class Encomienda implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer idEncomienda;
	private Municipio municipioByCiudadDestino;
	private Municipio municipioByCiudadOrigen;
	private Terceros tercerosByTerceroDestinatario;
	private Terceros tercerosByTerceroRemitente;
	private String descripcion;
	private Double alto;
	private Double ancho;
	private Double profundidad;
	private Double peso;
	private Long cobroNeto;
	private Long valorSeguro;
	private Long valorComercial;
//	private Set envioses = new HashSet(0);

	public Encomienda() {
	}

	public Integer getIdEncomienda() {
		return this.idEncomienda;
	}

	public void setIdEncomienda(Integer idEncomienda) {
		this.idEncomienda = idEncomienda;
	}

	public Municipio getMunicipioByCiudadDestino() {
		return this.municipioByCiudadDestino;
	}

	public void setMunicipioByCiudadDestino(Municipio municipioByCiudadDestino) {
		this.municipioByCiudadDestino = municipioByCiudadDestino;
	}

	public Municipio getMunicipioByCiudadOrigen() {
		return this.municipioByCiudadOrigen;
	}

	public void setMunicipioByCiudadOrigen(Municipio municipioByCiudadOrigen) {
		this.municipioByCiudadOrigen = municipioByCiudadOrigen;
	}

	public Terceros getTercerosByTerceroDestinatario() {
		return this.tercerosByTerceroDestinatario;
	}

	public void setTercerosByTerceroDestinatario(Terceros tercerosByTerceroDestinatario) {
		this.tercerosByTerceroDestinatario = tercerosByTerceroDestinatario;
	}

	public Terceros getTercerosByTerceroRemitente() {
		return this.tercerosByTerceroRemitente;
	}

	public void setTercerosByTerceroRemitente(Terceros tercerosByTerceroRemitente) {
		this.tercerosByTerceroRemitente = tercerosByTerceroRemitente;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getAlto() {
		return alto;
	}

	public void setAlto(Double alto) {
		this.alto = alto;
	}

	public Double getAncho() {
		return ancho;
	}

	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}

	public Double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Long getCobroNeto() {
		return cobroNeto;
	}

	public void setCobroNeto(Long cobroNeto) {
		this.cobroNeto = cobroNeto;
	}

	public Long getValorSeguro() {
		return valorSeguro;
	}

	public void setValorSeguro(Long valorSeguro) {
		this.valorSeguro = valorSeguro;
	}

	public Long getValorComercial() {
		return valorComercial;
	}

	public void setValorComercial(Long valorComercial) {
		this.valorComercial = valorComercial;
	}

}
