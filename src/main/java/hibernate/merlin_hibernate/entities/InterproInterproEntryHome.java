package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class InterproInterproEntry.
 * @see hibernate.merlin_hibernate.entities.InterproInterproEntry
 * @author Hibernate Tools
 */
@Stateless
public class InterproInterproEntryHome {

	private static final Log log = LogFactory.getLog(InterproInterproEntryHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(InterproInterproEntry transientInstance) {
		log.debug("persisting InterproInterproEntry instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(InterproInterproEntry persistentInstance) {
		log.debug("removing InterproInterproEntry instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public InterproInterproEntry merge(InterproInterproEntry detachedInstance) {
		log.debug("merging InterproInterproEntry instance");
		try {
			InterproInterproEntry result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public InterproInterproEntry findById(Integer id) {
		log.debug("getting InterproInterproEntry instance with id: " + id);
		try {
			InterproInterproEntry instance = entityManager.find(InterproInterproEntry.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
