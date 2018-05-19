package co.edu.udea.iw.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.iw.dao.EncomiendaDAO;
import co.edu.udea.iw.dto.Encomienda;
import co.edu.udea.iw.utils.exception.ExcepcionesDAO;

public class EncomiendaDAOHibernate extends HibernateDaoSupport implements EncomiendaDAO {
	private Session session = null;
	private Criteria criteria = null;
	private Transaction tx = null;
	private ExcepcionesDAO exDao;
	
	@Override
	public void insertar(Encomienda encomienda) throws ExcepcionesDAO {
		try {
			session = getSession();
			tx = session.beginTransaction();
			session.save(encomienda);
			tx.commit();
		}catch (HibernateException e) {
			tx.rollback();
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al guardar Encomienda.");
		}finally {
			session.close();
		}

	}

	@Override
	public void actualizar(Encomienda encomienda) throws ExcepcionesDAO {
		try {
			session = getSession();
			tx = session.beginTransaction();
			session.update(encomienda);
			tx.commit();
		}catch (HibernateException e) {
			tx.rollback();
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al Actualizar datos de la Encomienda.");
		}finally {
			session.close();
		}

	}

	@Override
	public Encomienda obtenerPorID(Long id) throws ExcepcionesDAO {
		try {
			session = getSession();
			criteria = session.createCriteria(Encomienda.class).add(Restrictions.idEq(id));			
		}catch (HibernateException e) {
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al obtener el Departamentos.");
		}finally {
			session.close();
		}
		return (Encomienda)criteria.uniqueResult();
	}

	@Override
	public List<Encomienda> listarTodos() throws ExcepcionesDAO {
		try {
			session = getSession();
			criteria = session.createCriteria(Encomienda.class);
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
