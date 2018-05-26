package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelSubstrateAffinity.
 * @see hibernate.merlin_hibernate.entities.ModelSubstrateAffinity
 * @author Hibernate Tools
 */
@Stateless
public class ModelSubstrateAffinityHome {

	private static final Log log = LogFactory.getLog(ModelSubstrateAffinityHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ModelSubstrateAffinity transientInstance) {
		log.debug("persisting ModelSubstrateAffinity instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ModelSubstrateAffinity persistentInstance) {
		log.debug("removing ModelSubstrateAffinity instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ModelSubstrateAffinity merge(ModelSubstrateAffinity detachedInstance) {
		log.debug("merging ModelSubstrateAffinity instance");
		try {
			ModelSubstrateAffinity result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ModelSubstrateAffinity findById(ModelSubstrateAffinityId id) {
		log.debug("getting ModelSubstrateAffinity instance with id: " + id);
		try {
			ModelSubstrateAffinity instance = entityManager.find(ModelSubstrateAffinity.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
