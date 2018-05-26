package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelStrain.
 * @see hibernate.merlin_hibernate.entities.ModelStrain
 * @author Hibernate Tools
 */
@Stateless
public class ModelStrainHome {

	private static final Log log = LogFactory.getLog(ModelStrainHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ModelStrain transientInstance) {
		log.debug("persisting ModelStrain instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ModelStrain persistentInstance) {
		log.debug("removing ModelStrain instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ModelStrain merge(ModelStrain detachedInstance) {
		log.debug("merging ModelStrain instance");
		try {
			ModelStrain result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ModelStrain findById(Integer id) {
		log.debug("getting ModelStrain instance with id: " + id);
		try {
			ModelStrain instance = entityManager.find(ModelStrain.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
