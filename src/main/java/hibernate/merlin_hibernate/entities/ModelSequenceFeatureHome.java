package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelSequenceFeature.
 * @see hibernate.merlin_hibernate.entities.ModelSequenceFeature
 * @author Hibernate Tools
 */
@Stateless
public class ModelSequenceFeatureHome {

    private static final Log log = LogFactory.getLog(ModelSequenceFeatureHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelSequenceFeature transientInstance) {
        log.debug("persisting ModelSequenceFeature instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelSequenceFeature persistentInstance) {
        log.debug("removing ModelSequenceFeature instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelSequenceFeature merge(ModelSequenceFeature detachedInstance) {
        log.debug("merging ModelSequenceFeature instance");
        try {
            ModelSequenceFeature result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelSequenceFeature findById( int id) {
        log.debug("getting ModelSequenceFeature instance with id: " + id);
        try {
            ModelSequenceFeature instance = entityManager.find(ModelSequenceFeature.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

