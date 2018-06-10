package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelReactionHasEnzyme.
 * @see hibernate.merlin_hibernate.entities.ModelReactionHasEnzyme
 * @author Hibernate Tools
 */
@Stateless
public class ModelReactionHasEnzymeHome {

    private static final Log log = LogFactory.getLog(ModelReactionHasEnzymeHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelReactionHasEnzyme transientInstance) {
        log.debug("persisting ModelReactionHasEnzyme instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelReactionHasEnzyme persistentInstance) {
        log.debug("removing ModelReactionHasEnzyme instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelReactionHasEnzyme merge(ModelReactionHasEnzyme detachedInstance) {
        log.debug("merging ModelReactionHasEnzyme instance");
        try {
            ModelReactionHasEnzyme result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelReactionHasEnzyme findById( ModelReactionHasEnzymeId id) {
        log.debug("getting ModelReactionHasEnzyme instance with id: " + id);
        try {
            ModelReactionHasEnzyme instance = entityManager.find(ModelReactionHasEnzyme.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

