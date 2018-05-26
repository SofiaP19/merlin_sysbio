package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransportersAnnotationGenes.
 * @see hibernate.merlin_hibernate.entities.TransportersAnnotationGenes
 * @author Hibernate Tools
 */
@Stateless
public class TransportersAnnotationGenesHome {

	private static final Log log = LogFactory.getLog(TransportersAnnotationGenesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TransportersAnnotationGenes transientInstance) {
		log.debug("persisting TransportersAnnotationGenes instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TransportersAnnotationGenes persistentInstance) {
		log.debug("removing TransportersAnnotationGenes instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TransportersAnnotationGenes merge(TransportersAnnotationGenes detachedInstance) {
		log.debug("merging TransportersAnnotationGenes instance");
		try {
			TransportersAnnotationGenes result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TransportersAnnotationGenes findById(Integer id) {
		log.debug("getting TransportersAnnotationGenes instance with id: " + id);
		try {
			TransportersAnnotationGenes instance = entityManager.find(TransportersAnnotationGenes.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}