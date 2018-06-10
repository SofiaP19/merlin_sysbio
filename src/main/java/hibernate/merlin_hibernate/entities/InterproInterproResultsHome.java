package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class InterproInterproResults.
 * @see hibernate.merlin_hibernate.entities.InterproInterproResults
 * @author Hibernate Tools
 */
@Stateless
public class InterproInterproResultsHome {

    private static final Log log = LogFactory.getLog(InterproInterproResultsHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(InterproInterproResults transientInstance) {
        log.debug("persisting InterproInterproResults instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(InterproInterproResults persistentInstance) {
        log.debug("removing InterproInterproResults instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public InterproInterproResults merge(InterproInterproResults detachedInstance) {
        log.debug("merging InterproInterproResults instance");
        try {
            InterproInterproResults result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public InterproInterproResults findById( Integer id) {
        log.debug("getting InterproInterproResults instance with id: " + id);
        try {
            InterproInterproResults instance = entityManager.find(InterproInterproResults.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

