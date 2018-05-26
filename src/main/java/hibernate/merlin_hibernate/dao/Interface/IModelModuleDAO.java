package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelModule;


public interface IModelModuleDAO {

	public void addModelModule(ModelModule modelModule); 
	
	public void addModelModuleList(List<ModelModule> modelModuleList); 
	
	public List<ModelModule> getAllModelModule(); 
	
	public ModelModule getModelModule(Integer id); 
	
	public void removeModelModule(ModelModule modelModule); 
	
	public void removeModelModuleList(List<ModelModule> modelModuleList); 
	
	public void updateModelModuleList(List<ModelModule> modelModuleList); 
	
	public void updateModelModule(ModelModule modelModule);
}
