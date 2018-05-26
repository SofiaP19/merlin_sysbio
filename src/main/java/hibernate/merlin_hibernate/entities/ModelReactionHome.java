package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelReaction.
 * @see hibernate.merlin_hibernate.entities.ModelReaction
 * @author Hibernate Tools
 */
@Stateless
public class ModelReactionHome {

	private static final Log log = LogFactory.getLog(ModelReactionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ModelReaction transientInstance) {
		log.debug("persisting ModelReaction instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ModelReaction persistentInstance) {
		log.debug("removing ModelReaction instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ModelReaction merge(ModelReaction detachedInstance) {
		log.debug("merging ModelReaction instance");
		try {
			ModelReaction result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ModelReaction findById(Integer id) {
		log.debug("getting ModelReaction instance with id: " + id);
		try {
			ModelReaction instance = entityManager.find(ModelReaction.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
