package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelActivatingReaction.
 * @see hibernate.merlin_hibernate.entities.ModelActivatingReaction
 * @author Hibernate Tools
 */
@Stateless
public class ModelActivatingReactionHome {

    private static final Log log = LogFactory.getLog(ModelActivatingReactionHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelActivatingReaction transientInstance) {
        log.debug("persisting ModelActivatingReaction instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelActivatingReaction persistentInstance) {
        log.debug("removing ModelActivatingReaction instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelActivatingReaction merge(ModelActivatingReaction detachedInstance) {
        log.debug("merging ModelActivatingReaction instance");
        try {
            ModelActivatingReaction result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelActivatingReaction findById( ModelActivatingReactionId id) {
        log.debug("getting ModelActivatingReaction instance with id: " + id);
        try {
            ModelActivatingReaction instance = entityManager.find(ModelActivatingReaction.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

