package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelExperimentalFactor.
 * @see hibernate.merlin_hibernate.entities.ModelExperimentalFactor
 * @author Hibernate Tools
 */
@Stateless
public class ModelExperimentalFactorHome {

    private static final Log log = LogFactory.getLog(ModelExperimentalFactorHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelExperimentalFactor transientInstance) {
        log.debug("persisting ModelExperimentalFactor instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelExperimentalFactor persistentInstance) {
        log.debug("removing ModelExperimentalFactor instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelExperimentalFactor merge(ModelExperimentalFactor detachedInstance) {
        log.debug("merging ModelExperimentalFactor instance");
        try {
            ModelExperimentalFactor result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelExperimentalFactor findById( int id) {
        log.debug("getting ModelExperimentalFactor instance with id: " + id);
        try {
            ModelExperimentalFactor instance = entityManager.find(ModelExperimentalFactor.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

