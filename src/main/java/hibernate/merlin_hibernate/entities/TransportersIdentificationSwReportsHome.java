package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransportersIdentificationSwReports.
 * @see hibernate.merlin_hibernate.entities.TransportersIdentificationSwReports
 * @author Hibernate Tools
 */
@Stateless
public class TransportersIdentificationSwReportsHome {

    private static final Log log = LogFactory.getLog(TransportersIdentificationSwReportsHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(TransportersIdentificationSwReports transientInstance) {
        log.debug("persisting TransportersIdentificationSwReports instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(TransportersIdentificationSwReports persistentInstance) {
        log.debug("removing TransportersIdentificationSwReports instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public TransportersIdentificationSwReports merge(TransportersIdentificationSwReports detachedInstance) {
        log.debug("merging TransportersIdentificationSwReports instance");
        try {
            TransportersIdentificationSwReports result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public TransportersIdentificationSwReports findById( Integer id) {
        log.debug("getting TransportersIdentificationSwReports instance with id: " + id);
        try {
            TransportersIdentificationSwReports instance = entityManager.find(TransportersIdentificationSwReports.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

