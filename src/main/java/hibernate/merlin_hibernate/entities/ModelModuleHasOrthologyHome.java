package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelModuleHasOrthology.
 * @see hibernate.merlin_hibernate.entities.ModelModuleHasOrthology
 * @author Hibernate Tools
 */
@Stateless
public class ModelModuleHasOrthologyHome {

    private static final Log log = LogFactory.getLog(ModelModuleHasOrthologyHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelModuleHasOrthology transientInstance) {
        log.debug("persisting ModelModuleHasOrthology instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelModuleHasOrthology persistentInstance) {
        log.debug("removing ModelModuleHasOrthology instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelModuleHasOrthology merge(ModelModuleHasOrthology detachedInstance) {
        log.debug("merging ModelModuleHasOrthology instance");
        try {
            ModelModuleHasOrthology result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelModuleHasOrthology findById( ModelModuleHasOrthologyId id) {
        log.debug("getting ModelModuleHasOrthology instance with id: " + id);
        try {
            ModelModuleHasOrthology instance = entityManager.find(ModelModuleHasOrthology.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

