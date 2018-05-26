package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransportersAnnotationGenesHasTcdbRegistries.
 * @see hibernate.merlin_hibernate.entities.TransportersAnnotationGenesHasTcdbRegistries
 * @author Hibernate Tools
 */
@Stateless
public class TransportersAnnotationGenesHasTcdbRegistriesHome {

	private static final Log log = LogFactory.getLog(TransportersAnnotationGenesHasTcdbRegistriesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TransportersAnnotationGenesHasTcdbRegistries transientInstance) {
		log.debug("persisting TransportersAnnotationGenesHasTcdbRegistries instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TransportersAnnotationGenesHasTcdbRegistries persistentInstance) {
		log.debug("removing TransportersAnnotationGenesHasTcdbRegistries instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TransportersAnnotationGenesHasTcdbRegistries merge(
			TransportersAnnotationGenesHasTcdbRegistries detachedInstance) {
		log.debug("merging TransportersAnnotationGenesHasTcdbRegistries instance");
		try {
			TransportersAnnotationGenesHasTcdbRegistries result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TransportersAnnotationGenesHasTcdbRegistries findById(TransportersAnnotationGenesHasTcdbRegistriesId id) {
		log.debug("getting TransportersAnnotationGenesHasTcdbRegistries instance with id: " + id);
		try {
			TransportersAnnotationGenesHasTcdbRegistries instance = entityManager
					.find(TransportersAnnotationGenesHasTcdbRegistries.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
