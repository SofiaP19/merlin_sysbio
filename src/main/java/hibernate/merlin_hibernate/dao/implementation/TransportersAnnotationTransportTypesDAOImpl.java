package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.TransportersAnnotationTransportTypes;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationTransportTypesDAO;


public class TransportersAnnotationTransportTypesDAOImpl extends GenericDaoImpl<TransportersAnnotationTransportTypes> implements ITransportersAnnotationTransportTypesDAO {

	public TransportersAnnotationTransportTypesDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationTransportTypes.class);
		
	}

	public void addTransportersAnnotationTransportTypes(TransportersAnnotationTransportTypes transportersAnnotationTransportType) {
			super.save(transportersAnnotationTransportType);
		
	}

	public void addTransportersAnnotationTransportTypes(List<TransportersAnnotationTransportTypes> transportersAnnotationTransportTypes) {
		for (TransportersAnnotationTransportTypes transportersAnnotationTransportType: transportersAnnotationTransportTypes) {
			this.addTransportersAnnotationTransportTypes(transportersAnnotationTransportType);
		}
		
	}

	public List<TransportersAnnotationTransportTypes> getAllTransportersAnnotationTransportTypes() {
		return super.findAll();
	}

	public TransportersAnnotationTransportTypes getTransportersAnnotationTransportTypes(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationTransportTypes(TransportersAnnotationTransportTypes transportersAnnotationTransportType) {
		super.delete(transportersAnnotationTransportType);
		
	}

	public void removeTransportersAnnotationTransportTypes(List<TransportersAnnotationTransportTypes> transportersAnnotationTransportTypes) {
		for (TransportersAnnotationTransportTypes transportersAnnotationTransportType: transportersAnnotationTransportTypes) {
			this.removeTransportersAnnotationTransportTypes(transportersAnnotationTransportType);
		}
		
	}

	public void updateTransportersAnnotationTransportTypes(List<TransportersAnnotationTransportTypes> transportersAnnotationTransportTypes) {
		for (TransportersAnnotationTransportTypes transportersAnnotationTransportType: transportersAnnotationTransportTypes) {
			this.update(transportersAnnotationTransportType);
		}
		
	}

	public void updateTransportersAnnotationTransportTypes(TransportersAnnotationTransportTypes transportersAnnotationTransportType) {
		super.update(transportersAnnotationTransportType);
		
	}

}
