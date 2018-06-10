package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class EnzymesAnnotationHomologuesHasEcnumber.
 * @see hibernate.merlin_hibernate.entities.EnzymesAnnotationHomologuesHasEcnumber
 * @author Hibernate Tools
 */
@Stateless
public class EnzymesAnnotationHomologuesHasEcnumberHome {

    private static final Log log = LogFactory.getLog(EnzymesAnnotationHomologuesHasEcnumberHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(EnzymesAnnotationHomologuesHasEcnumber transientInstance) {
        log.debug("persisting EnzymesAnnotationHomologuesHasEcnumber instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(EnzymesAnnotationHomologuesHasEcnumber persistentInstance) {
        log.debug("removing EnzymesAnnotationHomologuesHasEcnumber instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public EnzymesAnnotationHomologuesHasEcnumber merge(EnzymesAnnotationHomologuesHasEcnumber detachedInstance) {
        log.debug("merging EnzymesAnnotationHomologuesHasEcnumber instance");
        try {
            EnzymesAnnotationHomologuesHasEcnumber result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public EnzymesAnnotationHomologuesHasEcnumber findById( EnzymesAnnotationHomologuesHasEcnumberId id) {
        log.debug("getting EnzymesAnnotationHomologuesHasEcnumber instance with id: " + id);
        try {
            EnzymesAnnotationHomologuesHasEcnumber instance = entityManager.find(EnzymesAnnotationHomologuesHasEcnumber.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

