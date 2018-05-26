package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.CompartmentsAnnotationPsortReportsHasCompartments;
import hibernate.merlin_hibernate.dao.Interface.ICompartmentsAnnotationPsortReportsHasCompartmentsDAO;


public class CompartmentsAnnotationPsortReportsHasCompartmentsDAOImpl extends GenericDaoImpl<CompartmentsAnnotationPsortReportsHasCompartments> implements ICompartmentsAnnotationPsortReportsHasCompartmentsDAO{

	public CompartmentsAnnotationPsortReportsHasCompartmentsDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, CompartmentsAnnotationPsortReportsHasCompartments.class);
		
	}

	public void addCompartmentsAnnotationPsortReportsHasCompartment(CompartmentsAnnotationPsortReportsHasCompartments compartmentsAnnotationPsortReportsHasCompartments) {
		super.save(compartmentsAnnotationPsortReportsHasCompartments);
		
	}

	public void addCompartmentsAnnotationPsortReportsHasCompartments(List<CompartmentsAnnotationPsortReportsHasCompartments> compartmentsAnnotationPsortReportsHasCompartments) {
		for (CompartmentsAnnotationPsortReportsHasCompartments compartmentsAnnotationPsortReportsHasCompartment: compartmentsAnnotationPsortReportsHasCompartments) {
			this.addCompartmentsAnnotationPsortReportsHasCompartment(compartmentsAnnotationPsortReportsHasCompartment);
		}
		
	}

	public List<CompartmentsAnnotationPsortReportsHasCompartments> getAllCompartmentsAnnotationPsortReportsHasCompartments() {
		return super.findAll();
	}

	public CompartmentsAnnotationPsortReportsHasCompartments getCompartmentsAnnotationPsortReportsHasCompartment(Integer id) {
		return super.findById(id);
	}

	public void removeCompartmentsAnnotationPsortReportsHasCompartment(CompartmentsAnnotationPsortReportsHasCompartments compartmentsAnnotationPsortReportsHasCompartment) {
		super.delete(compartmentsAnnotationPsortReportsHasCompartment);
		
		
	}

	public void removeCompartmentsAnnotationPsortReportsHasCompartments(List<CompartmentsAnnotationPsortReportsHasCompartments> compartmentsAnnotationPsortReportsHasCompartments) {
		for (CompartmentsAnnotationPsortReportsHasCompartments compartmentsAnnotationPsortReportsHasCompartment: compartmentsAnnotationPsortReportsHasCompartments) {
			this.removeCompartmentsAnnotationPsortReportsHasCompartment(compartmentsAnnotationPsortReportsHasCompartment);
		}
		
	}

	public void updateCompartmentsAnnotationPsortReportsHasCompartments(List<CompartmentsAnnotationPsortReportsHasCompartments> compartmentsAnnotationPsortReportsHasCompartments) {
		for (CompartmentsAnnotationPsortReportsHasCompartments compartmentsAnnotationPsortReportsHasCompartment: compartmentsAnnotationPsortReportsHasCompartments) {
			this.update(compartmentsAnnotationPsortReportsHasCompartment);
		}
		
	}

	public void updateCompartmentsAnnotationPsortReportsHasCompartment(CompartmentsAnnotationPsortReportsHasCompartments compartmentsAnnotationPsortReportsHasCompartment) {
		super.update(compartmentsAnnotationPsortReportsHasCompartment);
		
	}


}
