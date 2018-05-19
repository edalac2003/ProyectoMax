package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Terceros;
import co.edu.udea.iw.utils.exception.ExcepcionesDAO;

public interface TercerosDAO {

	public void insertar(Terceros tercero) throws ExcepcionesDAO;
	
	public void actualizar(Terceros tercero) throws ExcepcionesDAO;
	
	public Terceros obtenerPorDocumento(Long documento) throws ExcepcionesDAO;
	
	public List<Terceros> listarTodos() throws ExcepcionesDAO;
}
