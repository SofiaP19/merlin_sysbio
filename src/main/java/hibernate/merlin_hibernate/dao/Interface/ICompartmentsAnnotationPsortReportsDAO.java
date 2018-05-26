package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.CompartmentsAnnotationPsortReports;



public interface ICompartmentsAnnotationPsortReportsDAO {
	
	public void addCompartmentsAnnotationPsortReport(CompartmentsAnnotationPsortReports compartmentsAnnotationPsortReport); 
	
	public void addCompartmentsAnnotationPsortReports(List<CompartmentsAnnotationPsortReports> compartmentsAnnotationPsortReports); 
	
	public List<CompartmentsAnnotationPsortReports> getAllCompartmentsAnnotationPsortReports(); 
	
	public CompartmentsAnnotationPsortReports getCompartmentsAnnotationPsortReport(Integer id); 
	
	public void removeCompartmentsAnnotationPsortReport(CompartmentsAnnotationPsortReports compartmentsAnnotationPsortReport); 
	
	public void removeCompartmentsAnnotationPsortReports(List<CompartmentsAnnotationPsortReports> compartmentsAnnotationPsortReports); 
	
	public void updateCompartmentsAnnotationPsortReports(List<CompartmentsAnnotationPsortReports> compartmentsAnnotationPsortReports); 
	
	public void updateCompartmentsAnnotationPsortReport(CompartmentsAnnotationPsortReports compartmentsAnnotationPsortReport);
}
