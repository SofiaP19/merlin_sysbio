package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.TransportersAnnotationDirections;


public interface ITransportersAnnotationDirectionsDAO {
	
	public void addTransportersAnnotationDirection(TransportersAnnotationDirections transportersAnnotationDirection); 
	
	public void addTransportersAnnotationDirections(List<TransportersAnnotationDirections> transportersAnnotationDirections); 
	
	public List<TransportersAnnotationDirections> getAllTransportersAnnotationDirections(); 
	
	public TransportersAnnotationDirections getTransportersAnnotationDirection(Integer id); 
	
	public void removeTransportersAnnotationDirection(TransportersAnnotationDirections transportersAnnotationDirection); 
	
	public void removeTransportersAnnotationDirections(List<TransportersAnnotationDirections> transportersAnnotationDirections); 
	
	public void updateTransportersAnnotationDirections(List<TransportersAnnotationDirections> transportersAnnotationDirections); 
	
	public void updateTransportersAnnotationDirection(TransportersAnnotationDirections transportersAnnotationDirection);
}
