package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelTranscriptionUnit.
 * @see hibernate.merlin_hibernate.entities.ModelTranscriptionUnit
 * @author Hibernate Tools
 */
@Stateless
public class ModelTranscriptionUnitHome {

	private static final Log log = LogFactory.getLog(ModelTranscriptionUnitHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ModelTranscriptionUnit transientInstance) {
		log.debug("persisting ModelTranscriptionUnit instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ModelTranscriptionUnit persistentInstance) {
		log.debug("removing ModelTranscriptionUnit instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ModelTranscriptionUnit merge(ModelTranscriptionUnit detachedInstance) {
		log.debug("merging ModelTranscriptionUnit instance");
		try {
			ModelTranscriptionUnit result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ModelTranscriptionUnit findById(Integer id) {
		log.debug("getting ModelTranscriptionUnit instance with id: " + id);
		try {
			ModelTranscriptionUnit instance = entityManager.find(ModelTranscriptionUnit.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
