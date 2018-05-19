package co.edu.udea.iw.ngc;

import java.util.List;

import co.edu.udea.iw.dto.Departamento;
import co.edu.udea.iw.dto.Municipio;
import co.edu.udea.iw.utils.exception.ExcepcionesNGC;

public interface MunicipioNGC {

	public void insertar(Integer idDepartamento, String nombre) throws ExcepcionesNGC;
	
	public void actualizar(Municipio municipio) throws ExcepcionesNGC;
	
	public Municipio obtenerPorId(Integer id) throws ExcepcionesNGC;
	
	public List<Municipio> listarPorDepartamento(Integer idDepartamento) throws ExcepcionesNGC;
	
	public List<Municipio> listarTodos() throws ExcepcionesNGC;
}
