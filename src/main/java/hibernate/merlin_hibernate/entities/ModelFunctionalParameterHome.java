package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelFunctionalParameter.
 * @see hibernate.merlin_hibernate.entities.ModelFunctionalParameter
 * @author Hibernate Tools
 */
@Stateless
public class ModelFunctionalParameterHome {

	private static final Log log = LogFactory.getLog(ModelFunctionalParameterHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ModelFunctionalParameter transientInstance) {
		log.debug("persisting ModelFunctionalParameter instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ModelFunctionalParameter persistentInstance) {
		log.debug("removing ModelFunctionalParameter instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ModelFunctionalParameter merge(ModelFunctionalParameter detachedInstance) {
		log.debug("merging ModelFunctionalParameter instance");
		try {
			ModelFunctionalParameter result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ModelFunctionalParameter findById(ModelFunctionalParameterId id) {
		log.debug("getting ModelFunctionalParameter instance with id: " + id);
		try {
			ModelFunctionalParameter instance = entityManager.find(ModelFunctionalParameter.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
