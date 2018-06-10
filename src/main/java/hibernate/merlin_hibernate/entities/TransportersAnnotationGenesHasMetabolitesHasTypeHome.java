package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransportersAnnotationGenesHasMetabolitesHasType.
 * @see hibernate.merlin_hibernate.entities.TransportersAnnotationGenesHasMetabolitesHasType
 * @author Hibernate Tools
 */
@Stateless
public class TransportersAnnotationGenesHasMetabolitesHasTypeHome {

    private static final Log log = LogFactory.getLog(TransportersAnnotationGenesHasMetabolitesHasTypeHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(TransportersAnnotationGenesHasMetabolitesHasType transientInstance) {
        log.debug("persisting TransportersAnnotationGenesHasMetabolitesHasType instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(TransportersAnnotationGenesHasMetabolitesHasType persistentInstance) {
        log.debug("removing TransportersAnnotationGenesHasMetabolitesHasType instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public TransportersAnnotationGenesHasMetabolitesHasType merge(TransportersAnnotationGenesHasMetabolitesHasType detachedInstance) {
        log.debug("merging TransportersAnnotationGenesHasMetabolitesHasType instance");
        try {
            TransportersAnnotationGenesHasMetabolitesHasType result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public TransportersAnnotationGenesHasMetabolitesHasType findById( TransportersAnnotationGenesHasMetabolitesHasTypeId id) {
        log.debug("getting TransportersAnnotationGenesHasMetabolitesHasType instance with id: " + id);
        try {
            TransportersAnnotationGenesHasMetabolitesHasType instance = entityManager.find(TransportersAnnotationGenesHasMetabolitesHasType.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

