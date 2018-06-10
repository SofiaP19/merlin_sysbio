package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class EnzymesAnnotationEcnumber.
 * @see hibernate.merlin_hibernate.entities.EnzymesAnnotationEcnumber
 * @author Hibernate Tools
 */
@Stateless
public class EnzymesAnnotationEcnumberHome {

    private static final Log log = LogFactory.getLog(EnzymesAnnotationEcnumberHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(EnzymesAnnotationEcnumber transientInstance) {
        log.debug("persisting EnzymesAnnotationEcnumber instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(EnzymesAnnotationEcnumber persistentInstance) {
        log.debug("removing EnzymesAnnotationEcnumber instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public EnzymesAnnotationEcnumber merge(EnzymesAnnotationEcnumber detachedInstance) {
        log.debug("merging EnzymesAnnotationEcnumber instance");
        try {
            EnzymesAnnotationEcnumber result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public EnzymesAnnotationEcnumber findById( Integer id) {
        log.debug("getting EnzymesAnnotationEcnumber instance with id: " + id);
        try {
            EnzymesAnnotationEcnumber instance = entityManager.find(EnzymesAnnotationEcnumber.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

