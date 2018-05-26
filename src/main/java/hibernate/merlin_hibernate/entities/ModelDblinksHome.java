package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelDblinks.
 * @see hibernate.merlin_hibernate.entities.ModelDblinks
 * @author Hibernate Tools
 */
@Stateless
public class ModelDblinksHome {

	private static final Log log = LogFactory.getLog(ModelDblinksHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ModelDblinks transientInstance) {
		log.debug("persisting ModelDblinks instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ModelDblinks persistentInstance) {
		log.debug("removing ModelDblinks instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ModelDblinks merge(ModelDblinks detachedInstance) {
		log.debug("merging ModelDblinks instance");
		try {
			ModelDblinks result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ModelDblinks findById(ModelDblinksId id) {
		log.debug("getting ModelDblinks instance with id: " + id);
		try {
			ModelDblinks instance = entityManager.find(ModelDblinks.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
