package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransportersAnnotationMetabolites.
 * @see hibernate.merlin_hibernate.entities.TransportersAnnotationMetabolites
 * @author Hibernate Tools
 */
@Stateless
public class TransportersAnnotationMetabolitesHome {

    private static final Log log = LogFactory.getLog(TransportersAnnotationMetabolitesHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(TransportersAnnotationMetabolites transientInstance) {
        log.debug("persisting TransportersAnnotationMetabolites instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(TransportersAnnotationMetabolites persistentInstance) {
        log.debug("removing TransportersAnnotationMetabolites instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public TransportersAnnotationMetabolites merge(TransportersAnnotationMetabolites detachedInstance) {
        log.debug("merging TransportersAnnotationMetabolites instance");
        try {
            TransportersAnnotationMetabolites result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public TransportersAnnotationMetabolites findById( Integer id) {
        log.debug("getting TransportersAnnotationMetabolites instance with id: " + id);
        try {
            TransportersAnnotationMetabolites instance = entityManager.find(TransportersAnnotationMetabolites.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

