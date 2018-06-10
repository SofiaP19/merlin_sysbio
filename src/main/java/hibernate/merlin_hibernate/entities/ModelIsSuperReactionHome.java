package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelIsSuperReaction.
 * @see hibernate.merlin_hibernate.entities.ModelIsSuperReaction
 * @author Hibernate Tools
 */
@Stateless
public class ModelIsSuperReactionHome {

    private static final Log log = LogFactory.getLog(ModelIsSuperReactionHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelIsSuperReaction transientInstance) {
        log.debug("persisting ModelIsSuperReaction instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelIsSuperReaction persistentInstance) {
        log.debug("removing ModelIsSuperReaction instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelIsSuperReaction merge(ModelIsSuperReaction detachedInstance) {
        log.debug("merging ModelIsSuperReaction instance");
        try {
            ModelIsSuperReaction result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelIsSuperReaction findById( ModelIsSuperReactionId id) {
        log.debug("getting ModelIsSuperReaction instance with id: " + id);
        try {
            ModelIsSuperReaction instance = entityManager.find(ModelIsSuperReaction.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

