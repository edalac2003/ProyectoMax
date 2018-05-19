package co.edu.udea.iw.ngc;

import java.util.Date;
import java.util.List;

import co.edu.udea.iw.dto.Municipio;
import co.edu.udea.iw.dto.Terceros;
import co.edu.udea.iw.dto.TipoCargo;
import co.edu.udea.iw.dto.TipoDocumento;
import co.edu.udea.iw.dto.TipoVinculo;
import co.edu.udea.iw.utils.exception.ExcepcionesNGC;

public interface TercerosNGC {
	
	public void insertar(Municipio municipio, TipoCargo tipoCargo, TipoDocumento tipoDocumento, TipoVinculo tipoVinculo,
			String nombres, String apellidos, Long numeroDocumento, String direccion, Date fechaNacimiento) throws ExcepcionesNGC;
	
	public Terceros obtenerPorDocumento(Long documento) throws ExcepcionesNGC;
	
	public List<Terceros> listarTodos() throws ExcepcionesNGC;
}
