package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelExperimentSubstrateAffinity.
 * @see hibernate.merlin_hibernate.entities.ModelExperimentSubstrateAffinity
 * @author Hibernate Tools
 */
@Stateless
public class ModelExperimentSubstrateAffinityHome {

	private static final Log log = LogFactory.getLog(ModelExperimentSubstrateAffinityHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ModelExperimentSubstrateAffinity transientInstance) {
		log.debug("persisting ModelExperimentSubstrateAffinity instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ModelExperimentSubstrateAffinity persistentInstance) {
		log.debug("removing ModelExperimentSubstrateAffinity instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ModelExperimentSubstrateAffinity merge(ModelExperimentSubstrateAffinity detachedInstance) {
		log.debug("merging ModelExperimentSubstrateAffinity instance");
		try {
			ModelExperimentSubstrateAffinity result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ModelExperimentSubstrateAffinity findById(ModelExperimentSubstrateAffinityId id) {
		log.debug("getting ModelExperimentSubstrateAffinity instance with id: " + id);
		try {
			ModelExperimentSubstrateAffinity instance = entityManager.find(ModelExperimentSubstrateAffinity.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
