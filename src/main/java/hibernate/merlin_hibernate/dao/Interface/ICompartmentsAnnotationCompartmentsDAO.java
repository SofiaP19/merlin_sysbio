package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.CompartmentsAnnotationCompartments;


public interface ICompartmentsAnnotationCompartmentsDAO {
	
	public void addCompartmentsAnnotationCompartment(CompartmentsAnnotationCompartments compartmentsAnnotationCompartment); 
	
	public void addCompartmentsAnnotationCompartments(List<CompartmentsAnnotationCompartments> compartmentsAnnotationCompartments); 
	
	public List<CompartmentsAnnotationCompartments> getAllCompartmentsAnnotationCompartments(); 
	
	public CompartmentsAnnotationCompartments getCompartmentsAnnotationCompartment(Integer id); 
	
	public void removeCompartmentsAnnotationCompartment(CompartmentsAnnotationCompartments compartmentsAnnotationCompartment); 
	
	public void removeCompartmentsAnnotationCompartments(List<CompartmentsAnnotationCompartments> compartmentsAnnotationCompartments); 
	
	public void updateCompartmentsAnnotationCompartments(List<CompartmentsAnnotationCompartments> compartmentsAnnotationCompartments); 
	
	public void updateCompartmentsAnnotationCompartment(CompartmentsAnnotationCompartments compartmentsAnnotationCompartment);
}
