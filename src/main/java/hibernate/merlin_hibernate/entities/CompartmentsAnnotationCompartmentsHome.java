package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CompartmentsAnnotationCompartments.
 * @see hibernate.merlin_hibernate.entities.CompartmentsAnnotationCompartments
 * @author Hibernate Tools
 */
@Stateless
public class CompartmentsAnnotationCompartmentsHome {

	private static final Log log = LogFactory.getLog(CompartmentsAnnotationCompartmentsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CompartmentsAnnotationCompartments transientInstance) {
		log.debug("persisting CompartmentsAnnotationCompartments instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CompartmentsAnnotationCompartments persistentInstance) {
		log.debug("removing CompartmentsAnnotationCompartments instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CompartmentsAnnotationCompartments merge(CompartmentsAnnotationCompartments detachedInstance) {
		log.debug("merging CompartmentsAnnotationCompartments instance");
		try {
			CompartmentsAnnotationCompartments result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CompartmentsAnnotationCompartments findById(Integer id) {
		log.debug("getting CompartmentsAnnotationCompartments instance with id: " + id);
		try {
			CompartmentsAnnotationCompartments instance = entityManager.find(CompartmentsAnnotationCompartments.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
