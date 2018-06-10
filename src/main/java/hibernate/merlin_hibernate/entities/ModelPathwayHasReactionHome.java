package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelPathwayHasReaction.
 * @see hibernate.merlin_hibernate.entities.ModelPathwayHasReaction
 * @author Hibernate Tools
 */
@Stateless
public class ModelPathwayHasReactionHome {

    private static final Log log = LogFactory.getLog(ModelPathwayHasReactionHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelPathwayHasReaction transientInstance) {
        log.debug("persisting ModelPathwayHasReaction instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelPathwayHasReaction persistentInstance) {
        log.debug("removing ModelPathwayHasReaction instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelPathwayHasReaction merge(ModelPathwayHasReaction detachedInstance) {
        log.debug("merging ModelPathwayHasReaction instance");
        try {
            ModelPathwayHasReaction result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelPathwayHasReaction findById( ModelPathwayHasReactionId id) {
        log.debug("getting ModelPathwayHasReaction instance with id: " + id);
        try {
            ModelPathwayHasReaction instance = entityManager.find(ModelPathwayHasReaction.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

