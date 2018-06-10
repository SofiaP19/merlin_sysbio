package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelSubunit.
 * @see hibernate.merlin_hibernate.entities.ModelSubunit
 * @author Hibernate Tools
 */
@Stateless
public class ModelSubunitHome {

    private static final Log log = LogFactory.getLog(ModelSubunitHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelSubunit transientInstance) {
        log.debug("persisting ModelSubunit instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelSubunit persistentInstance) {
        log.debug("removing ModelSubunit instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelSubunit merge(ModelSubunit detachedInstance) {
        log.debug("merging ModelSubunit instance");
        try {
            ModelSubunit result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelSubunit findById( ModelSubunitId id) {
        log.debug("getting ModelSubunit instance with id: " + id);
        try {
            ModelSubunit instance = entityManager.find(ModelSubunit.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

