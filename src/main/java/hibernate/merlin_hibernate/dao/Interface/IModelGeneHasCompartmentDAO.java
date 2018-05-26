package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelGeneHasCompartment;



public interface IModelGeneHasCompartmentDAO {
	
	public void addModelGeneHasCompartment(ModelGeneHasCompartment modelGeneHasCompartment); 
	
	public void addModelGeneHasCompartmentList(List<ModelGeneHasCompartment> modelGeneHasCompartmentList); 
	
	public List<ModelGeneHasCompartment> getAllModelGeneHasCompartment(); 
	
	public ModelGeneHasCompartment getModelGeneHasCompartment(Integer id); 
	
	public void removeModelGeneHasCompartment(ModelGeneHasCompartment modelGeneHasCompartment); 
	
	public void removeModelGeneHasCompartmentList(List<ModelGeneHasCompartment> modelGeneHasCompartmentList); 
	
	public void updateModelGeneHasCompartmentList(List<ModelGeneHasCompartment> modelGeneHasCompartmentList); 
	
	public void updateModelGeneHasCompartment(ModelGeneHasCompartment modelGeneHasCompartment);

}
