package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelEnzymaticCofactor.
 * @see hibernate.merlin_hibernate.entities.ModelEnzymaticCofactor
 * @author Hibernate Tools
 */
@Stateless
public class ModelEnzymaticCofactorHome {

    private static final Log log = LogFactory.getLog(ModelEnzymaticCofactorHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelEnzymaticCofactor transientInstance) {
        log.debug("persisting ModelEnzymaticCofactor instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelEnzymaticCofactor persistentInstance) {
        log.debug("removing ModelEnzymaticCofactor instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelEnzymaticCofactor merge(ModelEnzymaticCofactor detachedInstance) {
        log.debug("merging ModelEnzymaticCofactor instance");
        try {
            ModelEnzymaticCofactor result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelEnzymaticCofactor findById( ModelEnzymaticCofactorId id) {
        log.debug("getting ModelEnzymaticCofactor instance with id: " + id);
        try {
            ModelEnzymaticCofactor instance = entityManager.find(ModelEnzymaticCofactor.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

