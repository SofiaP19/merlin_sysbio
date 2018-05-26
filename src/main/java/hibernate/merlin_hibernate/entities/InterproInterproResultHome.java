package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class InterproInterproResult.
 * @see hibernate.merlin_hibernate.entities.InterproInterproResult
 * @author Hibernate Tools
 */
@Stateless
public class InterproInterproResultHome {

	private static final Log log = LogFactory.getLog(InterproInterproResultHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(InterproInterproResult transientInstance) {
		log.debug("persisting InterproInterproResult instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(InterproInterproResult persistentInstance) {
		log.debug("removing InterproInterproResult instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public InterproInterproResult merge(InterproInterproResult detachedInstance) {
		log.debug("merging InterproInterproResult instance");
		try {
			InterproInterproResult result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public InterproInterproResult findById(Integer id) {
		log.debug("getting InterproInterproResult instance with id: " + id);
		try {
			InterproInterproResult instance = entityManager.find(InterproInterproResult.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}