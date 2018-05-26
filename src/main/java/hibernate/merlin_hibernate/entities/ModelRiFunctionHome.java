package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelRiFunction.
 * @see hibernate.merlin_hibernate.entities.ModelRiFunction
 * @author Hibernate Tools
 */
@Stateless
public class ModelRiFunctionHome {

	private static final Log log = LogFactory.getLog(ModelRiFunctionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ModelRiFunction transientInstance) {
		log.debug("persisting ModelRiFunction instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ModelRiFunction persistentInstance) {
		log.debug("removing ModelRiFunction instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ModelRiFunction merge(ModelRiFunction detachedInstance) {
		log.debug("merging ModelRiFunction instance");
		try {
			ModelRiFunction result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ModelRiFunction findById(Integer id) {
		log.debug("getting ModelRiFunction instance with id: " + id);
		try {
			ModelRiFunction instance = entityManager.find(ModelRiFunction.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
