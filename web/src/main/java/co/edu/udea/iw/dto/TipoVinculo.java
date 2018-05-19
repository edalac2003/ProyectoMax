package co.edu.udea.iw.dto;

public class TipoVinculo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer idVinculo;
	private String descripcion;

	public TipoVinculo() {
	}

	public TipoVinculo(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getIdVinculo() {
		return this.idVinculo;
	}

	public void setIdVinculo(Integer idVinculo) {
		this.idVinculo = idVinculo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
