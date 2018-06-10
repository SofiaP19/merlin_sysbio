package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransportersAnnotationTcNumbersHasTransportSystems.
 * @see hibernate.merlin_hibernate.entities.TransportersAnnotationTcNumbersHasTransportSystems
 * @author Hibernate Tools
 */
@Stateless
public class TransportersAnnotationTcNumbersHasTransportSystemsHome {

    private static final Log log = LogFactory.getLog(TransportersAnnotationTcNumbersHasTransportSystemsHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(TransportersAnnotationTcNumbersHasTransportSystems transientInstance) {
        log.debug("persisting TransportersAnnotationTcNumbersHasTransportSystems instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(TransportersAnnotationTcNumbersHasTransportSystems persistentInstance) {
        log.debug("removing TransportersAnnotationTcNumbersHasTransportSystems instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public TransportersAnnotationTcNumbersHasTransportSystems merge(TransportersAnnotationTcNumbersHasTransportSystems detachedInstance) {
        log.debug("merging TransportersAnnotationTcNumbersHasTransportSystems instance");
        try {
            TransportersAnnotationTcNumbersHasTransportSystems result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public TransportersAnnotationTcNumbersHasTransportSystems findById( TransportersAnnotationTcNumbersHasTransportSystemsId id) {
        log.debug("getting TransportersAnnotationTcNumbersHasTransportSystems instance with id: " + id);
        try {
            TransportersAnnotationTcNumbersHasTransportSystems instance = entityManager.find(TransportersAnnotationTcNumbersHasTransportSystems.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

