package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Pais;
import co.edu.udea.iw.utils.exception.ExcepcionesDAO;

public interface PaisDAO {

	public void insertar(Pais pais) throws ExcepcionesDAO;
	
	public void actualizar(Pais pais) throws ExcepcionesDAO;
	
	public Pais obtenerPorID(Integer id) throws ExcepcionesDAO;
	
	public List<Pais> listarTodos() throws ExcepcionesDAO;
}
