package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransportersAnnotationMetabolitesOntology.
 * @see hibernate.merlin_hibernate.entities.TransportersAnnotationMetabolitesOntology
 * @author Hibernate Tools
 */
@Stateless
public class TransportersAnnotationMetabolitesOntologyHome {

	private static final Log log = LogFactory.getLog(TransportersAnnotationMetabolitesOntologyHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TransportersAnnotationMetabolitesOntology transientInstance) {
		log.debug("persisting TransportersAnnotationMetabolitesOntology instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TransportersAnnotationMetabolitesOntology persistentInstance) {
		log.debug("removing TransportersAnnotationMetabolitesOntology instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TransportersAnnotationMetabolitesOntology merge(TransportersAnnotationMetabolitesOntology detachedInstance) {
		log.debug("merging TransportersAnnotationMetabolitesOntology instance");
		try {
			TransportersAnnotationMetabolitesOntology result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TransportersAnnotationMetabolitesOntology findById(Integer id) {
		log.debug("getting TransportersAnnotationMetabolitesOntology instance with id: " + id);
		try {
			TransportersAnnotationMetabolitesOntology instance = entityManager
					.find(TransportersAnnotationMetabolitesOntology.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
