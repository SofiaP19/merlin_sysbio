package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelDictionary.
 * @see hibernate.merlin_hibernate.entities.ModelDictionary
 * @author Hibernate Tools
 */
@Stateless
public class ModelDictionaryHome {

    private static final Log log = LogFactory.getLog(ModelDictionaryHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelDictionary transientInstance) {
        log.debug("persisting ModelDictionary instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelDictionary persistentInstance) {
        log.debug("removing ModelDictionary instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelDictionary merge(ModelDictionary detachedInstance) {
        log.debug("merging ModelDictionary instance");
        try {
            ModelDictionary result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelDictionary findById( ModelDictionaryId id) {
        log.debug("getting ModelDictionary instance with id: " + id);
        try {
            ModelDictionary instance = entityManager.find(ModelDictionary.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

