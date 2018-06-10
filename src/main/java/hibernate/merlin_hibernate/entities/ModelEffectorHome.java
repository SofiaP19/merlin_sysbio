package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelEffector.
 * @see hibernate.merlin_hibernate.entities.ModelEffector
 * @author Hibernate Tools
 */
@Stateless
public class ModelEffectorHome {

    private static final Log log = LogFactory.getLog(ModelEffectorHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelEffector transientInstance) {
        log.debug("persisting ModelEffector instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelEffector persistentInstance) {
        log.debug("removing ModelEffector instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelEffector merge(ModelEffector detachedInstance) {
        log.debug("merging ModelEffector instance");
        try {
            ModelEffector result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelEffector findById( ModelEffectorId id) {
        log.debug("getting ModelEffector instance with id: " + id);
        try {
            ModelEffector instance = entityManager.find(ModelEffector.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

