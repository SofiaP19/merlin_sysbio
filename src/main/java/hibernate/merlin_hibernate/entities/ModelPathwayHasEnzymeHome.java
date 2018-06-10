package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelPathwayHasEnzyme.
 * @see hibernate.merlin_hibernate.entities.ModelPathwayHasEnzyme
 * @author Hibernate Tools
 */
@Stateless
public class ModelPathwayHasEnzymeHome {

    private static final Log log = LogFactory.getLog(ModelPathwayHasEnzymeHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelPathwayHasEnzyme transientInstance) {
        log.debug("persisting ModelPathwayHasEnzyme instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelPathwayHasEnzyme persistentInstance) {
        log.debug("removing ModelPathwayHasEnzyme instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelPathwayHasEnzyme merge(ModelPathwayHasEnzyme detachedInstance) {
        log.debug("merging ModelPathwayHasEnzyme instance");
        try {
            ModelPathwayHasEnzyme result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelPathwayHasEnzyme findById( ModelPathwayHasEnzymeId id) {
        log.debug("getting ModelPathwayHasEnzyme instance with id: " + id);
        try {
            ModelPathwayHasEnzyme instance = entityManager.find(ModelPathwayHasEnzyme.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

