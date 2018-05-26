package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.TransportersAnnotationMetabolites;



public interface ITransportersAnnotationMetabolitesDAO {
	
	public void addTransportersAnnotationMetabolite(TransportersAnnotationMetabolites transportersAnnotationMetabolite); 
	
	public void addTransportersAnnotationMetabolites(List<TransportersAnnotationMetabolites> transportersAnnotationMetabolites); 
	
	public List<TransportersAnnotationMetabolites> getAllTransportersAnnotationMetabolites(); 
	
	public TransportersAnnotationMetabolites getTransportersAnnotationMetabolite(Integer id); 
	
	public void removeTransportersAnnotationMetabolite(TransportersAnnotationMetabolites transportersAnnotationMetabolite); 
	
	public void removeTransportersAnnotationMetabolites(List<TransportersAnnotationMetabolites> transportersAnnotationMetabolites); 
	
	public void updateTransportersAnnotationMetabolites(List<TransportersAnnotationMetabolites> transportersAnnotationMetabolites); 
	
	public void updateTransportersAnnotationMetabolite(TransportersAnnotationMetabolites transportersAnnotationMetabolite);

}
