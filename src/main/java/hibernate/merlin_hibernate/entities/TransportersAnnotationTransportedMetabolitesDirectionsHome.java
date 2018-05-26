package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransportersAnnotationTransportedMetabolitesDirections.
 * @see hibernate.merlin_hibernate.entities.TransportersAnnotationTransportedMetabolitesDirections
 * @author Hibernate Tools
 */
@Stateless
public class TransportersAnnotationTransportedMetabolitesDirectionsHome {

	private static final Log log = LogFactory.getLog(TransportersAnnotationTransportedMetabolitesDirectionsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TransportersAnnotationTransportedMetabolitesDirections transientInstance) {
		log.debug("persisting TransportersAnnotationTransportedMetabolitesDirections instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TransportersAnnotationTransportedMetabolitesDirections persistentInstance) {
		log.debug("removing TransportersAnnotationTransportedMetabolitesDirections instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TransportersAnnotationTransportedMetabolitesDirections merge(
			TransportersAnnotationTransportedMetabolitesDirections detachedInstance) {
		log.debug("merging TransportersAnnotationTransportedMetabolitesDirections instance");
		try {
			TransportersAnnotationTransportedMetabolitesDirections result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TransportersAnnotationTransportedMetabolitesDirections findById(
			TransportersAnnotationTransportedMetabolitesDirectionsId id) {
		log.debug("getting TransportersAnnotationTransportedMetabolitesDirections instance with id: " + id);
		try {
			TransportersAnnotationTransportedMetabolitesDirections instance = entityManager
					.find(TransportersAnnotationTransportedMetabolitesDirections.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
