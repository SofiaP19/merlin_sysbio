package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelPathwayHasCompound.
 * @see hibernate.merlin_hibernate.entities.ModelPathwayHasCompound
 * @author Hibernate Tools
 */
@Stateless
public class ModelPathwayHasCompoundHome {

    private static final Log log = LogFactory.getLog(ModelPathwayHasCompoundHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelPathwayHasCompound transientInstance) {
        log.debug("persisting ModelPathwayHasCompound instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelPathwayHasCompound persistentInstance) {
        log.debug("removing ModelPathwayHasCompound instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelPathwayHasCompound merge(ModelPathwayHasCompound detachedInstance) {
        log.debug("merging ModelPathwayHasCompound instance");
        try {
            ModelPathwayHasCompound result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelPathwayHasCompound findById( ModelPathwayHasCompoundId id) {
        log.debug("getting ModelPathwayHasCompound instance with id: " + id);
        try {
            ModelPathwayHasCompound instance = entityManager.find(ModelPathwayHasCompound.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

