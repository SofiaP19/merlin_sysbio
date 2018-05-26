package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelCompound.
 * @see hibernate.merlin_hibernate.entities.ModelCompound
 * @author Hibernate Tools
 */
@Stateless
public class ModelCompoundHome {

	private static final Log log = LogFactory.getLog(ModelCompoundHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ModelCompound transientInstance) {
		log.debug("persisting ModelCompound instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ModelCompound persistentInstance) {
		log.debug("removing ModelCompound instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ModelCompound merge(ModelCompound detachedInstance) {
		log.debug("merging ModelCompound instance");
		try {
			ModelCompound result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ModelCompound findById(Integer id) {
		log.debug("getting ModelCompound instance with id: " + id);
		try {
			ModelCompound instance = entityManager.find(ModelCompound.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
