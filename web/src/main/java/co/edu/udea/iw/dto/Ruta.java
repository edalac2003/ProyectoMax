package co.edu.udea.iw.dto;

import java.util.Date;

public class Ruta implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer idRuta;
	private Municipio municipioByCiudadDestino;
	private Municipio municipioByCiudadOrigen;
	private Terceros terceros;
	private Vehiculo vehiculo;
	private Date fechaSalida;
	private Date fechaRegreso;

	public Ruta() {
	}

	public Ruta(Municipio municipioByCiudadDestino, Municipio municipioByCiudadOrigen, Terceros terceros,
			Vehiculo vehiculo, Date fechaSalida, Date fechaRegreso) {
		this.municipioByCiudadDestino = municipioByCiudadDestino;
		this.municipioByCiudadOrigen = municipioByCiudadOrigen;
		this.terceros = terceros;
		this.vehiculo = vehiculo;
		this.fechaSalida = fechaSalida;
		this.fechaRegreso = fechaRegreso;
	}

	public Integer getIdRuta() {
		return this.idRuta;
	}

	public void setIdRuta(Integer idRuta) {
		this.idRuta = idRuta;
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

	public Terceros getTerceros() {
		return this.terceros;
	}

	public void setTerceros(Terceros terceros) {
		this.terceros = terceros;
	}

	public Vehiculo getVehiculo() {
		return this.vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Date getFechaSalida() {
		return this.fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Date getFechaRegreso() {
		return this.fechaRegreso;
	}

	public void setFechaRegreso(Date fechaRegreso) {
		this.fechaRegreso = fechaRegreso;
	}
}
