package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelProtein.
 * @see hibernate.merlin_hibernate.entities.ModelProtein
 * @author Hibernate Tools
 */
@Stateless
public class ModelProteinHome {

	private static final Log log = LogFactory.getLog(ModelProteinHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ModelProtein transientInstance) {
		log.debug("persisting ModelProtein instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ModelProtein persistentInstance) {
		log.debug("removing ModelProtein instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ModelProtein merge(ModelProtein detachedInstance) {
		log.debug("merging ModelProtein instance");
		try {
			ModelProtein result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ModelProtein findById(Integer id) {
		log.debug("getting ModelProtein instance with id: " + id);
		try {
			ModelProtein instance = entityManager.find(ModelProtein.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
