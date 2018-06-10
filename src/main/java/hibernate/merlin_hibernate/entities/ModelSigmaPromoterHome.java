package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelSigmaPromoter.
 * @see hibernate.merlin_hibernate.entities.ModelSigmaPromoter
 * @author Hibernate Tools
 */
@Stateless
public class ModelSigmaPromoterHome {

    private static final Log log = LogFactory.getLog(ModelSigmaPromoterHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelSigmaPromoter transientInstance) {
        log.debug("persisting ModelSigmaPromoter instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelSigmaPromoter persistentInstance) {
        log.debug("removing ModelSigmaPromoter instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelSigmaPromoter merge(ModelSigmaPromoter detachedInstance) {
        log.debug("merging ModelSigmaPromoter instance");
        try {
            ModelSigmaPromoter result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelSigmaPromoter findById( ModelSigmaPromoterId id) {
        log.debug("getting ModelSigmaPromoter instance with id: " + id);
        try {
            ModelSigmaPromoter instance = entityManager.find(ModelSigmaPromoter.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

