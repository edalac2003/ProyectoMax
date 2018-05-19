package co.edu.udea.iw.ngc.impl;

import java.util.List;

import co.edu.udea.iw.dao.DepartamentoDAO;
import co.edu.udea.iw.dto.Departamento;
import co.edu.udea.iw.ngc.DepartamentoNGC;
import co.edu.udea.iw.utils.exception.ExcepcionesDAO;
import co.edu.udea.iw.utils.exception.ExcepcionesNGC;

public class DepartamentoNGCImpl implements DepartamentoNGC {
	private ExcepcionesNGC expNgc;
	private DepartamentoDAO departamentoDao;

	@Override
	public void insertar(Departamento departamento) throws ExcepcionesNGC {
		if(departamento != null) {
			if(departamento.getPais() != null) {
				try {
					if(!departamentoDao.existeDepartamento(departamento.getIdDepartamento())) {
						departamentoDao.actualizar(departamento);
					}else {
						expNgc = new ExcepcionesNGC("El departamento ya Existe.");
						throw expNgc;
					}					
				} catch (ExcepcionesDAO e) {
					expNgc = new ExcepcionesNGC(e);
					expNgc.setMsgTecnico(e.getMsgTecnico());
					expNgc.setMsgUsuario(e.getMsgUsuario());
					throw expNgc;
				}
			}else {
				expNgc = new ExcepcionesNGC("El departamento debe tener un pais asignado.");
				throw expNgc;
			}
		}else {
			expNgc = new ExcepcionesNGC("El departamento no puede ser nulo.");
			throw expNgc;
		}
	}

	@Override
	public void actualizar(Departamento departamento) throws ExcepcionesNGC {
		if(departamento != null) {
			if(departamento.getPais() != null) {
				try {
					if(departamentoDao.existeDepartamento(departamento.getIdDepartamento())) {
						departamentoDao.actualizar(departamento);
					}else {
						expNgc = new ExcepcionesNGC("El Departamento no Existe.");
						throw expNgc;
					}
				} catch (ExcepcionesDAO e) {
					expNgc = new ExcepcionesNGC(e);
					expNgc.setMsgTecnico(e.getMsgTecnico());
					expNgc.setMsgUsuario(e.getMsgUsuario());
					throw expNgc;
				}
			}else {
				expNgc = new ExcepcionesNGC("El departamento debe tener un pais asignado.");
				throw expNgc;
			}
		}else {
			expNgc = new ExcepcionesNGC("El departamento no puede ser nulo.");
			throw expNgc;
		}
	}

	@Override
	public Departamento obtenerPorId(Integer id) throws ExcepcionesNGC {
		Departamento dpto = null;
		if(id != null && id > 0) {
			try {
				dpto = departamentoDao.obtenerPorId(id);
			} catch (ExcepcionesDAO e) {
				expNgc = new ExcepcionesNGC(e);
				expNgc.setMsgTecnico(e.getMsgTecnico());
				expNgc.setMsgUsuario(e.getMsgUsuario());
				throw expNgc;
			}
		}else {
			expNgc = new ExcepcionesNGC("Debe ingresar un id válido.");
			throw expNgc;
		}
		return dpto;
	}

	@Override
	public List<Departamento> listarTodos() throws ExcepcionesNGC {
		List<Departamento> lista = null;
		
		try {
			lista = departamentoDao.listarTodos();
		} catch (ExcepcionesDAO e) {
			expNgc = new ExcepcionesNGC(e);
			expNgc.setMsgTecnico(e.getMsgTecnico());
			expNgc.setMsgUsuario(e.getMsgUsuario());
			throw expNgc;
		}
		return lista;
	}

	public void setDepartamentoDao(DepartamentoDAO departamentoDao) {
		this.departamentoDao = departamentoDao;
	}
}
