package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class EnzymesAnnotationEcnumberlist.
 * @see hibernate.merlin_hibernate.entities.EnzymesAnnotationEcnumberlist
 * @author Hibernate Tools
 */
@Stateless
public class EnzymesAnnotationEcnumberlistHome {

	private static final Log log = LogFactory.getLog(EnzymesAnnotationEcnumberlistHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(EnzymesAnnotationEcnumberlist transientInstance) {
		log.debug("persisting EnzymesAnnotationEcnumberlist instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(EnzymesAnnotationEcnumberlist persistentInstance) {
		log.debug("removing EnzymesAnnotationEcnumberlist instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public EnzymesAnnotationEcnumberlist merge(EnzymesAnnotationEcnumberlist detachedInstance) {
		log.debug("merging EnzymesAnnotationEcnumberlist instance");
		try {
			EnzymesAnnotationEcnumberlist result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EnzymesAnnotationEcnumberlist findById(Integer id) {
		log.debug("getting EnzymesAnnotationEcnumberlist instance with id: " + id);
		try {
			EnzymesAnnotationEcnumberlist instance = entityManager.find(EnzymesAnnotationEcnumberlist.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
