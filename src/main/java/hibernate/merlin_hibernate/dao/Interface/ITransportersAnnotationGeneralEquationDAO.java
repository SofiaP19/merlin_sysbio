package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.TransportersAnnotationGeneralEquation;


public interface ITransportersAnnotationGeneralEquationDAO {
	
	public void addTransportersAnnotationGeneralEquation(TransportersAnnotationGeneralEquation transportersAnnotationGeneralEquation); 
	
	public void addTransportersAnnotationGeneralEquations(List<TransportersAnnotationGeneralEquation> transportersAnnotationGeneralEquations); 
	
	public List<TransportersAnnotationGeneralEquation> getAllTransportersAnnotationGeneralEquations(); 
	
	public TransportersAnnotationGeneralEquation getTransportersAnnotationGeneralEquation(Integer id); 
	
	public void removeTransportersAnnotationGeneralEquation(TransportersAnnotationGeneralEquation transportersAnnotationGeneralEquation); 
	
	public void removeTransportersAnnotationGeneralEquations(List<TransportersAnnotationGeneralEquation> transportersAnnotationGeneralEquations); 
	
	public void updateTransportersAnnotationGeneralEquations(List<TransportersAnnotationGeneralEquation> transportersAnnotationGeneralEquations); 
	
	public void updateTransportersAnnotationGeneralEquation(TransportersAnnotationGeneralEquation transportersAnnotationGeneralEquation);

}