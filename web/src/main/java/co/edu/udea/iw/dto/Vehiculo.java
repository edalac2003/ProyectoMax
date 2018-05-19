package co.edu.udea.iw.dto;

public class Vehiculo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer idVehiculo;
	private String placa;
	private String marca;
	private String modelo;
	private Integer estado;

	public Vehiculo() {
	}

	public Vehiculo(String placa, String marca, String modelo, Integer estado) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.estado = estado;
	}

	public Integer getIdVehiculo() {
		return this.idVehiculo;
	}

	public void setIdVehiculo(Integer idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}
}
