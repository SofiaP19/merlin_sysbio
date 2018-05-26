package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class EnzymesAnnotationProductrankHasOrganism.
 * @see hibernate.merlin_hibernate.entities.EnzymesAnnotationProductrankHasOrganism
 * @author Hibernate Tools
 */
@Stateless
public class EnzymesAnnotationProductrankHasOrganismHome {

	private static final Log log = LogFactory.getLog(EnzymesAnnotationProductrankHasOrganismHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(EnzymesAnnotationProductrankHasOrganism transientInstance) {
		log.debug("persisting EnzymesAnnotationProductrankHasOrganism instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(EnzymesAnnotationProductrankHasOrganism persistentInstance) {
		log.debug("removing EnzymesAnnotationProductrankHasOrganism instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public EnzymesAnnotationProductrankHasOrganism merge(EnzymesAnnotationProductrankHasOrganism detachedInstance) {
		log.debug("merging EnzymesAnnotationProductrankHasOrganism instance");
		try {
			EnzymesAnnotationProductrankHasOrganism result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EnzymesAnnotationProductrankHasOrganism findById(EnzymesAnnotationProductrankHasOrganismId id) {
		log.debug("getting EnzymesAnnotationProductrankHasOrganism instance with id: " + id);
		try {
			EnzymesAnnotationProductrankHasOrganism instance = entityManager
					.find(EnzymesAnnotationProductrankHasOrganism.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
