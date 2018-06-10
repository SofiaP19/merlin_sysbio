package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransportersAnnotationTcdbRegistries.
 * @see hibernate.merlin_hibernate.entities.TransportersAnnotationTcdbRegistries
 * @author Hibernate Tools
 */
@Stateless
public class TransportersAnnotationTcdbRegistriesHome {

    private static final Log log = LogFactory.getLog(TransportersAnnotationTcdbRegistriesHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(TransportersAnnotationTcdbRegistries transientInstance) {
        log.debug("persisting TransportersAnnotationTcdbRegistries instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(TransportersAnnotationTcdbRegistries persistentInstance) {
        log.debug("removing TransportersAnnotationTcdbRegistries instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public TransportersAnnotationTcdbRegistries merge(TransportersAnnotationTcdbRegistries detachedInstance) {
        log.debug("merging TransportersAnnotationTcdbRegistries instance");
        try {
            TransportersAnnotationTcdbRegistries result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public TransportersAnnotationTcdbRegistries findById( TransportersAnnotationTcdbRegistriesId id) {
        log.debug("getting TransportersAnnotationTcdbRegistries instance with id: " + id);
        try {
            TransportersAnnotationTcdbRegistries instance = entityManager.find(TransportersAnnotationTcdbRegistries.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

