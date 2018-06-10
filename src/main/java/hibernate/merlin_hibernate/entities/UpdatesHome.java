package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Updates.
 * @see hibernate.merlin_hibernate.entities.Updates
 * @author Hibernate Tools
 */
@Stateless
public class UpdatesHome {

    private static final Log log = LogFactory.getLog(UpdatesHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(Updates transientInstance) {
        log.debug("persisting Updates instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Updates persistentInstance) {
        log.debug("removing Updates instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Updates merge(Updates detachedInstance) {
        log.debug("merging Updates instance");
        try {
            Updates result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Updates findById( int id) {
        log.debug("getting Updates instance with id: " + id);
        try {
            Updates instance = entityManager.find(Updates.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

