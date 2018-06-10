package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class InterproInterproLocation.
 * @see hibernate.merlin_hibernate.entities.InterproInterproLocation
 * @author Hibernate Tools
 */
@Stateless
public class InterproInterproLocationHome {

    private static final Log log = LogFactory.getLog(InterproInterproLocationHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(InterproInterproLocation transientInstance) {
        log.debug("persisting InterproInterproLocation instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(InterproInterproLocation persistentInstance) {
        log.debug("removing InterproInterproLocation instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public InterproInterproLocation merge(InterproInterproLocation detachedInstance) {
        log.debug("merging InterproInterproLocation instance");
        try {
            InterproInterproLocation result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public InterproInterproLocation findById( Integer id) {
        log.debug("getting InterproInterproLocation instance with id: " + id);
        try {
            InterproInterproLocation instance = entityManager.find(InterproInterproLocation.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

