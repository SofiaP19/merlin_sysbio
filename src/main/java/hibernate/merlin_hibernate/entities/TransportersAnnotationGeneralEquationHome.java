package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransportersAnnotationGeneralEquation.
 * @see hibernate.merlin_hibernate.entities.TransportersAnnotationGeneralEquation
 * @author Hibernate Tools
 */
@Stateless
public class TransportersAnnotationGeneralEquationHome {

	private static final Log log = LogFactory.getLog(TransportersAnnotationGeneralEquationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TransportersAnnotationGeneralEquation transientInstance) {
		log.debug("persisting TransportersAnnotationGeneralEquation instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TransportersAnnotationGeneralEquation persistentInstance) {
		log.debug("removing TransportersAnnotationGeneralEquation instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TransportersAnnotationGeneralEquation merge(TransportersAnnotationGeneralEquation detachedInstance) {
		log.debug("merging TransportersAnnotationGeneralEquation instance");
		try {
			TransportersAnnotationGeneralEquation result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TransportersAnnotationGeneralEquation findById(Integer id) {
		log.debug("getting TransportersAnnotationGeneralEquation instance with id: " + id);
		try {
			TransportersAnnotationGeneralEquation instance = entityManager
					.find(TransportersAnnotationGeneralEquation.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
