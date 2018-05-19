package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Departamento;
import co.edu.udea.iw.dto.Municipio;
import co.edu.udea.iw.utils.exception.ExcepcionesDAO;

public interface MunicipioDAO {
	
	public void insertar(Municipio municipio) throws ExcepcionesDAO;
	
	public void actualizar(Municipio municipio) throws ExcepcionesDAO;
	
	public Municipio obtenerPorId(Integer id) throws ExcepcionesDAO;
	
	public List<Municipio> listarPorDepartamento(Departamento departamento) throws ExcepcionesDAO;
	
	public List<Municipio> listarTodos() throws ExcepcionesDAO;

}
