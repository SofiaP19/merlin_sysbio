package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelStoichiometry.
 * @see hibernate.merlin_hibernate.entities.ModelStoichiometry
 * @author Hibernate Tools
 */
@Stateless
public class ModelStoichiometryHome {

    private static final Log log = LogFactory.getLog(ModelStoichiometryHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelStoichiometry transientInstance) {
        log.debug("persisting ModelStoichiometry instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelStoichiometry persistentInstance) {
        log.debug("removing ModelStoichiometry instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelStoichiometry merge(ModelStoichiometry detachedInstance) {
        log.debug("merging ModelStoichiometry instance");
        try {
            ModelStoichiometry result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelStoichiometry findById( ModelStoichiometryId id) {
        log.debug("getting ModelStoichiometry instance with id: " + id);
        try {
            ModelStoichiometry instance = entityManager.find(ModelStoichiometry.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

