package co.edu.udea.iw.dto;

public class TipoCargo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer idCargo;
	private String descripcion;

	public TipoCargo() {
	}

	public TipoCargo(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getIdCargo() {
		return this.idCargo;
	}

	public void setIdCargo(Integer idCargo) {
		this.idCargo = idCargo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
