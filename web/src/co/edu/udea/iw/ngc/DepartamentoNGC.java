package co.edu.udea.iw.ngc;

import java.util.List;

import co.edu.udea.iw.dto.Departamento;
import co.edu.udea.iw.utils.exception.ExcepcionesNGC;

public interface DepartamentoNGC {

	public void insertar(Departamento departamento) throws ExcepcionesNGC;
	
	public void actualizar(Departamento departamento) throws ExcepcionesNGC;
	
	public Departamento obtenerPorId(Integer id) throws ExcepcionesNGC;
	
	public List<Departamento> listarTodos() throws ExcepcionesNGC;
}
