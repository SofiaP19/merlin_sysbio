package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.TransportersAnnotationDirections;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationDirectionsDAO;


public class TransportersAnnotationDirectionsDAOImpl extends GenericDaoImpl<TransportersAnnotationDirections> implements ITransportersAnnotationDirectionsDAO {

	public TransportersAnnotationDirectionsDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationDirections.class);

	}

	public void addTransportersAnnotationDirection(TransportersAnnotationDirections transportersAnnotationDirection) {
		super.save(transportersAnnotationDirection);
		
	}

	public void addTransportersAnnotationDirections(List<TransportersAnnotationDirections> transportersAnnotationDirections) {
		for (TransportersAnnotationDirections transportersAnnotationDirection: transportersAnnotationDirections) {
			this.addTransportersAnnotationDirection(transportersAnnotationDirection);
		}
		
	}

	public List<TransportersAnnotationDirections> getAllTransportersAnnotationDirections() {
		return super.findAll();
	}

	public TransportersAnnotationDirections getTransportersAnnotationDirection(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationDirection(TransportersAnnotationDirections transportersAnnotationDirection) {
		super.delete(transportersAnnotationDirection);
		
	}

	public void removeTransportersAnnotationDirections(List<TransportersAnnotationDirections> transportersAnnotationDirections) {
		for (TransportersAnnotationDirections transportersAnnotationDirection: transportersAnnotationDirections) {
			this.removeTransportersAnnotationDirection(transportersAnnotationDirection);
		}	
		
	}

	public void updateTransportersAnnotationDirections(List<TransportersAnnotationDirections> transportersAnnotationDirections) {
		for (TransportersAnnotationDirections transportersAnnotationDirection: transportersAnnotationDirections) {
			this.update(transportersAnnotationDirection);
		}
		
	}

	public void updateTransportersAnnotationDirection(TransportersAnnotationDirections transportersAnnotationDirection) {
		super.update(transportersAnnotationDirection);
		
	}

}
