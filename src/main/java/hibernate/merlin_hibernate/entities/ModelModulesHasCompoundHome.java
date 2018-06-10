package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelModulesHasCompound.
 * @see hibernate.merlin_hibernate.entities.ModelModulesHasCompound
 * @author Hibernate Tools
 */
@Stateless
public class ModelModulesHasCompoundHome {

    private static final Log log = LogFactory.getLog(ModelModulesHasCompoundHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelModulesHasCompound transientInstance) {
        log.debug("persisting ModelModulesHasCompound instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelModulesHasCompound persistentInstance) {
        log.debug("removing ModelModulesHasCompound instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelModulesHasCompound merge(ModelModulesHasCompound detachedInstance) {
        log.debug("merging ModelModulesHasCompound instance");
        try {
            ModelModulesHasCompound result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelModulesHasCompound findById( ModelModulesHasCompoundId id) {
        log.debug("getting ModelModulesHasCompound instance with id: " + id);
        try {
            ModelModulesHasCompound instance = entityManager.find(ModelModulesHasCompound.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

