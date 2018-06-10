package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 17:00:07 by Hibernate Tools 5.2.8.Final


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransportersAnnotationTaxonomyData.
 * @see hibernate.merlin_hibernate.entities.TransportersAnnotationTaxonomyData
 * @author Hibernate Tools
 */
@Stateless
public class TransportersAnnotationTaxonomyDataHome {

    private static final Log log = LogFactory.getLog(TransportersAnnotationTaxonomyDataHome.class);

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(TransportersAnnotationTaxonomyData transientInstance) {
        log.debug("persisting TransportersAnnotationTaxonomyData instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(TransportersAnnotationTaxonomyData persistentInstance) {
        log.debug("removing TransportersAnnotationTaxonomyData instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public TransportersAnnotationTaxonomyData merge(TransportersAnnotationTaxonomyData detachedInstance) {
        log.debug("merging TransportersAnnotationTaxonomyData instance");
        try {
            TransportersAnnotationTaxonomyData result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public TransportersAnnotationTaxonomyData findById( Integer id) {
        log.debug("getting TransportersAnnotationTaxonomyData instance with id: " + id);
        try {
            TransportersAnnotationTaxonomyData instance = entityManager.find(TransportersAnnotationTaxonomyData.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

