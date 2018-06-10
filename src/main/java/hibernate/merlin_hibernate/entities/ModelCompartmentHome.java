package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelCompartment.
 * @see hibernate.merlin_hibernate.entities.ModelCompartment
 * @author Hibernate Tools
 */
@Stateless
public class ModelCompartmentHome {

    private static final Log log = LogFactory.getLog(ModelCompartmentHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelCompartment transientInstance) {
        log.debug("persisting ModelCompartment instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelCompartment persistentInstance) {
        log.debug("removing ModelCompartment instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelCompartment merge(ModelCompartment detachedInstance) {
        log.debug("merging ModelCompartment instance");
        try {
            ModelCompartment result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelCompartment findById( Integer id) {
        log.debug("getting ModelCompartment instance with id: " + id);
        try {
            ModelCompartment instance = entityManager.find(ModelCompartment.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

