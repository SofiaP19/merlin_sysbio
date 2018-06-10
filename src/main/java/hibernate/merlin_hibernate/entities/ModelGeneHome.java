package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelGene.
 * @see hibernate.merlin_hibernate.entities.ModelGene
 * @author Hibernate Tools
 */
@Stateless
public class ModelGeneHome {

    private static final Log log = LogFactory.getLog(ModelGeneHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelGene transientInstance) {
        log.debug("persisting ModelGene instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelGene persistentInstance) {
        log.debug("removing ModelGene instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelGene merge(ModelGene detachedInstance) {
        log.debug("merging ModelGene instance");
        try {
            ModelGene result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelGene findById( Integer id) {
        log.debug("getting ModelGene instance with id: " + id);
        try {
            ModelGene instance = entityManager.find(ModelGene.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

