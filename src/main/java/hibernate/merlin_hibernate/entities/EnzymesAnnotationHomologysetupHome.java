package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class EnzymesAnnotationHomologysetup.
 * @see hibernate.merlin_hibernate.entities.EnzymesAnnotationHomologysetup
 * @author Hibernate Tools
 */
@Stateless
public class EnzymesAnnotationHomologysetupHome {

    private static final Log log = LogFactory.getLog(EnzymesAnnotationHomologysetupHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(EnzymesAnnotationHomologysetup transientInstance) {
        log.debug("persisting EnzymesAnnotationHomologysetup instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(EnzymesAnnotationHomologysetup persistentInstance) {
        log.debug("removing EnzymesAnnotationHomologysetup instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public EnzymesAnnotationHomologysetup merge(EnzymesAnnotationHomologysetup detachedInstance) {
        log.debug("merging EnzymesAnnotationHomologysetup instance");
        try {
            EnzymesAnnotationHomologysetup result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public EnzymesAnnotationHomologysetup findById( Integer id) {
        log.debug("getting EnzymesAnnotationHomologysetup instance with id: " + id);
        try {
            EnzymesAnnotationHomologysetup instance = entityManager.find(EnzymesAnnotationHomologysetup.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

