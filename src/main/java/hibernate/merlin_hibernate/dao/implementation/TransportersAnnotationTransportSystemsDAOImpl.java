package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.TransportersAnnotationTransportSystems;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationTransportSystemsDAO;


public class TransportersAnnotationTransportSystemsDAOImpl extends GenericDaoImpl<TransportersAnnotationTransportSystems> implements ITransportersAnnotationTransportSystemsDAO{

	public TransportersAnnotationTransportSystemsDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationTransportSystems.class);
		
	}
	public void addTransportersAnnotationTransportSystem(TransportersAnnotationTransportSystems transportersAnnotationTransportSystem) {
		super.save(transportersAnnotationTransportSystem);
		
	}

	public void addTransportersAnnotationTransportSystems(List<TransportersAnnotationTransportSystems> transportersAnnotationTransportSystems) {
		for (TransportersAnnotationTransportSystems transportersAnnotationTransportType: transportersAnnotationTransportSystems) {
			this.addTransportersAnnotationTransportSystem(transportersAnnotationTransportType);
		}
		
	}

	public List<TransportersAnnotationTransportSystems> getAllTransportersAnnotationTransportSystems() {
		return super.findAll();
	}

	public TransportersAnnotationTransportSystems getTransportersAnnotationTransportSystems(Integer id) {
		return super.findById(id);
	}
	public void removeTransportersAnnotationTransportSystem(TransportersAnnotationTransportSystems transportersAnnotationTransportSystem) {
		super.delete(transportersAnnotationTransportSystem);
	}


	public void removeTransportersAnnotationTransportSystems(List<TransportersAnnotationTransportSystems> transportersAnnotationTransportSystems) {
		for (TransportersAnnotationTransportSystems transportersAnnotationTransportSystem: transportersAnnotationTransportSystems) {
			this.removeTransportersAnnotationTransportSystem(transportersAnnotationTransportSystem);
		}
		
	}

	public void updateTransportersAnnotationTransportSystems(List<TransportersAnnotationTransportSystems> transportersAnnotationTransportSystems) {
		for (TransportersAnnotationTransportSystems transportersAnnotationTransportType: transportersAnnotationTransportSystems) {
			this.update(transportersAnnotationTransportType);
		}
		
	}

	public void updateTransportersAnnotationTransportSystem(TransportersAnnotationTransportSystems transportersAnnotationTransportSystem) {
		super.update(transportersAnnotationTransportSystem);
		

	}



}
