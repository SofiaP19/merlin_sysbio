package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransportersIdentificationSwHits.
 * @see hibernate.merlin_hibernate.entities.TransportersIdentificationSwHits
 * @author Hibernate Tools
 */
@Stateless
public class TransportersIdentificationSwHitsHome {

	private static final Log log = LogFactory.getLog(TransportersIdentificationSwHitsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TransportersIdentificationSwHits transientInstance) {
		log.debug("persisting TransportersIdentificationSwHits instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TransportersIdentificationSwHits persistentInstance) {
		log.debug("removing TransportersIdentificationSwHits instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TransportersIdentificationSwHits merge(TransportersIdentificationSwHits detachedInstance) {
		log.debug("merging TransportersIdentificationSwHits instance");
		try {
			TransportersIdentificationSwHits result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TransportersIdentificationSwHits findById(Integer id) {
		log.debug("getting TransportersIdentificationSwHits instance with id: " + id);
		try {
			TransportersIdentificationSwHits instance = entityManager.find(TransportersIdentificationSwHits.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
