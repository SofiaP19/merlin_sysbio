package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class EnzymesAnnotationOrganism.
 * @see hibernate.merlin_hibernate.entities.EnzymesAnnotationOrganism
 * @author Hibernate Tools
 */
@Stateless
public class EnzymesAnnotationOrganismHome {

    private static final Log log = LogFactory.getLog(EnzymesAnnotationOrganismHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(EnzymesAnnotationOrganism transientInstance) {
        log.debug("persisting EnzymesAnnotationOrganism instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(EnzymesAnnotationOrganism persistentInstance) {
        log.debug("removing EnzymesAnnotationOrganism instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public EnzymesAnnotationOrganism merge(EnzymesAnnotationOrganism detachedInstance) {
        log.debug("merging EnzymesAnnotationOrganism instance");
        try {
            EnzymesAnnotationOrganism result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public EnzymesAnnotationOrganism findById( Integer id) {
        log.debug("getting EnzymesAnnotationOrganism instance with id: " + id);
        try {
            EnzymesAnnotationOrganism instance = entityManager.find(EnzymesAnnotationOrganism.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

