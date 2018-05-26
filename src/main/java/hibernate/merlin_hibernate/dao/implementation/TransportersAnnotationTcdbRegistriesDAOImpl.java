package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.TransportersAnnotationTcdbRegistries;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationTcdbRegistriesDAO;

public class TransportersAnnotationTcdbRegistriesDAOImpl extends GenericDaoImpl<TransportersAnnotationTcdbRegistries> implements ITransportersAnnotationTcdbRegistriesDAO{

	public TransportersAnnotationTcdbRegistriesDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationTcdbRegistries.class);

	}

	public void addTransportersAnnotationTcdbRegistry(TransportersAnnotationTcdbRegistries transportersAnnotationTcdbRegistry) {
		super.save(transportersAnnotationTcdbRegistry);
		
	}

	public void addTransportersAnnotationTcdbRegistries(List<TransportersAnnotationTcdbRegistries> transportersAnnotationTcdbRegistries) {
		for (TransportersAnnotationTcdbRegistries transportersAnnotationTcdbRegistry: transportersAnnotationTcdbRegistries) {
			this.addTransportersAnnotationTcdbRegistry(transportersAnnotationTcdbRegistry);
		}
		
	}

	public List<TransportersAnnotationTcdbRegistries> getAllTransportersAnnotationTcdbRegistries() {
		return super.findAll();
		
	}
	public TransportersAnnotationTcdbRegistries getTransportersAnnotationTcdbRegistry(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationTcdbRegistry(TransportersAnnotationTcdbRegistries transportersAnnotationTcdbRegistry) {
		super.delete(transportersAnnotationTcdbRegistry);

	}

	public void removeTransportersAnnotationTcdbRegistries(List<TransportersAnnotationTcdbRegistries> transportersAnnotationTcdbRegistries) {
		for (TransportersAnnotationTcdbRegistries transportersAnnotationTcdbRegistry: transportersAnnotationTcdbRegistries) {
			this.removeTransportersAnnotationTcdbRegistry(transportersAnnotationTcdbRegistry);
		}
		
	}

	public void updateTransportersAnnotationTcdbRegistries(List<TransportersAnnotationTcdbRegistries> transportersAnnotationTcdbRegistries) {
		for (TransportersAnnotationTcdbRegistries transportersAnnotationTcdbRegistry: transportersAnnotationTcdbRegistries) {
			this.update(transportersAnnotationTcdbRegistry);
		}
	}

	public void updateTransportersAnnotationTcdbRegistry(TransportersAnnotationTcdbRegistries transportersAnnotationTcdbRegistry) {
		super.update(transportersAnnotationTcdbRegistry);
		
		
		
	}


}
