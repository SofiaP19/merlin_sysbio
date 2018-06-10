package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelMetabolicRegulation.
 * @see hibernate.merlin_hibernate.entities.ModelMetabolicRegulation
 * @author Hibernate Tools
 */
@Stateless
public class ModelMetabolicRegulationHome {

    private static final Log log = LogFactory.getLog(ModelMetabolicRegulationHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelMetabolicRegulation transientInstance) {
        log.debug("persisting ModelMetabolicRegulation instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelMetabolicRegulation persistentInstance) {
        log.debug("removing ModelMetabolicRegulation instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelMetabolicRegulation merge(ModelMetabolicRegulation detachedInstance) {
        log.debug("merging ModelMetabolicRegulation instance");
        try {
            ModelMetabolicRegulation result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelMetabolicRegulation findById( ModelMetabolicRegulationId id) {
        log.debug("getting ModelMetabolicRegulation instance with id: " + id);
        try {
            ModelMetabolicRegulation instance = entityManager.find(ModelMetabolicRegulation.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

