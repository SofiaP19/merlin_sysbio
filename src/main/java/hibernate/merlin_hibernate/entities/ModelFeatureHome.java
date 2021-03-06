package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelFeature.
 * @see hibernate.merlin_hibernate.entities.ModelFeature
 * @author Hibernate Tools
 */
@Stateless
public class ModelFeatureHome {

    private static final Log log = LogFactory.getLog(ModelFeatureHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelFeature transientInstance) {
        log.debug("persisting ModelFeature instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelFeature persistentInstance) {
        log.debug("removing ModelFeature instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelFeature merge(ModelFeature detachedInstance) {
        log.debug("merging ModelFeature instance");
        try {
            ModelFeature result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelFeature findById( int id) {
        log.debug("getting ModelFeature instance with id: " + id);
        try {
            ModelFeature instance = entityManager.find(ModelFeature.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

