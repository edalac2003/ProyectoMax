package co.edu.udea.iw.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.iw.dao.PaisDAO;
import co.edu.udea.iw.dto.Pais;
import co.edu.udea.iw.utils.exception.ExcepcionesDAO;

public class PaisDAOHIbernate extends HibernateDaoSupport implements PaisDAO {

	private Session session = null;
	private Criteria criteria = null;
	private Transaction tx = null;
	private ExcepcionesDAO exDao;
	
	@Override
	public void insertar(Pais pais) throws ExcepcionesDAO {
		try {
			session = getSession();
			tx = session.beginTransaction();
			session.save(pais);
			tx.commit();
		}catch (HibernateException e) {
			tx.rollback();
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al guardar el Pais.");
		}finally {
			session.close();
		}
	}

	@Override
	public void actualizar(Pais pais) throws ExcepcionesDAO {
		try {
			session = getSession();
			tx = session.beginTransaction();
			session.update(pais);
			tx.commit();
		}catch (HibernateException e) {
			tx.rollback();
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al Actualizar el Pais.");
		}finally {
			session.close();
		}
	}

	@Override
	public Pais obtenerPorID(Integer id) throws ExcepcionesDAO {
		try {
			session = getSession();
			criteria = session.createCriteria(Pais.class).add(Restrictions.idEq(id));			
		}catch (HibernateException e) {
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al obtener el Departamentos.");
		}finally {
			session.close();
		}
		return (Pais)criteria.uniqueResult();
		
	}

	@Override
	public List<Pais> listarTodos() throws ExcepcionesDAO {
		try {
			session = getSession();
			criteria = session.createCriteria(Pais.class);
		}catch (HibernateException e) {
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al consultar los Departamentos.");
		}finally {
			session.close();
		}		
		return criteria.list();
	}

}
