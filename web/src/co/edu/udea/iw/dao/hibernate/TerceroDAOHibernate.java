package co.edu.udea.iw.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.iw.dao.TercerosDAO;
import co.edu.udea.iw.dto.Departamento;
import co.edu.udea.iw.dto.Terceros;
import co.edu.udea.iw.utils.exception.ExcepcionesDAO;

public class TerceroDAOHibernate extends HibernateDaoSupport implements TercerosDAO {

	private Session session = null;
	private Criteria criteria = null;
	private Transaction tx = null;
	private ExcepcionesDAO exDao;
	
//	@Override
	public void insertar(Terceros tercero) throws ExcepcionesDAO {
		try {
			session = getSession();
			tx = session.beginTransaction();
			session.save(tercero);
			tx.commit();
		}catch (HibernateException e) {
			tx.rollback();
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al guardar el tercero.");
		}finally {
			session.close();
		}
	}

//	@Override
	public void actualizar(Terceros tercero) throws ExcepcionesDAO {
		try {
			session = getSession();
			tx = session.beginTransaction();
			session.update(tercero);
			tx.commit();
		}catch (HibernateException e) {
			tx.rollback();
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al actualizar el tercero.");
		}finally {
			session.close();
		}
	}

//	@Override
	public Terceros obtenerPorDocumento(Long documento) throws ExcepcionesDAO {
		try {
			session = getSession();
			criteria = session.createCriteria(Departamento.class).add(Restrictions.eq("numeroDocumento", documento));			
		}catch (HibernateException e) {
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al obtener el Tercero.");
		}finally {
			session.close();
		}
		return (Terceros)criteria.uniqueResult();
	}

//	@Override
	public List<Terceros> listarTodos() throws ExcepcionesDAO {
		try {
			session = getSession();
			criteria = session.createCriteria(Terceros.class);
		}catch (HibernateException e) {
			exDao = new ExcepcionesDAO(e);
			exDao.setMsgTecnico(e.getMessage());
			exDao.setMsgUsuario("Error al consultar los Terceros.");
		}finally {
			session.close();
		}		
		return criteria.list();
	}

}
