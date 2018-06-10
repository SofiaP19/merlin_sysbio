package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelPathwayHasModule.
 * @see hibernate.merlin_hibernate.entities.ModelPathwayHasModule
 * @author Hibernate Tools
 */
@Stateless
public class ModelPathwayHasModuleHome {

    private static final Log log = LogFactory.getLog(ModelPathwayHasModuleHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelPathwayHasModule transientInstance) {
        log.debug("persisting ModelPathwayHasModule instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelPathwayHasModule persistentInstance) {
        log.debug("removing ModelPathwayHasModule instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelPathwayHasModule merge(ModelPathwayHasModule detachedInstance) {
        log.debug("merging ModelPathwayHasModule instance");
        try {
            ModelPathwayHasModule result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelPathwayHasModule findById( ModelPathwayHasModuleId id) {
        log.debug("getting ModelPathwayHasModule instance with id: " + id);
        try {
            ModelPathwayHasModule instance = entityManager.find(ModelPathwayHasModule.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

