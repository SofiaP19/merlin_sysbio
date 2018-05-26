package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelSequence.
 * @see hibernate.merlin_hibernate.entities.ModelSequence
 * @author Hibernate Tools
 */
@Stateless
public class ModelSequenceHome {

	private static final Log log = LogFactory.getLog(ModelSequenceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ModelSequence transientInstance) {
		log.debug("persisting ModelSequence instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ModelSequence persistentInstance) {
		log.debug("removing ModelSequence instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ModelSequence merge(ModelSequence detachedInstance) {
		log.debug("merging ModelSequence instance");
		try {
			ModelSequence result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ModelSequence findById(Integer id) {
		log.debug("getting ModelSequence instance with id: " + id);
		try {
			ModelSequence instance = entityManager.find(ModelSequence.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
