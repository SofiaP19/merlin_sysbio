package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelAliases.
 * @see hibernate.merlin_hibernate.entities.ModelAliases
 * @author Hibernate Tools
 */
@Stateless
public class ModelAliasesHome {

    private static final Log log = LogFactory.getLog(ModelAliasesHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelAliases transientInstance) {
        log.debug("persisting ModelAliases instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelAliases persistentInstance) {
        log.debug("removing ModelAliases instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelAliases merge(ModelAliases detachedInstance) {
        log.debug("merging ModelAliases instance");
        try {
            ModelAliases result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelAliases findById( ModelAliasesId id) {
        log.debug("getting ModelAliases instance with id: " + id);
        try {
            ModelAliases instance = entityManager.find(ModelAliases.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

