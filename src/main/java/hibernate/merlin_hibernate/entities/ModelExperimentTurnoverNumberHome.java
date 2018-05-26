package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelExperimentTurnoverNumber.
 * @see hibernate.merlin_hibernate.entities.ModelExperimentTurnoverNumber
 * @author Hibernate Tools
 */
@Stateless
public class ModelExperimentTurnoverNumberHome {

	private static final Log log = LogFactory.getLog(ModelExperimentTurnoverNumberHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ModelExperimentTurnoverNumber transientInstance) {
		log.debug("persisting ModelExperimentTurnoverNumber instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ModelExperimentTurnoverNumber persistentInstance) {
		log.debug("removing ModelExperimentTurnoverNumber instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ModelExperimentTurnoverNumber merge(ModelExperimentTurnoverNumber detachedInstance) {
		log.debug("merging ModelExperimentTurnoverNumber instance");
		try {
			ModelExperimentTurnoverNumber result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ModelExperimentTurnoverNumber findById(ModelExperimentTurnoverNumberId id) {
		log.debug("getting ModelExperimentTurnoverNumber instance with id: " + id);
		try {
			ModelExperimentTurnoverNumber instance = entityManager.find(ModelExperimentTurnoverNumber.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
