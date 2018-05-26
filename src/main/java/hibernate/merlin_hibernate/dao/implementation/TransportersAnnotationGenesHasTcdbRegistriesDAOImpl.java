package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.TransportersAnnotationGenesHasTcdbRegistries;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationGenesHasTcdbRegistriesDAO;


public class TransportersAnnotationGenesHasTcdbRegistriesDAOImpl extends GenericDaoImpl<TransportersAnnotationGenesHasTcdbRegistries> implements ITransportersAnnotationGenesHasTcdbRegistriesDAO{

	public TransportersAnnotationGenesHasTcdbRegistriesDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationGenesHasTcdbRegistries.class);
	
	}

	public void addTransportersAnnotationGenesHasTcdbRegistry(TransportersAnnotationGenesHasTcdbRegistries transportersAnnotationGenesHasTcdbRegistry) {
		super.save(transportersAnnotationGenesHasTcdbRegistry);
		
	}

	public void addTransportersAnnotationGenesHasTcdbRegistries(List<TransportersAnnotationGenesHasTcdbRegistries> transportersAnnotationGenesHasTcdbRegistries) {
		for (TransportersAnnotationGenesHasTcdbRegistries transportersAnnotationGenesHasTcdbRegistry: transportersAnnotationGenesHasTcdbRegistries) {
			this.addTransportersAnnotationGenesHasTcdbRegistry(transportersAnnotationGenesHasTcdbRegistry);
		}
		
	}

	public List<TransportersAnnotationGenesHasTcdbRegistries> getAllTransportersAnnotationGenesHasTcdbRegistries() {
		return super.findAll();
	}

	public TransportersAnnotationGenesHasTcdbRegistries getTransportersAnnotationGenesHasTcdbRegistry(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationGenesHasTcdbRegistry(TransportersAnnotationGenesHasTcdbRegistries transportersAnnotationGenesHasTcdbRegistry) {
		super.delete(transportersAnnotationGenesHasTcdbRegistry);
		
	}

	public void removeTransportersAnnotationGenesHasTcdbRegistries(List<TransportersAnnotationGenesHasTcdbRegistries> transportersAnnotationGenesHasTcdbRegistries) {
		for (TransportersAnnotationGenesHasTcdbRegistries transportersAnnotationGenesHasTcdbRegistry: transportersAnnotationGenesHasTcdbRegistries) {
			this.removeTransportersAnnotationGenesHasTcdbRegistry(transportersAnnotationGenesHasTcdbRegistry);
		}
		
	}

	public void updateTransportersAnnotationGenesHasTcdbRegistries(List<TransportersAnnotationGenesHasTcdbRegistries> transportersAnnotationGenesHasTcdbRegistries) {
		for (TransportersAnnotationGenesHasTcdbRegistries transportersAnnotationGenesHasTcdbRegistry: transportersAnnotationGenesHasTcdbRegistries) {
			this.update(transportersAnnotationGenesHasTcdbRegistry);
		}
	}

	public void updateTransportersAnnotationGenesHasTcdbRegistry(TransportersAnnotationGenesHasTcdbRegistries transportersAnnotationGenesHasTcdbRegistry) {
		super.update(transportersAnnotationGenesHasTcdbRegistry);
		
	}

}
