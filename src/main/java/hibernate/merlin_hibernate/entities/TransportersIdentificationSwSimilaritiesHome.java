package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransportersIdentificationSwSimilarities.
 * @see hibernate.merlin_hibernate.entities.TransportersIdentificationSwSimilarities
 * @author Hibernate Tools
 */
@Stateless
public class TransportersIdentificationSwSimilaritiesHome {

	private static final Log log = LogFactory.getLog(TransportersIdentificationSwSimilaritiesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TransportersIdentificationSwSimilarities transientInstance) {
		log.debug("persisting TransportersIdentificationSwSimilarities instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TransportersIdentificationSwSimilarities persistentInstance) {
		log.debug("removing TransportersIdentificationSwSimilarities instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TransportersIdentificationSwSimilarities merge(TransportersIdentificationSwSimilarities detachedInstance) {
		log.debug("merging TransportersIdentificationSwSimilarities instance");
		try {
			TransportersIdentificationSwSimilarities result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TransportersIdentificationSwSimilarities findById(TransportersIdentificationSwSimilaritiesId id) {
		log.debug("getting TransportersIdentificationSwSimilarities instance with id: " + id);
		try {
			TransportersIdentificationSwSimilarities instance = entityManager
					.find(TransportersIdentificationSwSimilarities.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
