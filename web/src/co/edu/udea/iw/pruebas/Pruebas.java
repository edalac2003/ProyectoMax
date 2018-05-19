package co.edu.udea.iw.pruebas;

import java.util.List;

import co.edu.udea.iw.dao.PaisDAO;
import co.edu.udea.iw.dao.hibernate.PaisDAOHIbernate;
import co.edu.udea.iw.dto.Pais;
import co.edu.udea.iw.utils.exception.ExcepcionesDAO;

/**
 * Pruebas!
 *
 */
public class Pruebas {
	
	
    public static void main( String[] args ){
    	PaisDAO paisDao = new PaisDAOHIbernate();
    	
    	try {
			List<Pais> listaPais = paisDao.listarTodos();
			for(Pais pais : listaPais) {
				System.out.println( "Pais : " + pais.getNombre() );
			}
		} catch (ExcepcionesDAO e) {
			e.printStackTrace();
		}
        
    }
}
