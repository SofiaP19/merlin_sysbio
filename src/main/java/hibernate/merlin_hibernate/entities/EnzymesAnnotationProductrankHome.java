package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class EnzymesAnnotationProductrank.
 * @see hibernate.merlin_hibernate.entities.EnzymesAnnotationProductrank
 * @author Hibernate Tools
 */
@Stateless
public class EnzymesAnnotationProductrankHome {

    private static final Log log = LogFactory.getLog(EnzymesAnnotationProductrankHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(EnzymesAnnotationProductrank transientInstance) {
        log.debug("persisting EnzymesAnnotationProductrank instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(EnzymesAnnotationProductrank persistentInstance) {
        log.debug("removing EnzymesAnnotationProductrank instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public EnzymesAnnotationProductrank merge(EnzymesAnnotationProductrank detachedInstance) {
        log.debug("merging EnzymesAnnotationProductrank instance");
        try {
            EnzymesAnnotationProductrank result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public EnzymesAnnotationProductrank findById( Integer id) {
        log.debug("getting EnzymesAnnotationProductrank instance with id: " + id);
        try {
            EnzymesAnnotationProductrank instance = entityManager.find(EnzymesAnnotationProductrank.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

