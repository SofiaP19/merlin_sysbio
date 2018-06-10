package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelEnzymaticAlternativeCofactor.
 * @see hibernate.merlin_hibernate.entities.ModelEnzymaticAlternativeCofactor
 * @author Hibernate Tools
 */
@Stateless
public class ModelEnzymaticAlternativeCofactorHome {

    private static final Log log = LogFactory.getLog(ModelEnzymaticAlternativeCofactorHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelEnzymaticAlternativeCofactor transientInstance) {
        log.debug("persisting ModelEnzymaticAlternativeCofactor instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelEnzymaticAlternativeCofactor persistentInstance) {
        log.debug("removing ModelEnzymaticAlternativeCofactor instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelEnzymaticAlternativeCofactor merge(ModelEnzymaticAlternativeCofactor detachedInstance) {
        log.debug("merging ModelEnzymaticAlternativeCofactor instance");
        try {
            ModelEnzymaticAlternativeCofactor result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelEnzymaticAlternativeCofactor findById( ModelEnzymaticAlternativeCofactorId id) {
        log.debug("getting ModelEnzymaticAlternativeCofactor instance with id: " + id);
        try {
            ModelEnzymaticAlternativeCofactor instance = entityManager.find(ModelEnzymaticAlternativeCofactor.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

