package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelEntityisfrom.
 * @see hibernate.merlin_hibernate.entities.ModelEntityisfrom
 * @author Hibernate Tools
 */
@Stateless
public class ModelEntityisfromHome {

	private static final Log log = LogFactory.getLog(ModelEntityisfromHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ModelEntityisfrom transientInstance) {
		log.debug("persisting ModelEntityisfrom instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ModelEntityisfrom persistentInstance) {
		log.debug("removing ModelEntityisfrom instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ModelEntityisfrom merge(ModelEntityisfrom detachedInstance) {
		log.debug("merging ModelEntityisfrom instance");
		try {
			ModelEntityisfrom result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ModelEntityisfrom findById(ModelEntityisfromId id) {
		log.debug("getting ModelEntityisfrom instance with id: " + id);
		try {
			ModelEntityisfrom instance = entityManager.find(ModelEntityisfrom.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
