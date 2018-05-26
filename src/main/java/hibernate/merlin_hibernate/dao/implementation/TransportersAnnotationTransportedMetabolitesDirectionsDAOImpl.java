package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.TransportersAnnotationTransportedMetabolitesDirections;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationTransportedMetabolitesDirectionsDAO;


public class TransportersAnnotationTransportedMetabolitesDirectionsDAOImpl extends GenericDaoImpl<TransportersAnnotationTransportedMetabolitesDirections> implements ITransportersAnnotationTransportedMetabolitesDirectionsDAO{

	public TransportersAnnotationTransportedMetabolitesDirectionsDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationTransportedMetabolitesDirections.class);
		
	}

	public void addTransportersAnnotationTransportedMetabolitesDirection(
			TransportersAnnotationTransportedMetabolitesDirections transportersAnnotationTransportedMetabolitesDirection) {
		super.save(transportersAnnotationTransportedMetabolitesDirection);
		
	}

	public void addTransportersAnnotationTransportedMetabolitesDirections(List<TransportersAnnotationTransportedMetabolitesDirections> transportersAnnotationTransportedMetabolitesDirections) {
		for (TransportersAnnotationTransportedMetabolitesDirections transportersAnnotationTransportType: transportersAnnotationTransportedMetabolitesDirections) {
			this.addTransportersAnnotationTransportedMetabolitesDirection(transportersAnnotationTransportType);
		}
		
	}

	public List<TransportersAnnotationTransportedMetabolitesDirections> getAllTransportersAnnotationTransportedMetabolitesDirections() {
		return super.findAll();
	}

	public TransportersAnnotationTransportedMetabolitesDirections getTransportersAnnotationTransportedMetabolitesDirections(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationTransportedMetabolitesDirection(TransportersAnnotationTransportedMetabolitesDirections transportersAnnotationTransportedMetabolitesDirection) {
		super.delete(transportersAnnotationTransportedMetabolitesDirection);
		
	}

	public void removeTransportersAnnotationTransportedMetabolitesDirections(List<TransportersAnnotationTransportedMetabolitesDirections> transportersAnnotationTransportedMetabolitesDirections) {
		for (TransportersAnnotationTransportedMetabolitesDirections transportersAnnotationTransportedMetabolitesDirection: transportersAnnotationTransportedMetabolitesDirections) {
			this.removeTransportersAnnotationTransportedMetabolitesDirection(transportersAnnotationTransportedMetabolitesDirection);
		}
		
	}

	public void updateTransportersAnnotationTransportedMetabolitesDirections(List<TransportersAnnotationTransportedMetabolitesDirections> transportersAnnotationTransportedMetabolitesDirections) {
		for (TransportersAnnotationTransportedMetabolitesDirections transportersAnnotationTransportedMetabolitesDirection: transportersAnnotationTransportedMetabolitesDirections) {
			this.update(transportersAnnotationTransportedMetabolitesDirection);
		}
		
	}

	public void updateTransportersAnnotationTransportedMetabolitesDirection(TransportersAnnotationTransportedMetabolitesDirections transportersAnnotationTransportedMetabolitesDirection) {
		super.update(transportersAnnotationTransportedMetabolitesDirection);
		
	}

}