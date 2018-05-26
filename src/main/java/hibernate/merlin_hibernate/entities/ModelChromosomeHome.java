package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelChromosome.
 * @see hibernate.merlin_hibernate.entities.ModelChromosome
 * @author Hibernate Tools
 */
@Stateless
public class ModelChromosomeHome {

	private static final Log log = LogFactory.getLog(ModelChromosomeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ModelChromosome transientInstance) {
		log.debug("persisting ModelChromosome instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ModelChromosome persistentInstance) {
		log.debug("removing ModelChromosome instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ModelChromosome merge(ModelChromosome detachedInstance) {
		log.debug("merging ModelChromosome instance");
		try {
			ModelChromosome result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ModelChromosome findById(Integer id) {
		log.debug("getting ModelChromosome instance with id: " + id);
		try {
			ModelChromosome instance = entityManager.find(ModelChromosome.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
