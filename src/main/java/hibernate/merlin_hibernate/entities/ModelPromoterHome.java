package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelPromoter.
 * @see hibernate.merlin_hibernate.entities.ModelPromoter
 * @author Hibernate Tools
 */
@Stateless
public class ModelPromoterHome {

    private static final Log log = LogFactory.getLog(ModelPromoterHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelPromoter transientInstance) {
        log.debug("persisting ModelPromoter instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelPromoter persistentInstance) {
        log.debug("removing ModelPromoter instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelPromoter merge(ModelPromoter detachedInstance) {
        log.debug("merging ModelPromoter instance");
        try {
            ModelPromoter result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelPromoter findById( Integer id) {
        log.debug("getting ModelPromoter instance with id: " + id);
        try {
            ModelPromoter instance = entityManager.find(ModelPromoter.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

