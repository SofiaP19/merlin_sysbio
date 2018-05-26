package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:31:35 by Hibernate Tools 5.2.8.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransportersIdentificationProjects.
 * @see hibernate.merlin_hibernate.entities.TransportersIdentificationProjects
 * @author Hibernate Tools
 */
@Stateless
public class TransportersIdentificationProjectsHome {

	private static final Log log = LogFactory.getLog(TransportersIdentificationProjectsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TransportersIdentificationProjects transientInstance) {
		log.debug("persisting TransportersIdentificationProjects instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TransportersIdentificationProjects persistentInstance) {
		log.debug("removing TransportersIdentificationProjects instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TransportersIdentificationProjects merge(TransportersIdentificationProjects detachedInstance) {
		log.debug("merging TransportersIdentificationProjects instance");
		try {
			TransportersIdentificationProjects result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TransportersIdentificationProjects findById(Integer id) {
		log.debug("getting TransportersIdentificationProjects instance with id: " + id);
		try {
			TransportersIdentificationProjects instance = entityManager.find(TransportersIdentificationProjects.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
