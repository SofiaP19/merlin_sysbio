package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelRiFunction;



public interface IModelRiFunctionDAO {

	public void addModelRiFunction(ModelRiFunction modelRiFunction); 
	
	public void addModelRiFunctionList(List<ModelRiFunction> modelRiFunctionList); 
	
	public List<ModelRiFunction> getAllModelRiFunction(); 
	
	public ModelRiFunction getModelRiFunction(Integer id); 
	
	public void removeModelRiFunction(ModelRiFunction modelRiFunction); 
	
	public void removeModelRiFunctionList(List<ModelRiFunction> modelRiFunctionList); 
	
	public void updateModelRiFunctionList(List<ModelRiFunction> modelRiFunctionList); 
	
	public void updateModelRiFunction(ModelRiFunction modelRiFunction);
}
