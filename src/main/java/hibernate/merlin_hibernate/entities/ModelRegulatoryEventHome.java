package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelRegulatoryEvent.
 * @see hibernate.merlin_hibernate.entities.ModelRegulatoryEvent
 * @author Hibernate Tools
 */
@Stateless
public class ModelRegulatoryEventHome {

    private static final Log log = LogFactory.getLog(ModelRegulatoryEventHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelRegulatoryEvent transientInstance) {
        log.debug("persisting ModelRegulatoryEvent instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelRegulatoryEvent persistentInstance) {
        log.debug("removing ModelRegulatoryEvent instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelRegulatoryEvent merge(ModelRegulatoryEvent detachedInstance) {
        log.debug("merging ModelRegulatoryEvent instance");
        try {
            ModelRegulatoryEvent result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelRegulatoryEvent findById( ModelRegulatoryEventId id) {
        log.debug("getting ModelRegulatoryEvent instance with id: " + id);
        try {
            ModelRegulatoryEvent instance = entityManager.find(ModelRegulatoryEvent.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

