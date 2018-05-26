package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.CompartmentsAnnotationCompartments;
import hibernate.merlin_hibernate.dao.Interface.ICompartmentsAnnotationCompartmentsDAO;


public class CompartmentsAnnotationCompartmentsDAOImpl extends GenericDaoImpl<CompartmentsAnnotationCompartments> implements ICompartmentsAnnotationCompartmentsDAO{

	public CompartmentsAnnotationCompartmentsDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, CompartmentsAnnotationCompartments.class);
		
	}

	public void addCompartmentsAnnotationCompartment(CompartmentsAnnotationCompartments CompartmentsAnnotationCompartment) {
		super.save(CompartmentsAnnotationCompartment);
		
	}

	public void addCompartmentsAnnotationCompartments(List<CompartmentsAnnotationCompartments> compartmentsAnnotationCompartments) {
		for (CompartmentsAnnotationCompartments compartmentsAnnotationCompartment: compartmentsAnnotationCompartments) {
			this.addCompartmentsAnnotationCompartment(compartmentsAnnotationCompartment);
		}
		
	}

	public List<CompartmentsAnnotationCompartments> getAllCompartmentsAnnotationCompartments() {
		return super.findAll();
	}

	public CompartmentsAnnotationCompartments getCompartmentsAnnotationCompartment(Integer id) {
		return super.findById(id);
	}

	public void removeCompartmentsAnnotationCompartment(CompartmentsAnnotationCompartments compartmentsAnnotationCompartment) {
		super.delete(compartmentsAnnotationCompartment);
		
	}

	public void removeCompartmentsAnnotationCompartments(List<CompartmentsAnnotationCompartments> compartmentsAnnotationCompartments) {
		for (CompartmentsAnnotationCompartments compartmentsAnnotationCompartment: compartmentsAnnotationCompartments) {
			this.removeCompartmentsAnnotationCompartment(compartmentsAnnotationCompartment);
		}
		
	}

	public void updateCompartmentsAnnotationCompartments(List<CompartmentsAnnotationCompartments> compartmentsAnnotationCompartments) {
		for (CompartmentsAnnotationCompartments compartmentsAnnotationCompartment: compartmentsAnnotationCompartments) {
			this.update(compartmentsAnnotationCompartment);
		}
		
	}

	public void updateCompartmentsAnnotationCompartment(CompartmentsAnnotationCompartments compartmentsAnnotationCompartment) {
		super.update(compartmentsAnnotationCompartment);
		
	}

}
