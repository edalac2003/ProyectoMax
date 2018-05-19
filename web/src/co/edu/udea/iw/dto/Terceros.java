package co.edu.udea.iw.dto;

import java.util.Date;

public class Terceros implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer idTercero;
	private Municipio municipio;
	private TipoCargo tipoCargo;
	private TipoDocumento tipoDocumento;
	private TipoVinculo tipoVinculo;
	private String nombres;
	private String apellidos;
	private Long numeroDocumento;
	private String direccion;
	private Date fechaNacimiento;

	public Terceros() {
	}

	public Terceros(Municipio municipio, TipoCargo tipoCargo, TipoDocumento tipoDocumento, TipoVinculo tipoVinculo,
			String nombres, String apellidos, Long numeroDocumento, String direccion, Date fechaNacimiento) {
		this.municipio = municipio;
		this.tipoCargo = tipoCargo;
		this.tipoDocumento = tipoDocumento;
		this.tipoVinculo = tipoVinculo;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.numeroDocumento = numeroDocumento;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getIdTercero() {
		return this.idTercero;
	}

	public void setIdTercero(Integer idTercero) {
		this.idTercero = idTercero;
	}

	public Municipio getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public TipoCargo getTipoCargo() {
		return this.tipoCargo;
	}

	public void setTipoCargo(TipoCargo tipoCargo) {
		this.tipoCargo = tipoCargo;
	}

	public TipoDocumento getTipoDocumento() {
		return this.tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public TipoVinculo getTipoVinculo() {
		return this.tipoVinculo;
	}

	public void setTipoVinculo(TipoVinculo tipoVinculo) {
		this.tipoVinculo = tipoVinculo;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Long getNumeroDocumento() {
		return this.numeroDocumento;
	}

	public void setNumeroDocumento(Long numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
