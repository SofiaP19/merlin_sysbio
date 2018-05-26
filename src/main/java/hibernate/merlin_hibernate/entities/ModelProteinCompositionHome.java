package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelProteinComposition.
 * @see hibernate.merlin_hibernate.entities.ModelProteinComposition
 * @author Hibernate Tools
 */
@Stateless
public class ModelProteinCompositionHome {

	private static final Log log = LogFactory.getLog(ModelProteinCompositionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ModelProteinComposition transientInstance) {
		log.debug("persisting ModelProteinComposition instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ModelProteinComposition persistentInstance) {
		log.debug("removing ModelProteinComposition instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ModelProteinComposition merge(ModelProteinComposition detachedInstance) {
		log.debug("merging ModelProteinComposition instance");
		try {
			ModelProteinComposition result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ModelProteinComposition findById(ModelProteinCompositionId id) {
		log.debug("getting ModelProteinComposition instance with id: " + id);
		try {
			ModelProteinComposition instance = entityManager.find(ModelProteinComposition.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
