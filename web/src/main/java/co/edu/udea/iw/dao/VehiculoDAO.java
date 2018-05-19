package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Vehiculo;
import co.edu.udea.iw.utils.exception.ExcepcionesDAO;

public interface VehiculoDAO {

	public void insertar(Vehiculo vehiculo) throws ExcepcionesDAO;
	
	public void actualizar(Vehiculo vehiculo) throws ExcepcionesDAO;
	
	public Vehiculo obtenerPorID(Long id) throws ExcepcionesDAO;
	
	public Vehiculo obtenerPorPlaca(String placa) throws ExcepcionesDAO;
	
	public List<Vehiculo> listarTodos() throws ExcepcionesDAO;
	
}
