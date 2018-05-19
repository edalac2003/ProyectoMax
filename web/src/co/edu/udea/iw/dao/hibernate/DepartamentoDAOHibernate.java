package co.edu.udea.iw.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.iw.dao.DepartamentoDAO;
import co.edu.udea.iw.dto.Departamento;
import co.edu.udea.iw.utils.exception.ExcepcionesDAO;

public class DepartamentoDAOHibernate extends HibernateDaoSupport implements DepartamentoDAO {

	private Session session = null;
	private Criteria criteria = null;
	private Transaction tx = null;
	private ExcepcionesDAO exDao;
	
	public void insertar(Departamento departamento) throws ExcepcionesDAO {
		try {
			session = getSession();
			tx = session.beginTransaction();
			session.save(departamento);
			tx.commit();
		}catch (HibernateException e) {
			tx.rollback();
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al guardar el Departamento.");
		}finally {
			session.close();
		}
	}

	public void actualizar(Departamento departamento) throws ExcepcionesDAO {
		try {
			session = getSession();
			tx = session.beginTransaction();
			session.update(departamento);
			tx.commit();
		}catch (HibernateException e) {
			tx.rollback();
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al Actualizar el Departamento.");
		}finally {
			session.close();
		}
		
	}

	public Departamento obtenerPorId(Integer id) throws ExcepcionesDAO {
		try {
			session = getSession();
			criteria = session.createCriteria(Departamento.class).add(Restrictions.idEq(id));			
		}catch (HibernateException e) {
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al obtener el Departamentos.");
		}finally {
			session.close();
		}
		return (Departamento)criteria.uniqueResult();
	}

	
	public List<Departamento> listarTodos() throws ExcepcionesDAO {
		try {
			session = getSession();
			criteria = session.createCriteria(Departamento.class);
		}catch (HibernateException e) {
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al consultar los Departamentos.");
		}finally {
			session.close();
		}		
		return criteria.list();
	}

	@Override
	public Boolean existeDepartamento(Integer id) throws ExcepcionesDAO {
		Boolean existe = false;
		
		try {
			session = getSession();
			criteria = session.createCriteria(Departamento.class).add(Restrictions.idEq(id));
			if(criteria != null)
				existe = true;
		}catch (HibernateException e) {
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al consultar los Departamentos.");
		}finally {
			session.close();
		}	
		
		return existe;
	}
	
	

}
