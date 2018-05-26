package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class EnzymesAnnotationGenehomology.
 * @see hibernate.merlin_hibernate.entities.EnzymesAnnotationGenehomology
 * @author Hibernate Tools
 */
@Stateless
public class EnzymesAnnotationGenehomologyHome {

	private static final Log log = LogFactory.getLog(EnzymesAnnotationGenehomologyHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(EnzymesAnnotationGenehomology transientInstance) {
		log.debug("persisting EnzymesAnnotationGenehomology instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(EnzymesAnnotationGenehomology persistentInstance) {
		log.debug("removing EnzymesAnnotationGenehomology instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public EnzymesAnnotationGenehomology merge(EnzymesAnnotationGenehomology detachedInstance) {
		log.debug("merging EnzymesAnnotationGenehomology instance");
		try {
			EnzymesAnnotationGenehomology result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EnzymesAnnotationGenehomology findById(Integer id) {
		log.debug("getting EnzymesAnnotationGenehomology instance with id: " + id);
		try {
			EnzymesAnnotationGenehomology instance = entityManager.find(EnzymesAnnotationGenehomology.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
