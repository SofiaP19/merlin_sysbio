package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CompartmentsAnnotationPsortReports.
 * @see hibernate.merlin_hibernate.entities.CompartmentsAnnotationPsortReports
 * @author Hibernate Tools
 */
@Stateless
public class CompartmentsAnnotationPsortReportsHome {

    private static final Log log = LogFactory.getLog(CompartmentsAnnotationPsortReportsHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(CompartmentsAnnotationPsortReports transientInstance) {
        log.debug("persisting CompartmentsAnnotationPsortReports instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(CompartmentsAnnotationPsortReports persistentInstance) {
        log.debug("removing CompartmentsAnnotationPsortReports instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public CompartmentsAnnotationPsortReports merge(CompartmentsAnnotationPsortReports detachedInstance) {
        log.debug("merging CompartmentsAnnotationPsortReports instance");
        try {
            CompartmentsAnnotationPsortReports result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public CompartmentsAnnotationPsortReports findById( Integer id) {
        log.debug("getting CompartmentsAnnotationPsortReports instance with id: " + id);
        try {
            CompartmentsAnnotationPsortReports instance = entityManager.find(CompartmentsAnnotationPsortReports.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

