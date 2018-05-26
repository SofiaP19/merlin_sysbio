package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class EnzymesAnnotationHomologues.
 * @see hibernate.merlin_hibernate.entities.EnzymesAnnotationHomologues
 * @author Hibernate Tools
 */
@Stateless
public class EnzymesAnnotationHomologuesHome {

	private static final Log log = LogFactory.getLog(EnzymesAnnotationHomologuesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(EnzymesAnnotationHomologues transientInstance) {
		log.debug("persisting EnzymesAnnotationHomologues instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(EnzymesAnnotationHomologues persistentInstance) {
		log.debug("removing EnzymesAnnotationHomologues instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public EnzymesAnnotationHomologues merge(EnzymesAnnotationHomologues detachedInstance) {
		log.debug("merging EnzymesAnnotationHomologues instance");
		try {
			EnzymesAnnotationHomologues result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EnzymesAnnotationHomologues findById(Integer id) {
		log.debug("getting EnzymesAnnotationHomologues instance with id: " + id);
		try {
			EnzymesAnnotationHomologues instance = entityManager.find(EnzymesAnnotationHomologues.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
