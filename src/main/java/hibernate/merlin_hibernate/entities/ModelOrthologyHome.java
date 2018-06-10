package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelOrthology.
 * @see hibernate.merlin_hibernate.entities.ModelOrthology
 * @author Hibernate Tools
 */
@Stateless
public class ModelOrthologyHome {

    private static final Log log = LogFactory.getLog(ModelOrthologyHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelOrthology transientInstance) {
        log.debug("persisting ModelOrthology instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelOrthology persistentInstance) {
        log.debug("removing ModelOrthology instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelOrthology merge(ModelOrthology detachedInstance) {
        log.debug("merging ModelOrthology instance");
        try {
            ModelOrthology result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelOrthology findById( Integer id) {
        log.debug("getting ModelOrthology instance with id: " + id);
        try {
            ModelOrthology instance = entityManager.find(ModelOrthology.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

