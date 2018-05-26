package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransportersAnnotationTransportTypes.
 * @see hibernate.merlin_hibernate.entities.TransportersAnnotationTransportTypes
 * @author Hibernate Tools
 */
@Stateless
public class TransportersAnnotationTransportTypesHome {

	private static final Log log = LogFactory.getLog(TransportersAnnotationTransportTypesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TransportersAnnotationTransportTypes transientInstance) {
		log.debug("persisting TransportersAnnotationTransportTypes instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TransportersAnnotationTransportTypes persistentInstance) {
		log.debug("removing TransportersAnnotationTransportTypes instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TransportersAnnotationTransportTypes merge(TransportersAnnotationTransportTypes detachedInstance) {
		log.debug("merging TransportersAnnotationTransportTypes instance");
		try {
			TransportersAnnotationTransportTypes result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TransportersAnnotationTransportTypes findById(Integer id) {
		log.debug("getting TransportersAnnotationTransportTypes instance with id: " + id);
		try {
			TransportersAnnotationTransportTypes instance = entityManager
					.find(TransportersAnnotationTransportTypes.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
