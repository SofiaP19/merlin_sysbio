package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class EnzymesAnnotationEcnumberrank.
 * @see hibernate.merlin_hibernate.entities.EnzymesAnnotationEcnumberrank
 * @author Hibernate Tools
 */
@Stateless
public class EnzymesAnnotationEcnumberrankHome {

    private static final Log log = LogFactory.getLog(EnzymesAnnotationEcnumberrankHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(EnzymesAnnotationEcnumberrank transientInstance) {
        log.debug("persisting EnzymesAnnotationEcnumberrank instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(EnzymesAnnotationEcnumberrank persistentInstance) {
        log.debug("removing EnzymesAnnotationEcnumberrank instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public EnzymesAnnotationEcnumberrank merge(EnzymesAnnotationEcnumberrank detachedInstance) {
        log.debug("merging EnzymesAnnotationEcnumberrank instance");
        try {
            EnzymesAnnotationEcnumberrank result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public EnzymesAnnotationEcnumberrank findById( Integer id) {
        log.debug("getting EnzymesAnnotationEcnumberrank instance with id: " + id);
        try {
            EnzymesAnnotationEcnumberrank instance = entityManager.find(EnzymesAnnotationEcnumberrank.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

