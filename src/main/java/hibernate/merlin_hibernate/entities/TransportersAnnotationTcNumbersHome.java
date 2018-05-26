package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransportersAnnotationTcNumbers.
 * @see hibernate.merlin_hibernate.entities.TransportersAnnotationTcNumbers
 * @author Hibernate Tools
 */
@Stateless
public class TransportersAnnotationTcNumbersHome {

	private static final Log log = LogFactory.getLog(TransportersAnnotationTcNumbersHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TransportersAnnotationTcNumbers transientInstance) {
		log.debug("persisting TransportersAnnotationTcNumbers instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TransportersAnnotationTcNumbers persistentInstance) {
		log.debug("removing TransportersAnnotationTcNumbers instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TransportersAnnotationTcNumbers merge(TransportersAnnotationTcNumbers detachedInstance) {
		log.debug("merging TransportersAnnotationTcNumbers instance");
		try {
			TransportersAnnotationTcNumbers result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TransportersAnnotationTcNumbers findById(TransportersAnnotationTcNumbersId id) {
		log.debug("getting TransportersAnnotationTcNumbers instance with id: " + id);
		try {
			TransportersAnnotationTcNumbers instance = entityManager.find(TransportersAnnotationTcNumbers.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
