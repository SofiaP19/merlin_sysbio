package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.CompartmentsAnnotationPsortReports;
import hibernate.merlin_hibernate.dao.Interface.ICompartmentsAnnotationPsortReportsDAO;


public class CompartmentsAnnotationPsortReportsDAOImpl extends GenericDaoImpl<CompartmentsAnnotationPsortReports> implements ICompartmentsAnnotationPsortReportsDAO{

	public CompartmentsAnnotationPsortReportsDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, CompartmentsAnnotationPsortReports.class);
		
	}

	public void addCompartmentsAnnotationPsortReport(CompartmentsAnnotationPsortReports compartmentsAnnotationPsortReport) {
		super.save(compartmentsAnnotationPsortReport);
		
	}

	public void addCompartmentsAnnotationPsortReports(List<CompartmentsAnnotationPsortReports> compartmentsAnnotationPsortReports) {
		for (CompartmentsAnnotationPsortReports compartmentsAnnotationPsortReport: compartmentsAnnotationPsortReports) {
			this.addCompartmentsAnnotationPsortReport(compartmentsAnnotationPsortReport);
		}
		
	}

	public List<CompartmentsAnnotationPsortReports> getAllCompartmentsAnnotationPsortReports() {
		return super.findAll();
	}

	public CompartmentsAnnotationPsortReports getCompartmentsAnnotationPsortReport(Integer id) {
		return super.findById(id);
	}

	public void removeCompartmentsAnnotationPsortReport(CompartmentsAnnotationPsortReports compartmentsAnnotationPsortReport) {
		super.delete(compartmentsAnnotationPsortReport);
		
	}

	public void removeCompartmentsAnnotationPsortReports(List<CompartmentsAnnotationPsortReports> compartmentsAnnotationPsortReports) {
		for (CompartmentsAnnotationPsortReports compartmentsAnnotationPsortReport: compartmentsAnnotationPsortReports) {
			this.removeCompartmentsAnnotationPsortReport(compartmentsAnnotationPsortReport);
		}
		
	}

	public void updateCompartmentsAnnotationPsortReports(List<CompartmentsAnnotationPsortReports> compartmentsAnnotationPsortReports) {
		for (CompartmentsAnnotationPsortReports compartmentsAnnotationPsortReport: compartmentsAnnotationPsortReports) {
			this.update(compartmentsAnnotationPsortReport);
		}
		
	}

	public void updateCompartmentsAnnotationPsortReport(CompartmentsAnnotationPsortReports compartmentsAnnotationPsortReport) {
		super.update(compartmentsAnnotationPsortReport);
		
	}

}
