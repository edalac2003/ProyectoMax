package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Encomienda;
import co.edu.udea.iw.utils.exception.ExcepcionesDAO;

public interface EncomiendaDAO {
	
	public void insertar(Encomienda encomienda) throws ExcepcionesDAO;
	
	public void actualizar(Encomienda encomienda) throws ExcepcionesDAO;
	
	public Encomienda obtenerPorID(Long id) throws ExcepcionesDAO;
	
	public List<Encomienda> listarTodos() throws ExcepcionesDAO;
}
