package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class EnzymesAnnotationFastasequence.
 * @see hibernate.merlin_hibernate.entities.EnzymesAnnotationFastasequence
 * @author Hibernate Tools
 */
@Stateless
public class EnzymesAnnotationFastasequenceHome {

    private static final Log log = LogFactory.getLog(EnzymesAnnotationFastasequenceHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(EnzymesAnnotationFastasequence transientInstance) {
        log.debug("persisting EnzymesAnnotationFastasequence instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(EnzymesAnnotationFastasequence persistentInstance) {
        log.debug("removing EnzymesAnnotationFastasequence instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public EnzymesAnnotationFastasequence merge(EnzymesAnnotationFastasequence detachedInstance) {
        log.debug("merging EnzymesAnnotationFastasequence instance");
        try {
            EnzymesAnnotationFastasequence result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public EnzymesAnnotationFastasequence findById( EnzymesAnnotationFastasequenceId id) {
        log.debug("getting EnzymesAnnotationFastasequence instance with id: " + id);
        try {
            EnzymesAnnotationFastasequence instance = entityManager.find(EnzymesAnnotationFastasequence.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

