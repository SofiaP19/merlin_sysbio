package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class EnzymesAnnotationHomologydata.
 * @see hibernate.merlin_hibernate.entities.EnzymesAnnotationHomologydata
 * @author Hibernate Tools
 */
@Stateless
public class EnzymesAnnotationHomologydataHome {

    private static final Log log = LogFactory.getLog(EnzymesAnnotationHomologydataHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(EnzymesAnnotationHomologydata transientInstance) {
        log.debug("persisting EnzymesAnnotationHomologydata instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(EnzymesAnnotationHomologydata persistentInstance) {
        log.debug("removing EnzymesAnnotationHomologydata instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public EnzymesAnnotationHomologydata merge(EnzymesAnnotationHomologydata detachedInstance) {
        log.debug("merging EnzymesAnnotationHomologydata instance");
        try {
            EnzymesAnnotationHomologydata result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public EnzymesAnnotationHomologydata findById( Integer id) {
        log.debug("getting EnzymesAnnotationHomologydata instance with id: " + id);
        try {
            EnzymesAnnotationHomologydata instance = entityManager.find(EnzymesAnnotationHomologydata.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

