package co.edu.udea.iw.dto;

public class Pais implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer idPais;
	private String nombre;
//	private Set departamentos = new HashSet(0);

	public Pais() {
	}

	public Pais(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdPais() {
		return this.idPais;
	}

	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
