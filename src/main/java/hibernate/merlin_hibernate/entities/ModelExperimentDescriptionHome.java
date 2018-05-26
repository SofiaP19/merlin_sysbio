package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelExperimentDescription.
 * @see hibernate.merlin_hibernate.entities.ModelExperimentDescription
 * @author Hibernate Tools
 */
@Stateless
public class ModelExperimentDescriptionHome {

	private static final Log log = LogFactory.getLog(ModelExperimentDescriptionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ModelExperimentDescription transientInstance) {
		log.debug("persisting ModelExperimentDescription instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ModelExperimentDescription persistentInstance) {
		log.debug("removing ModelExperimentDescription instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ModelExperimentDescription merge(ModelExperimentDescription detachedInstance) {
		log.debug("merging ModelExperimentDescription instance");
		try {
			ModelExperimentDescription result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ModelExperimentDescription findById(ModelExperimentDescriptionId id) {
		log.debug("getting ModelExperimentDescription instance with id: " + id);
		try {
			ModelExperimentDescription instance = entityManager.find(ModelExperimentDescription.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
