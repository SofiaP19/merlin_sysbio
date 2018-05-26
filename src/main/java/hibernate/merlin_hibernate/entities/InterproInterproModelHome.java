package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class InterproInterproModel.
 * @see hibernate.merlin_hibernate.entities.InterproInterproModel
 * @author Hibernate Tools
 */
@Stateless
public class InterproInterproModelHome {

	private static final Log log = LogFactory.getLog(InterproInterproModelHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(InterproInterproModel transientInstance) {
		log.debug("persisting InterproInterproModel instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(InterproInterproModel persistentInstance) {
		log.debug("removing InterproInterproModel instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public InterproInterproModel merge(InterproInterproModel detachedInstance) {
		log.debug("merging InterproInterproModel instance");
		try {
			InterproInterproModel result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public InterproInterproModel findById(String id) {
		log.debug("getting InterproInterproModel instance with id: " + id);
		try {
			InterproInterproModel instance = entityManager.find(InterproInterproModel.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
