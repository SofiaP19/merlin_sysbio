package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelEnzyme.
 * @see hibernate.merlin_hibernate.entities.ModelEnzyme
 * @author Hibernate Tools
 */
@Stateless
public class ModelEnzymeHome {

    private static final Log log = LogFactory.getLog(ModelEnzymeHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelEnzyme transientInstance) {
        log.debug("persisting ModelEnzyme instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelEnzyme persistentInstance) {
        log.debug("removing ModelEnzyme instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelEnzyme merge(ModelEnzyme detachedInstance) {
        log.debug("merging ModelEnzyme instance");
        try {
            ModelEnzyme result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelEnzyme findById( ModelEnzymeId id) {
        log.debug("getting ModelEnzyme instance with id: " + id);
        try {
            ModelEnzyme instance = entityManager.find(ModelEnzyme.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

