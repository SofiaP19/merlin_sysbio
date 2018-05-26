package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class EnzymesAnnotationGenehomologyHasHomologues.
 * @see hibernate.merlin_hibernate.entities.EnzymesAnnotationGenehomologyHasHomologues
 * @author Hibernate Tools
 */
@Stateless
public class EnzymesAnnotationGenehomologyHasHomologuesHome {

	private static final Log log = LogFactory.getLog(EnzymesAnnotationGenehomologyHasHomologuesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(EnzymesAnnotationGenehomologyHasHomologues transientInstance) {
		log.debug("persisting EnzymesAnnotationGenehomologyHasHomologues instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(EnzymesAnnotationGenehomologyHasHomologues persistentInstance) {
		log.debug("removing EnzymesAnnotationGenehomologyHasHomologues instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public EnzymesAnnotationGenehomologyHasHomologues merge(
			EnzymesAnnotationGenehomologyHasHomologues detachedInstance) {
		log.debug("merging EnzymesAnnotationGenehomologyHasHomologues instance");
		try {
			EnzymesAnnotationGenehomologyHasHomologues result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EnzymesAnnotationGenehomologyHasHomologues findById(EnzymesAnnotationGenehomologyHasHomologuesId id) {
		log.debug("getting EnzymesAnnotationGenehomologyHasHomologues instance with id: " + id);
		try {
			EnzymesAnnotationGenehomologyHasHomologues instance = entityManager
					.find(EnzymesAnnotationGenehomologyHasHomologues.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
