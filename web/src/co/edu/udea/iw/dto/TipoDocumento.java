package co.edu.udea.iw.dto;

public class TipoDocumento implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer idtipoDocumento;
	private String descripcion;
	private String sigla;

	public TipoDocumento() {
	}

	public TipoDocumento(String descripcion, String sigla) {
		this.descripcion = descripcion;
		this.sigla = sigla;
	}

	public Integer getIdtipoDocumento() {
		return this.idtipoDocumento;
	}

	public void setIdtipoDocumento(Integer idtipoDocumento) {
		this.idtipoDocumento = idtipoDocumento;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}
