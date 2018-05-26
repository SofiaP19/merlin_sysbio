package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.TransportersAnnotationGenesHasMetabolites;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationGenesHasMetabolitesDAO;


public class TransportersAnnotationGenesHasMetabolitesDAOImpl extends GenericDaoImpl<TransportersAnnotationGenesHasMetabolites> implements ITransportersAnnotationGenesHasMetabolitesDAO{

	public TransportersAnnotationGenesHasMetabolitesDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationGenesHasMetabolites.class);

	}

	public void addTransportersAnnotationGenesHasMetabolite(TransportersAnnotationGenesHasMetabolites transportersAnnotationGenesHasMetabolite) {
		super.save(transportersAnnotationGenesHasMetabolite);
		
	}

	public void addTransportersAnnotationGenesHasMetabolites(List<TransportersAnnotationGenesHasMetabolites> transportersAnnotationGenesHasMetabolites) {
		for (TransportersAnnotationGenesHasMetabolites transportersAnnotationGenesHasMetabolite: transportersAnnotationGenesHasMetabolites) {
			this.addTransportersAnnotationGenesHasMetabolite(transportersAnnotationGenesHasMetabolite);
		}
		
	}

	public List<TransportersAnnotationGenesHasMetabolites> getAllTransportersAnnotationGenesHasMetabolites() {
		return super.findAll();
	}

	public TransportersAnnotationGenesHasMetabolites getTransportersAnnotationGenesHasMetabolite(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationGenesHasMetabolite(TransportersAnnotationGenesHasMetabolites transportersAnnotationGenesHasMetabolite) {
		super.delete(transportersAnnotationGenesHasMetabolite);
		
	}

	public void removeTransportersAnnotationGenesHasMetabolites(List<TransportersAnnotationGenesHasMetabolites> transportersAnnotationGenesHasMetabolites) {
		for (TransportersAnnotationGenesHasMetabolites transportersAnnotationGenesHasMetabolite: transportersAnnotationGenesHasMetabolites) {
			this.removeTransportersAnnotationGenesHasMetabolite(transportersAnnotationGenesHasMetabolite);
		}
		
	}

	public void updateTransportersAnnotationGenesHasMetabolites(List<TransportersAnnotationGenesHasMetabolites> transportersAnnotationGenesHasMetabolites) {
		for (TransportersAnnotationGenesHasMetabolites transportersAnnotationGenesHasMetabolite: transportersAnnotationGenesHasMetabolites) {
			this.update(transportersAnnotationGenesHasMetabolite);
		}
		
	}

	public void updateTransportersAnnotationGenesHasMetabolite(TransportersAnnotationGenesHasMetabolites transportersAnnotationGenesHasMetabolite) {
		super.update(transportersAnnotationGenesHasMetabolite);
		
	}

}
