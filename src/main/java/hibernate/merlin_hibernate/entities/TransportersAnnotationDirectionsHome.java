package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransportersAnnotationDirections.
 * @see hibernate.merlin_hibernate.entities.TransportersAnnotationDirections
 * @author Hibernate Tools
 */
@Stateless
public class TransportersAnnotationDirectionsHome {

	private static final Log log = LogFactory.getLog(TransportersAnnotationDirectionsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TransportersAnnotationDirections transientInstance) {
		log.debug("persisting TransportersAnnotationDirections instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TransportersAnnotationDirections persistentInstance) {
		log.debug("removing TransportersAnnotationDirections instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TransportersAnnotationDirections merge(TransportersAnnotationDirections detachedInstance) {
		log.debug("merging TransportersAnnotationDirections instance");
		try {
			TransportersAnnotationDirections result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TransportersAnnotationDirections findById(Integer id) {
		log.debug("getting TransportersAnnotationDirections instance with id: " + id);
		try {
			TransportersAnnotationDirections instance = entityManager.find(TransportersAnnotationDirections.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
