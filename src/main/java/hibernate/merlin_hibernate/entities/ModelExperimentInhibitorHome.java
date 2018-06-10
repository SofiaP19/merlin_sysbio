package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelExperimentInhibitor.
 * @see hibernate.merlin_hibernate.entities.ModelExperimentInhibitor
 * @author Hibernate Tools
 */
@Stateless
public class ModelExperimentInhibitorHome {

    private static final Log log = LogFactory.getLog(ModelExperimentInhibitorHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelExperimentInhibitor transientInstance) {
        log.debug("persisting ModelExperimentInhibitor instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelExperimentInhibitor persistentInstance) {
        log.debug("removing ModelExperimentInhibitor instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelExperimentInhibitor merge(ModelExperimentInhibitor detachedInstance) {
        log.debug("merging ModelExperimentInhibitor instance");
        try {
            ModelExperimentInhibitor result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelExperimentInhibitor findById( ModelExperimentInhibitorId id) {
        log.debug("getting ModelExperimentInhibitor instance with id: " + id);
        try {
            ModelExperimentInhibitor instance = entityManager.find(ModelExperimentInhibitor.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

