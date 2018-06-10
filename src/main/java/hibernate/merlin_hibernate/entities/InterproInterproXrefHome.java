package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class InterproInterproXref.
 * @see hibernate.merlin_hibernate.entities.InterproInterproXref
 * @author Hibernate Tools
 */
@Stateless
public class InterproInterproXrefHome {

    private static final Log log = LogFactory.getLog(InterproInterproXrefHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(InterproInterproXref transientInstance) {
        log.debug("persisting InterproInterproXref instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(InterproInterproXref persistentInstance) {
        log.debug("removing InterproInterproXref instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public InterproInterproXref merge(InterproInterproXref detachedInstance) {
        log.debug("merging InterproInterproXref instance");
        try {
            InterproInterproXref result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public InterproInterproXref findById( Integer id) {
        log.debug("getting InterproInterproXref instance with id: " + id);
        try {
            InterproInterproXref instance = entityManager.find(InterproInterproXref.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

