package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Departamento;
import co.edu.udea.iw.utils.exception.ExcepcionesDAO;

public interface DepartamentoDAO {
	
	public void insertar(Departamento departamento) throws ExcepcionesDAO;
	
	public void actualizar(Departamento departamento) throws ExcepcionesDAO;
	
	public Departamento obtenerPorId(Integer id) throws ExcepcionesDAO;
	
	public Boolean existeDepartamento(Integer id) throws ExcepcionesDAO;
	
	public List<Departamento> listarTodos() throws ExcepcionesDAO;

}
