package co.edu.udea.iw.ngc;

import java.util.List;

import co.edu.udea.iw.dto.Terceros;
import co.edu.udea.iw.utils.exception.ExcepcionesNGC;

public interface TercerosNGC {
	
	public void insertar(Terceros tercero) throws ExcepcionesNGC;
	
	public void actualizar(Terceros tercero) throws ExcepcionesNGC;
	
	public Terceros obtenerPorDocumento(Long documento) throws ExcepcionesNGC;
	
	public List<Terceros> listarTodos() throws ExcepcionesNGC;
}
