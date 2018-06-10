package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelSuperpathway.
 * @see hibernate.merlin_hibernate.entities.ModelSuperpathway
 * @author Hibernate Tools
 */
@Stateless
public class ModelSuperpathwayHome {

    private static final Log log = LogFactory.getLog(ModelSuperpathwayHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelSuperpathway transientInstance) {
        log.debug("persisting ModelSuperpathway instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelSuperpathway persistentInstance) {
        log.debug("removing ModelSuperpathway instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelSuperpathway merge(ModelSuperpathway detachedInstance) {
        log.debug("merging ModelSuperpathway instance");
        try {
            ModelSuperpathway result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelSuperpathway findById( ModelSuperpathwayId id) {
        log.debug("getting ModelSuperpathway instance with id: " + id);
        try {
            ModelSuperpathway instance = entityManager.find(ModelSuperpathway.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

