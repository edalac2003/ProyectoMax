package co.edu.udea.iw.dto;

public class Departamento implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer idDepartamento;
	private Pais pais;
	private String nombre;
//	private Set municipios = new HashSet(0);

	public Departamento() {
	}

	public Departamento(Pais pais, String nombre) {
		this.pais = pais;
		this.nombre = nombre;
	}

	public Integer getIdDepartamento() {
		return this.idDepartamento;
	}

	public void setIdDepartamento(Integer idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
