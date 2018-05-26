package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class EnzymesAnnotationScorerconfig.
 * @see hibernate.merlin_hibernate.entities.EnzymesAnnotationScorerconfig
 * @author Hibernate Tools
 */
@Stateless
public class EnzymesAnnotationScorerconfigHome {

	private static final Log log = LogFactory.getLog(EnzymesAnnotationScorerconfigHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(EnzymesAnnotationScorerconfig transientInstance) {
		log.debug("persisting EnzymesAnnotationScorerconfig instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(EnzymesAnnotationScorerconfig persistentInstance) {
		log.debug("removing EnzymesAnnotationScorerconfig instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public EnzymesAnnotationScorerconfig merge(EnzymesAnnotationScorerconfig detachedInstance) {
		log.debug("merging EnzymesAnnotationScorerconfig instance");
		try {
			EnzymesAnnotationScorerconfig result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EnzymesAnnotationScorerconfig findById(EnzymesAnnotationScorerconfigId id) {
		log.debug("getting EnzymesAnnotationScorerconfig instance with id: " + id);
		try {
			EnzymesAnnotationScorerconfig instance = entityManager.find(EnzymesAnnotationScorerconfig.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
