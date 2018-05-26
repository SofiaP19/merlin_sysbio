package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.TransportersAnnotationGeneralEquation;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationGeneralEquationDAO;


public class TransportersAnnotationGeneralEquationDAOImpl extends GenericDaoImpl<TransportersAnnotationGeneralEquation> implements ITransportersAnnotationGeneralEquationDAO{

	public TransportersAnnotationGeneralEquationDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationGeneralEquation.class);

	}

	public void addTransportersAnnotationGeneralEquation(TransportersAnnotationGeneralEquation transportersAnnotationGeneralEquation) {
		super.save(transportersAnnotationGeneralEquation);
		
	}

	public void addTransportersAnnotationGeneralEquations(List<TransportersAnnotationGeneralEquation> transportersAnnotationGeneralEquations) {
		for (TransportersAnnotationGeneralEquation transportersAnnotationGeneralEquation: transportersAnnotationGeneralEquations) {
			this.addTransportersAnnotationGeneralEquation(transportersAnnotationGeneralEquation);
		}
		
	}

	public List<TransportersAnnotationGeneralEquation> getAllTransportersAnnotationGeneralEquations() {
		return super.findAll();
	}

	public TransportersAnnotationGeneralEquation getTransportersAnnotationGeneralEquation(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationGeneralEquation(TransportersAnnotationGeneralEquation transportersAnnotationGeneralEquation) {
		super.delete(transportersAnnotationGeneralEquation);
		
	}

	public void removeTransportersAnnotationGeneralEquations(List<TransportersAnnotationGeneralEquation> transportersAnnotationGeneralEquations) {
		for (TransportersAnnotationGeneralEquation transportersAnnotationGeneralEquation: transportersAnnotationGeneralEquations) {
			this.removeTransportersAnnotationGeneralEquation(transportersAnnotationGeneralEquation);
		}
		
	}

	public void updateTransportersAnnotationGeneralEquations(List<TransportersAnnotationGeneralEquation> transportersAnnotationGeneralEquations) {
		for (TransportersAnnotationGeneralEquation transportersAnnotationGeneralEquation: transportersAnnotationGeneralEquations) {
			this.update(transportersAnnotationGeneralEquation);
		}
		
	}

	public void updateTransportersAnnotationGeneralEquation(TransportersAnnotationGeneralEquation transportersAnnotationGeneralEquation) {
		super.update(transportersAnnotationGeneralEquation);
		
	}

}
