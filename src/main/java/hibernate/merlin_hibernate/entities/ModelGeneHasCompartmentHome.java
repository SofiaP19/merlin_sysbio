package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelGeneHasCompartment.
 * @see hibernate.merlin_hibernate.entities.ModelGeneHasCompartment
 * @author Hibernate Tools
 */
@Stateless
public class ModelGeneHasCompartmentHome {

	private static final Log log = LogFactory.getLog(ModelGeneHasCompartmentHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ModelGeneHasCompartment transientInstance) {
		log.debug("persisting ModelGeneHasCompartment instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ModelGeneHasCompartment persistentInstance) {
		log.debug("removing ModelGeneHasCompartment instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ModelGeneHasCompartment merge(ModelGeneHasCompartment detachedInstance) {
		log.debug("merging ModelGeneHasCompartment instance");
		try {
			ModelGeneHasCompartment result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ModelGeneHasCompartment findById(ModelGeneHasCompartmentId id) {
		log.debug("getting ModelGeneHasCompartment instance with id: " + id);
		try {
			ModelGeneHasCompartment instance = entityManager.find(ModelGeneHasCompartment.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
