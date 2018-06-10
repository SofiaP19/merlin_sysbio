package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelSameAs.
 * @see hibernate.merlin_hibernate.entities.ModelSameAs
 * @author Hibernate Tools
 */
@Stateless
public class ModelSameAsHome {

    private static final Log log = LogFactory.getLog(ModelSameAsHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelSameAs transientInstance) {
        log.debug("persisting ModelSameAs instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelSameAs persistentInstance) {
        log.debug("removing ModelSameAs instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelSameAs merge(ModelSameAs detachedInstance) {
        log.debug("merging ModelSameAs instance");
        try {
            ModelSameAs result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelSameAs findById( ModelSameAsId id) {
        log.debug("getting ModelSameAs instance with id: " + id);
        try {
            ModelSameAs instance = entityManager.find(ModelSameAs.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

