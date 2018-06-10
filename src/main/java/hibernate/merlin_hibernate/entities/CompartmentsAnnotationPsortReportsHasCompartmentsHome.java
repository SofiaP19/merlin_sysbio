package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CompartmentsAnnotationPsortReportsHasCompartments.
 * @see hibernate.merlin_hibernate.entities.CompartmentsAnnotationPsortReportsHasCompartments
 * @author Hibernate Tools
 */
@Stateless
public class CompartmentsAnnotationPsortReportsHasCompartmentsHome {

    private static final Log log = LogFactory.getLog(CompartmentsAnnotationPsortReportsHasCompartmentsHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(CompartmentsAnnotationPsortReportsHasCompartments transientInstance) {
        log.debug("persisting CompartmentsAnnotationPsortReportsHasCompartments instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(CompartmentsAnnotationPsortReportsHasCompartments persistentInstance) {
        log.debug("removing CompartmentsAnnotationPsortReportsHasCompartments instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public CompartmentsAnnotationPsortReportsHasCompartments merge(CompartmentsAnnotationPsortReportsHasCompartments detachedInstance) {
        log.debug("merging CompartmentsAnnotationPsortReportsHasCompartments instance");
        try {
            CompartmentsAnnotationPsortReportsHasCompartments result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public CompartmentsAnnotationPsortReportsHasCompartments findById( CompartmentsAnnotationPsortReportsHasCompartmentsId id) {
        log.debug("getting CompartmentsAnnotationPsortReportsHasCompartments instance with id: " + id);
        try {
            CompartmentsAnnotationPsortReportsHasCompartments instance = entityManager.find(CompartmentsAnnotationPsortReportsHasCompartments.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

