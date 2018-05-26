package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.TransportersAnnotationMetabolites;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationMetabolitesDAO;


public class TransportersAnnotationMetabolitesDAOImpl extends GenericDaoImpl<TransportersAnnotationMetabolites> implements ITransportersAnnotationMetabolitesDAO{

	public TransportersAnnotationMetabolitesDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationMetabolites.class);

	}

	public void addTransportersAnnotationMetabolite(TransportersAnnotationMetabolites transportersAnnotationMetabolite) {
		super.save(transportersAnnotationMetabolite);
	}

	public void addTransportersAnnotationMetabolites(List<TransportersAnnotationMetabolites> transportersAnnotationMetabolites) {
		for (TransportersAnnotationMetabolites transportersAnnotationMetabolite: transportersAnnotationMetabolites) {
			this.addTransportersAnnotationMetabolite(transportersAnnotationMetabolite);
		}
		
	}

	public List<TransportersAnnotationMetabolites> getAllTransportersAnnotationMetabolites() {
		return super.findAll();
		
	}

	public TransportersAnnotationMetabolites getTransportersAnnotationMetabolite(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationMetabolite(TransportersAnnotationMetabolites transportersAnnotationMetabolite) {
		super.delete(transportersAnnotationMetabolite);
		
	}

	public void removeTransportersAnnotationMetabolites(List<TransportersAnnotationMetabolites> transportersAnnotationMetabolites) {
		for (TransportersAnnotationMetabolites transportersAnnotationMetabolite: transportersAnnotationMetabolites) {
			this.removeTransportersAnnotationMetabolite(transportersAnnotationMetabolite);
		}
		
	}

	public void updateTransportersAnnotationMetabolites(List<TransportersAnnotationMetabolites> transportersAnnotationMetabolites) {
		for (TransportersAnnotationMetabolites transportersAnnotationMetabolite: transportersAnnotationMetabolites) {
			this.update(transportersAnnotationMetabolite);
		}
		
	}

	public void updateTransportersAnnotationMetabolite(TransportersAnnotationMetabolites transportersAnnotationMetabolite) {
		super.update(transportersAnnotationMetabolite);
		
	}

}
