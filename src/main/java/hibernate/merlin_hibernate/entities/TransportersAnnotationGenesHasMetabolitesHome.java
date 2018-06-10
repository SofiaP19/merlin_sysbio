package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransportersAnnotationGenesHasMetabolites.
 * @see hibernate.merlin_hibernate.entities.TransportersAnnotationGenesHasMetabolites
 * @author Hibernate Tools
 */
@Stateless
public class TransportersAnnotationGenesHasMetabolitesHome {

    private static final Log log = LogFactory.getLog(TransportersAnnotationGenesHasMetabolitesHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(TransportersAnnotationGenesHasMetabolites transientInstance) {
        log.debug("persisting TransportersAnnotationGenesHasMetabolites instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(TransportersAnnotationGenesHasMetabolites persistentInstance) {
        log.debug("removing TransportersAnnotationGenesHasMetabolites instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public TransportersAnnotationGenesHasMetabolites merge(TransportersAnnotationGenesHasMetabolites detachedInstance) {
        log.debug("merging TransportersAnnotationGenesHasMetabolites instance");
        try {
            TransportersAnnotationGenesHasMetabolites result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public TransportersAnnotationGenesHasMetabolites findById( TransportersAnnotationGenesHasMetabolitesId id) {
        log.debug("getting TransportersAnnotationGenesHasMetabolites instance with id: " + id);
        try {
            TransportersAnnotationGenesHasMetabolites instance = entityManager.find(TransportersAnnotationGenesHasMetabolites.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

