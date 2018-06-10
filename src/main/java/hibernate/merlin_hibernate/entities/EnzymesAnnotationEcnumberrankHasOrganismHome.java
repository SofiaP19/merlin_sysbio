package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class EnzymesAnnotationEcnumberrankHasOrganism.
 * @see hibernate.merlin_hibernate.entities.EnzymesAnnotationEcnumberrankHasOrganism
 * @author Hibernate Tools
 */
@Stateless
public class EnzymesAnnotationEcnumberrankHasOrganismHome {

    private static final Log log = LogFactory.getLog(EnzymesAnnotationEcnumberrankHasOrganismHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(EnzymesAnnotationEcnumberrankHasOrganism transientInstance) {
        log.debug("persisting EnzymesAnnotationEcnumberrankHasOrganism instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(EnzymesAnnotationEcnumberrankHasOrganism persistentInstance) {
        log.debug("removing EnzymesAnnotationEcnumberrankHasOrganism instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public EnzymesAnnotationEcnumberrankHasOrganism merge(EnzymesAnnotationEcnumberrankHasOrganism detachedInstance) {
        log.debug("merging EnzymesAnnotationEcnumberrankHasOrganism instance");
        try {
            EnzymesAnnotationEcnumberrankHasOrganism result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public EnzymesAnnotationEcnumberrankHasOrganism findById( EnzymesAnnotationEcnumberrankHasOrganismId id) {
        log.debug("getting EnzymesAnnotationEcnumberrankHasOrganism instance with id: " + id);
        try {
            EnzymesAnnotationEcnumberrankHasOrganism instance = entityManager.find(EnzymesAnnotationEcnumberrankHasOrganism.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

