package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelCompartment;



public interface IModelCompartmentDAO {
	
	public void addModelCompartment(ModelCompartment modelCompartment); 
	
	public void addModelCompartmentList(List<ModelCompartment> modelCompartmentList); 
	
	public List<ModelCompartment> getAllModelCompartment(); 
	
	public ModelCompartment getModelCompartment(Integer id); 
	
	public void removeModelCompartment(ModelCompartment modelCompartment); 
	
	public void removeModelCompartmentList(List<ModelCompartment> modelCompartmentList); 
	
	public void updateModelCompartmentList(List<ModelCompartment> modelCompartmentList); 
	
	public void updateModelCompartment(ModelCompartment modelCompartment);
}
