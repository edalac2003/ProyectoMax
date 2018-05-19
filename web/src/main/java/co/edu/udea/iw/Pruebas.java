package co.edu.udea.iw;

import co.edu.udea.iw.dao.DepartamentoDAO;
import co.edu.udea.iw.dao.hibernate.DepartamentoDAOHibernate;
import co.edu.udea.iw.dto.Departamento;
import co.edu.udea.iw.dto.Pais;
import co.edu.udea.iw.utils.exception.ExcepcionesDAO;

public class Pruebas {

	public static void main(String[] args) {
		DepartamentoDAO dao = new DepartamentoDAOHibernate();
		Pais pais = new Pais();
		pais.setIdPais(1);
		Departamento dpto = new Departamento();
		dpto.setNombre("BOLIVAR");
		dpto.setPais(pais);
		try {
			dao.insertar(dpto);
		} catch (ExcepcionesDAO e) {
			e.printStackTrace();
		}

	}

}
