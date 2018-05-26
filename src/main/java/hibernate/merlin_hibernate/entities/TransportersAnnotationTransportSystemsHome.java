package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransportersAnnotationTransportSystems.
 * @see hibernate.merlin_hibernate.entities.TransportersAnnotationTransportSystems
 * @author Hibernate Tools
 */
@Stateless
public class TransportersAnnotationTransportSystemsHome {

	private static final Log log = LogFactory.getLog(TransportersAnnotationTransportSystemsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TransportersAnnotationTransportSystems transientInstance) {
		log.debug("persisting TransportersAnnotationTransportSystems instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TransportersAnnotationTransportSystems persistentInstance) {
		log.debug("removing TransportersAnnotationTransportSystems instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TransportersAnnotationTransportSystems merge(TransportersAnnotationTransportSystems detachedInstance) {
		log.debug("merging TransportersAnnotationTransportSystems instance");
		try {
			TransportersAnnotationTransportSystems result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TransportersAnnotationTransportSystems findById(Integer id) {
		log.debug("getting TransportersAnnotationTransportSystems instance with id: " + id);
		try {
			TransportersAnnotationTransportSystems instance = entityManager
					.find(TransportersAnnotationTransportSystems.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
