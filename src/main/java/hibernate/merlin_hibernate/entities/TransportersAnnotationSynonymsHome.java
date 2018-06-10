package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransportersAnnotationSynonyms.
 * @see hibernate.merlin_hibernate.entities.TransportersAnnotationSynonyms
 * @author Hibernate Tools
 */
@Stateless
public class TransportersAnnotationSynonymsHome {

    private static final Log log = LogFactory.getLog(TransportersAnnotationSynonymsHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(TransportersAnnotationSynonyms transientInstance) {
        log.debug("persisting TransportersAnnotationSynonyms instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(TransportersAnnotationSynonyms persistentInstance) {
        log.debug("removing TransportersAnnotationSynonyms instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public TransportersAnnotationSynonyms merge(TransportersAnnotationSynonyms detachedInstance) {
        log.debug("merging TransportersAnnotationSynonyms instance");
        try {
            TransportersAnnotationSynonyms result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public TransportersAnnotationSynonyms findById( Integer id) {
        log.debug("getting TransportersAnnotationSynonyms instance with id: " + id);
        try {
            TransportersAnnotationSynonyms instance = entityManager.find(TransportersAnnotationSynonyms.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

