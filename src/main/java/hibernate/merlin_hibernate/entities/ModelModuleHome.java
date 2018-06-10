package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelModule.
 * @see hibernate.merlin_hibernate.entities.ModelModule
 * @author Hibernate Tools
 */
@Stateless
public class ModelModuleHome {

    private static final Log log = LogFactory.getLog(ModelModuleHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelModule transientInstance) {
        log.debug("persisting ModelModule instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelModule persistentInstance) {
        log.debug("removing ModelModule instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelModule merge(ModelModule detachedInstance) {
        log.debug("merging ModelModule instance");
        try {
            ModelModule result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelModule findById( Integer id) {
        log.debug("getting ModelModule instance with id: " + id);
        try {
            ModelModule instance = entityManager.find(ModelModule.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

