package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelPathway.
 * @see hibernate.merlin_hibernate.entities.ModelPathway
 * @author Hibernate Tools
 */
@Stateless
public class ModelPathwayHome {

    private static final Log log = LogFactory.getLog(ModelPathwayHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelPathway transientInstance) {
        log.debug("persisting ModelPathway instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelPathway persistentInstance) {
        log.debug("removing ModelPathway instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelPathway merge(ModelPathway detachedInstance) {
        log.debug("merging ModelPathway instance");
        try {
            ModelPathway result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelPathway findById( Integer id) {
        log.debug("getting ModelPathway instance with id: " + id);
        try {
            ModelPathway instance = entityManager.find(ModelPathway.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

