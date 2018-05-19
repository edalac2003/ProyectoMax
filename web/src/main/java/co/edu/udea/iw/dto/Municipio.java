package co.edu.udea.iw.dto;

public class Municipio implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer idMunicipio;
	private Departamento departamento;
	private String nombre;
	
	public Municipio() {
	}

	public Municipio(Departamento departamento, String nombre) {
		super();
		this.departamento = departamento;
		this.nombre = nombre;
	}


	public Integer getIdMunicipio() {
		return this.idMunicipio;
	}

	public void setIdMunicipio(Integer idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public Departamento getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
