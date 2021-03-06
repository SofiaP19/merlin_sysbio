package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelEnzymeHasModule.
 * @see hibernate.merlin_hibernate.entities.ModelEnzymeHasModule
 * @author Hibernate Tools
 */
@Stateless
public class ModelEnzymeHasModuleHome {

    private static final Log log = LogFactory.getLog(ModelEnzymeHasModuleHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelEnzymeHasModule transientInstance) {
        log.debug("persisting ModelEnzymeHasModule instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelEnzymeHasModule persistentInstance) {
        log.debug("removing ModelEnzymeHasModule instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelEnzymeHasModule merge(ModelEnzymeHasModule detachedInstance) {
        log.debug("merging ModelEnzymeHasModule instance");
        try {
            ModelEnzymeHasModule result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelEnzymeHasModule findById( ModelEnzymeHasModuleId id) {
        log.debug("getting ModelEnzymeHasModule instance with id: " + id);
        try {
            ModelEnzymeHasModule instance = entityManager.find(ModelEnzymeHasModule.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

