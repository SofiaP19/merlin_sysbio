package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.TransportersAnnotationMetabolitesOntology;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationMetabolitesOntologyDAO;


public class TransportersAnnotationMetabolitesOntologyDAOImpl extends GenericDaoImpl<TransportersAnnotationMetabolitesOntology> implements ITransportersAnnotationMetabolitesOntologyDAO{

	public TransportersAnnotationMetabolitesOntologyDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationMetabolitesOntology.class);
		
	}

	public void addTransportersAnnotationMetabolitesOntology(TransportersAnnotationMetabolitesOntology transportersAnnotationMetabolitesOntology) {
		super.save(transportersAnnotationMetabolitesOntology);
		
	}

	public void addTTransportersAnnotationMetabolitesOntologyList(List<TransportersAnnotationMetabolitesOntology> transportersAnnotationMetabolitesOntologyList) {
		for (TransportersAnnotationMetabolitesOntology transportersAnnotationMetabolitesOntology: transportersAnnotationMetabolitesOntologyList) {
			this.addTransportersAnnotationMetabolitesOntology(transportersAnnotationMetabolitesOntology);
		}
		
	}

	public List<TransportersAnnotationMetabolitesOntology> getAllTransportersAnnotationMetabolitesOntology() {
		return super.findAll();
	}

	public TransportersAnnotationMetabolitesOntology getTransportersAnnotationMetabolitesOntology(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationMetabolitesOntology(TransportersAnnotationMetabolitesOntology transportersAnnotationMetabolitesOntology) {
		super.delete(transportersAnnotationMetabolitesOntology);
		
	}

	public void removeTransportersAnnotationMetabolitesOntologyList(List<TransportersAnnotationMetabolitesOntology> transportersAnnotationMetabolitesOntologyList) {
		for (TransportersAnnotationMetabolitesOntology transportersAnnotationMetabolitesOntology: transportersAnnotationMetabolitesOntologyList) {
			this.removeTransportersAnnotationMetabolitesOntology(transportersAnnotationMetabolitesOntology);
		}
		
	}

	public void updateTransportersAnnotationMetabolitesOntologyList(List<TransportersAnnotationMetabolitesOntology> transportersAnnotationMetabolitesOntologyList) {
		for (TransportersAnnotationMetabolitesOntology transportersAnnotationMetabolitesOntology: transportersAnnotationMetabolitesOntologyList) {
			this.update(transportersAnnotationMetabolitesOntology);
		}
		
	}

	public void updateTransportersAnnotationMetabolitesOntology(TransportersAnnotationMetabolitesOntology transportersAnnotationMetabolitesOntology) {
		super.update(transportersAnnotationMetabolitesOntology);
		
	}


}
