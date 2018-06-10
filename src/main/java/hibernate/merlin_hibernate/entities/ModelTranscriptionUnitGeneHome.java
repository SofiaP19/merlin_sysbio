package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ModelTranscriptionUnitGene.
 * @see hibernate.merlin_hibernate.entities.ModelTranscriptionUnitGene
 * @author Hibernate Tools
 */
@Stateless
public class ModelTranscriptionUnitGeneHome {

    private static final Log log = LogFactory.getLog(ModelTranscriptionUnitGeneHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(ModelTranscriptionUnitGene transientInstance) {
        log.debug("persisting ModelTranscriptionUnitGene instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(ModelTranscriptionUnitGene persistentInstance) {
        log.debug("removing ModelTranscriptionUnitGene instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public ModelTranscriptionUnitGene merge(ModelTranscriptionUnitGene detachedInstance) {
        log.debug("merging ModelTranscriptionUnitGene instance");
        try {
            ModelTranscriptionUnitGene result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ModelTranscriptionUnitGene findById( ModelTranscriptionUnitGeneId id) {
        log.debug("getting ModelTranscriptionUnitGene instance with id: " + id);
        try {
            ModelTranscriptionUnitGene instance = entityManager.find(ModelTranscriptionUnitGene.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

