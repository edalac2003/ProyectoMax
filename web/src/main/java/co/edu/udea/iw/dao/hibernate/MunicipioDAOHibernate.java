package co.edu.udea.iw.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.iw.dao.MunicipioDAO;
import co.edu.udea.iw.dto.Departamento;
import co.edu.udea.iw.dto.Municipio;
import co.edu.udea.iw.utils.exception.ExcepcionesDAO;


public class MunicipioDAOHibernate extends HibernateDaoSupport implements MunicipioDAO {

	private Session session = null;
	private Criteria criteria = null;
	private Transaction tx = null;
	private ExcepcionesDAO exDao;
	
//	@Override
	public void insertar(Municipio municipio) throws ExcepcionesDAO {
		try {
			session = getSession();
			tx = session.beginTransaction();
			session.save(municipio);
			tx.commit();
		}catch (HibernateException e) {
			tx.rollback();
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al guardar el municipio.");
		}finally {
			session.close();
		}
	}

//	@Override
	public void actualizar(Municipio municipio) throws ExcepcionesDAO {
		try {
			session = getSession();
			tx = session.beginTransaction();
			session.update(municipio);
			tx.commit();
		}catch (HibernateException e) {
			tx.rollback();
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al actualizar el Municipio.");
		}finally {
			session.close();
		}

	}

//	@Override
	public Municipio obtenerPorId(Integer id) throws ExcepcionesDAO {
		try {
			session = getSession();
			criteria = session.createCriteria(Municipio.class).add(Restrictions.idEq(id));			
		}catch (HibernateException e) {
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al obtener el Municipio.");
		}finally {
			session.close();
		}
		return (Municipio)criteria.uniqueResult();
	}

//	@Override
	public List<Municipio> listarPorDepartamento(Departamento departamento) throws ExcepcionesDAO {
		try {
			session = getSession();
			criteria = session.createCriteria(Municipio.class).add(Restrictions.eq("departamento", departamento));
		}catch (HibernateException e) {
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al consultar los Municipios por Departamento.");
		}finally {
			session.close();
		}		
		return criteria.list();
	}

//	@Override
	public List<Municipio> listarTodos() throws ExcepcionesDAO {
		try {
			session = getSession();
			criteria = session.createCriteria(Municipio.class);
		}catch (HibernateException e) {
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al consultar los Municipios.");
		}finally {
			session.close();
		}		
		return criteria.list();
	}

}
