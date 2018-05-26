package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class EnzymesAnnotationProductlist.
 * @see hibernate.merlin_hibernate.entities.EnzymesAnnotationProductlist
 * @author Hibernate Tools
 */
@Stateless
public class EnzymesAnnotationProductlistHome {

	private static final Log log = LogFactory.getLog(EnzymesAnnotationProductlistHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(EnzymesAnnotationProductlist transientInstance) {
		log.debug("persisting EnzymesAnnotationProductlist instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(EnzymesAnnotationProductlist persistentInstance) {
		log.debug("removing EnzymesAnnotationProductlist instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public EnzymesAnnotationProductlist merge(EnzymesAnnotationProductlist detachedInstance) {
		log.debug("merging EnzymesAnnotationProductlist instance");
		try {
			EnzymesAnnotationProductlist result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EnzymesAnnotationProductlist findById(Integer id) {
		log.debug("getting EnzymesAnnotationProductlist instance with id: " + id);
		try {
			EnzymesAnnotationProductlist instance = entityManager.find(EnzymesAnnotationProductlist.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
